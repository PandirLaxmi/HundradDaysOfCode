package com.demo.hackerrank;

import java.text.NumberFormat;
import java.util.*;

public class currencyProblem {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double payment = scanner.nextDouble();
            scanner.close();

            // Write your code here.
            /*String us = Currency.getInstance(Locale.US).getSymbol(Locale.US) + payment;
            String india = Currency.getInstance(new Locale("en", "in")).getSymbol(new Locale("en", "in")) + payment;
            String china = Currency.getInstance(Locale.CHINA).getSymbol(Locale.CHINA) + payment;
            String france = "" + payment + Currency.getInstance(Locale.FRANCE).getSymbol(Locale.FRANCE);

            NumberFormat.getCurrencyInstance();
            NumberFormat.getCurrencyInstance();*/

            String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
            String india =NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
            String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
            String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);


            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
        }
    }

