package com.codegym.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Reinforce the adapter

*/

public class Solution {
    public static Map<String,String> countries = new HashMap<>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("US", "United States");
        countries.put("FR", "France");
    }

    public static void main(String[] args) {
        Customer customer = new Customer() {
            @Override
            public String getCompanyName() {
                return "CodeGym Ltd";
            }

            @Override
            public String getCountryName() {
                return "United States";
            }
        };

        Contact contact = new Contact() {
            @Override
            public String getName() {
                return "Peterson, John";
            }

            @Override
            public String getPhoneNumber() {
                return "+1(111)222-3333";
            }
        };

        DataAdapter rowItem = new DataAdapter(customer, contact);
        System.out.println(rowItem.getCompany());
        System.out.println(rowItem.getContactFirstName());
        System.out.println(rowItem.getContactLastName());
        System.out.println(rowItem.getCountryCode());
        System.out.println(rowItem.getDialString());
    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            String code = null;
            String countryName = customer.getCountryName();
            // search for key by value
            for (Map.Entry<String, String> entry : countries.entrySet()) {
                if (entry.getValue().equals(countryName)) {
                    code = entry.getKey();
                }
            }
            return code;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String[] names = contact.getName().split(", ");
            return names[1];
        }

        @Override
        public String getContactLastName() {
            String[] names = contact.getName().split(", ");
            return names[0];
        }

        @Override
        public String getDialString() {
            String dialURL = "callto://" + contact.getPhoneNumber().replaceAll("[()-]", "");
            return dialURL;
        }
    }

    public static interface RowItem {
        String getCountryCode();        // For example: US
        String getCompany();            // For example: CodeGym Ltd.
        String getContactFirstName();   // For example: John
        String getContactLastName();    // For example: Peterson
        String getDialString();         // For example: callto://+11112223333
    }

    public static interface Customer {
        String getCompanyName();        // For example: CodeGym Ltd.
        String getCountryName();        // For example: United States
    }

    public static interface Contact {
        String getName();               // For example: Peterson, John
        String getPhoneNumber();        // For example: +1(111)222-3333, +3(805)0123-4567, +380(50)123-4567, etc.
    }
}