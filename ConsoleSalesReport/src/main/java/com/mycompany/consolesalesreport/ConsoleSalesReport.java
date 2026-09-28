/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consolesalesreport;

/**
 *
 * @author Student
 */
public class ConsoleSalesReport {

  public static void main(String[] args) {
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Each row represents a city; each column represents a console.
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        int[] cityTotals = new int[cities.length];
        int highestCityIndex = 0;
        // Displaying the table
        System.out.println("-------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-------------------------------------------------------------");
        System.out.println("CITY\t\tPS5\tXBOX\tSWITCH");

        for (int city = 0; city < cities.length; city++) {
            System.out.print(cities[city] + "\t");

            for (int console = 0; console < consoles.length; console++) {
                System.out.print(sales[city][console] + "\t");
                cityTotals[city] += sales[city][console];
            }

            System.out.println();

            if (cityTotals[city] > cityTotals[highestCityIndex]) {
                highestCityIndex = city;
            }
        }
        
        System.out.println("------------------------------------------------------------");
        System.out.println("\nCONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------");
        System.out.println("CITY\t\tTOTAL");

        for (int city = 0; city < cities.length; city++) {
            System.out.println(cities[city] + "\t" + cityTotals[city]);
        }

        System.out.println("\nCITY WITH THE MOST SALES: "
                + cities[highestCityIndex]);
        System.out.println("------------------------------------------------------------");
    }
}
