package com.company;

public class Test {
    public static void main(String[] args) {

        String str;
        SList list = new SList();
        int[] num = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int n : num) {
            list.insertFront(n);
        }
        str = list.toString();
        System.out.println(str);
    }
}
