package com.codegym.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Reading and writing to a file: CodeGym

*/
public class Solution {
    public static void main(String[] args) {
        // You can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            CodeGym codeGym = new CodeGym();
            // Initialize users field for the codeGym object here
            codeGym.save(outputStream);
            outputStream.flush();

            CodeGym loadedObject = new CodeGym();
            loadedObject.load(inputStream);
            // Here check that the codeGym object is equal to the loadedObject object

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class CodeGym {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            // Implement this method
            DataOutputStream output = new DataOutputStream(outputStream);
            output.writeInt(users.size());
            for (User user: users) {
                output.writeUTF(user.getFirstName());
                output.writeUTF(user.getLastName());
                output.writeLong(user.getBirthDate().getTime());
                output.writeBoolean(user.isMale());
                output.writeUTF(user.getCountry().name());
            }
            output.close();
        }

        public void load(InputStream inputStream) throws Exception {
            // Implement this method
            DataInputStream input = new DataInputStream(inputStream);
            int count = input.readInt();
            for (int i = 0; i < count; i++) {
                User user = new User();
                user.setFirstName(input.readUTF());
                user.setLastName(input.readUTF());
                long time = input.readLong();
                user.setBirthDate(new Date(time));
                user.setMale(input.readBoolean());
                String name = input.readUTF();
                User.Country country = User.Country.valueOf(name);
                user.setCountry(country);
                users.add(user);
            }
            input.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodeGym codeGym = (CodeGym) o;

            return users != null ? users.equals(codeGym.users) : codeGym.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
