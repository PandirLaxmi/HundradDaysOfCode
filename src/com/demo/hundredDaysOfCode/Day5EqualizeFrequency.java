package com.demo.hundredDaysOfCode;

public class Day5EqualizeFrequency {
    public static void main(String[] args) {
        //return true if removing one character from a string will make the string having frequency of each character 1
        //ex. abcc will return 1 and "aabb" will return false and true for "cccaa"
        String str = "ccdd";
        Boolean result = false;
        int[] data = new int[26];
        for (char ch: str.toCharArray()) data[ch -'a']++;
        for (int i = 0; i < 26; i++) {
            data[i]--;
            if(isEqual(data)) result = isEqual(data);
            data[i]++;

        }

        /*char[] chs = str.toCharArray();
        Set set = new HashSet();
        for (int i = 1; i <= chs.length; i++) {
            if(!set.add(chs[i])) {
                count++;
            }
            if (count> 1) {
                result = false;
                break;
            }
        }*/
        System.out.println(result);


    }

    static boolean isEqual(int[] data){
        int numCount = 0;
        for (int count :
                data) {
            if (count == 0) continue;
            if(numCount!= 0 && count != numCount) return false;
            numCount =  count;
        }
        return true;
    }
}
