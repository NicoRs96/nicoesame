package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ingresso = new Scanner(System.in);
        System.out.print("Scrivi un numero: ");
        int n = ingresso.nextInt();

        if (n % 2 == 0) {
            System.out.print("Il numero è multiplo di 2");
        } else {
            System.out.print("Il numero non è multiplo di 2");

        }
    }
}
