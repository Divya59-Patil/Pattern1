package com.collage;

import java.util.Scanner;

public class CheckPrimeorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("Not a prime number");
                break;
            }
            if(n%i!=0){
                System.out.println("Prime number");
                break;
            }

        }

    }
}
