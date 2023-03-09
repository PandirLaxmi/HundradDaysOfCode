package com.demo.hackerrank;

import java.util.ArrayList;
class Solution {
        public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";
            ArrayList<String> list1 = new ArrayList();
            for (int i = 0; i < s.length()-k+1; i++) {
                list1.add(s.substring(i, i+k));
            }
            for (int i = 0; i < list1.size(); i++) {
                for (int j = list1.size() - 1; j > i; j--) {
                    String tmp = list1.get(i);
                    list1.set(i ,list1.get(j));
                    list1.set(j ,tmp);
                }
            }
            smallest = list1.get(0);
            largest = list1.get(s.length()-k);

            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'

            return smallest + "\n" + largest;
        }


    }
    public class LexographicalOrder{
        public static void main(String[] args) {
            System.out.println(Solution.getSmallestAndLargest("welocmetojava", 3));
        }
    }
