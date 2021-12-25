package com.collage;

import java.util.Scanner;

public class InputProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1=0;
        int c2=0;int c3=0;
        int a;
        while (true){

            a = sc.nextInt();
            if(a>0){
                c1++;
            } else if(a==0){
                c3++;
            }
            else{
                c2++;
            }
            if(a=='\u0000'){
                break;
            }
        }
        System.out.println("Positive number count is "+c1);
        System.out.println("Negative number count is "+c2);
        System.out.println("Zero number count is "+c3);

    }
}
