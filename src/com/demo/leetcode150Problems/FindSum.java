package com.demo.leetcode150Problems;

public class FindSum {
    public static void main(String[] args) {
        double[] nums ={ 393.1,
        1968.6,
        1.65,
        3812.6,
        214.56,
        1215.84,
        3267,
        1088.5,
        1044.96,
        252.2,
        260,
                2200,
                3025,
                426,
                1737.4
        };
        double[] buy = {14450,
                23649.4,
                3212.6,
                778,
                1257.8,
                14700
        };
        double[] sell = {16187.4,
                34292.86,
                5181.2,
                1171.1,
                1770,
                20351
        };
        double sum = 0;
        for (double d :
                sell) {
            sum = sum + d;
        }
        System.out.println(sum);
        //System.out.println();
        double profit = 78953.56 - 58047.0;
        System.out.print(78953.56 - 58047.0);
    }
}
