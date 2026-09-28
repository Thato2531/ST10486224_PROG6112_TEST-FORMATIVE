/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consolesalesreport;

/**
 *
 * @author Student
 */
public class ConsoleSales extends Console {

    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    public void printReport() {
        System.out.println("\nCONSOLE SALES REPORT");
        System.out.println("************************************");
        System.out.println("Console type:\t" + getConsoleType());
        System.out.println("Store:\t\t" + getStore());
        System.out.println("Total sales:\t" + getTotalSales());
    }
}
