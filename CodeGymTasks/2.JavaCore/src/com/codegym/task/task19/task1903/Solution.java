package com.codegym.task.task19.task1903;

/* 
Adapting multiple interfaces

*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("US", "United States");
        countries.put("FR", "France");
    }

    public static void main(String[] args) {
        // Anonymous class with test data
        IncomeData incomeData = new IncomeData() {
            @Override
            public String getCountryCode() {
                return "US";
            }

            @Override
            public String getCompany() {
                return "CodeGym Ltd.";
            }

            @Override
            public String getContactFirstName() {
                return "John";
            }

            @Override
            public String getContactLastName() {
                return "Smith";
            }

            @Override
            public int getCountryPhoneCode() {
                return 38;
            }

            @Override
            public int getPhoneNumber() {
                return 501234567;
            }
        };

        IncomeDataAdapter testDate = new IncomeDataAdapter(incomeData);
        System.out.println(testDate.getCompanyName());
        System.out.println(testDate.getCountryName());
        System.out.println(testDate.getName());
        System.out.println(testDate.getPhoneNumber());
        // +38(050)123-45-67
    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String phoneNum =  "" + data.getPhoneNumber();
            // prepend '0' to length of 10
            while (phoneNum.length() < 10) {
                phoneNum = "0" + phoneNum;    // yuck.
            }
            return "+" + data.getCountryPhoneCode() + "(" + phoneNum.substring(0,3) + ")" +
                    phoneNum.substring(3,6) + "-" + phoneNum.substring(6,8) + "-" + phoneNum.substring(8,10);
        }
    }


    public static interface IncomeData {
        String getCountryCode();        // For example: US

        String getCompany();            // For example: CodeGym Ltd.

        String getContactFirstName();   // For example: John

        String getContactLastName();    // For example: Smith

        int getCountryPhoneCode();      //  For example: 1

        int getPhoneNumber();           // For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        // For example: CodeGym Ltd.

        String getCountryName();        // For example: United States
    }

    public static interface Contact {
        String getName();               // For example: Smith, John

        String getPhoneNumber();        // For example: +38(050)123-45-67
    }
}