package com.collage;

public class Pattern11 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
