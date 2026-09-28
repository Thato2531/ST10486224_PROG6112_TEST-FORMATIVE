/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.consolesalesreport;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();
        input.nextLine(); // Consume the remaining newline

        String consoleType;

        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
            default:
                System.out.println("Invalid choice.");
                input.close();
                return;
        }

        System.out.print("Enter the store name: ");
        String storeName = input.nextLine();

        System.out.print("Enter the total sales: ");
        int totalSales = input.nextInt();

        ConsoleSales sales = new ConsoleSales(
                consoleType, storeName, totalSales
        );

        sales.printReport();
        input.close();
    }
}
