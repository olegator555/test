package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int mas[] = new int[10];
//        for(int i=0;i<10;i++)
//        {
//            mas[i]=scan.nextInt();
//        }
//        System.out.println();
//        for(int i=0;i<10;i++)
//            System.out.print(mas[i]+" ");
//        System.out.print("\n");
//        Bubble back = new Bubble(mas);
//        Bubble back1 = new Bubble(mas);
//        Bubble one = new Bubble();
//
//        one.bubblesort(mas);
//
//        back.print();
//        back.insert();
//        System.out.println();
//        back1.print();
//        back1.quicksort(mas,0,9);
//        for(int i=0;i<10;i++)
//            System.out.print(mas[i]+" ");
//        System.out.println();

        String st;
        Scanner scan = new Scanner(System.in);
        st = scan.nextLine();
        ReverseString.print(st);
        DelDuplicate.change(st);

    }
}
