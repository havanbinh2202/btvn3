package com.tn;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("**** Student Managerment ****");
        System.out.println("1. Show all Student");
        System.out.println("2. Insert A Student");
        System.out.println("3. Update A Student");
        System.out.println("4. Delete A Student");
        System.out.println("5. Exit");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị n: ");
        int n = sc.nextInt();

        if (n == 1 ){
            System.out.println("Show");
        } else if(n == 2){
            System.out.println("Insert");
        }else if (n == 3){
            System.out.println("Update");
        }else if (n == 4){
            System.out.println("Delete");
        }
    }
}
