package com.demo.thirtyDaysChallenge.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class day4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scan.nextInt());
        }
        int Q = scan.nextInt();
        scan.next();
        for (int i = 0; i <= Q; i++) {
            scan.nextLine();
            String opr = scan.nextLine();

            if("Insert".equals(opr)){
                int a = scan.nextInt();
                int b = scan.nextInt();
                list.add(a, b);
            }
            if("Delete".equals(opr))
            {
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }

    }
}