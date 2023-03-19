package com.company.comparable;

public class Comparable {

    public static void main(String[] args) {

        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};

        for(Integer i : others){
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five,
                    (val == 0 ? "==" : (val <0) ? "<" : ">"), i, val);
        }

        String banana = "banana";
        String [] fruit = {"apple", "banana", "pear", "BANANA"};

        for (String s : fruit){
            int val = banana.compareTo(s);
            System.out.printf("%s %s %s: compareTo=%d%n", banana,
                    (val == 0 ? "==" : (val < 0) ? "<" : ">"), s, val);
        }
    }
}

 //run result
//5 > 0: compareTo=1
//        5 == 5: compareTo=0
//        5 < 10: compareTo=-1
//        5 > -50: compareTo=1
//        5 < 50: compareTo=-1
//        banana > apple: compareTo=1
//        banana == banana: compareTo=0
//        banana < pear: compareTo=-14
//        banana > BANANA: compareTo=32