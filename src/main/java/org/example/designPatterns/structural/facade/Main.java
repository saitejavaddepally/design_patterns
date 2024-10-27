package org.example.designPatterns.structural.facade;

import java.util.List;

public class Main {

    public static void main (String[] args) {

        JDBCFacade jdbcFacade = new JDBCFacade();

        jdbcFacade.createTable();

        System.out.println("Table created.");

        jdbcFacade.insertIntoTable();

        System.out.println("Record inserted.");

        List<Address> addresses = jdbcFacade.getAddresses();

    }

}
