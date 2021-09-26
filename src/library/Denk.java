/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Scanner;

public class Denk {

    public static int inputInteger(String Welcome) {
        boolean flag;
        String tmp;
        int num = 0;
        do {
            System.out.printf(Welcome);
            Scanner sc = new Scanner(System.in);
            tmp = sc.nextLine();
            try {
                num = Integer.parseInt(tmp);
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Enter only integer value");
                flag = true;
            }
        } while (flag);
        return num;
    }

    public static int inputInteger(String welcome, int low, int up) {
        boolean flag;
        String tmp;
        int num = 0;
        do {
            System.out.printf(welcome);
            Scanner sc = new Scanner(System.in);
            tmp = sc.nextLine();
            try {
                num = Integer.parseInt(tmp);
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Enter only integer value");
                flag = true;
            }
        } while (flag || !(num >= low && num <= up ));
        return num;
    }
    
    public static String inputString(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static String inputString(String welcome) {
        System.out.printf(welcome);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    
    public static boolean checkInputYN() {
        //loop until user input correct
        while (true) {
            String result = inputString();
            //kiểm tra yes/no y/Y or n/N
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.out.print("Enter again: ");
        }
    }
}

