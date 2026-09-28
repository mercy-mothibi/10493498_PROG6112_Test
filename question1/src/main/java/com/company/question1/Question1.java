/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.company.question1;

/**
 *
 * @author mothi
 */
public class Question1 {

    public static void main(String[] args) {
      String[] cities = {"CAPT TOWN", "PORT ELIZABETH", "PRETORIA"};
    
      int[][] sales = {
          {1000,2000,3000}, // capt town
          {2000,3000,4000}, //port elizabeth
          {1500,1100,1200} //pretoria
              
      };
      
     System.out.println("-----------");
     System.out.println("GAMING CONSOLE REPORT");
     System.out.println("-----------");
    
    System.out.printf("PS5", "XBOX", "SWITCH");
    System.out.println();

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("cities[i], sales[i][0], sales[i][1], sales[i][2]");
        }
     System.out.println("-----------");
     System.out.println("CONSOLE SALES TOLTALS FOR EACH CITY");
     System.out.println("-----------");
     
    };
int maxSales = 0;
        String maxCity = "";

        int maxSales = 0;
        String maxCity = "";

        for (int i = 0; i < cities.length; i++) {
            int total = 0;
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
            System.out.printf("\n", cities[i], total);

            if (total > maxSales) {
                maxSales = total;
                maxCity = cities[i];
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + maxCity);
        System.out.println("--------------------------------------------------");
    }
}