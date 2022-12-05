package com.JoeMama;

import java.util.Scanner;

public class Matrix {

    public static int[][] input(boolean valori) {
        Scanner scam = new Scanner(System.in);

        System.out.println("Dimmi la grandezza della matrice (numx X numy)");
        String input = scam.nextLine().toLowerCase();

        int spazio = 0;
        int len;
        int hig;

        //misura

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 120) {
                spazio = i;
                break;
            }
        }
        len=Integer.parseInt(input.substring(0, spazio));
        hig=Integer.parseInt(input.substring(spazio+1));

        int[][] matrice = new int[len][hig];

        //contenuto
        if (valori){
            for (int i=0;i<len;i++){
                for(int j=0;j<hig;j++){
                    System.out.println("Dimmi la variabile "+j+" della colonna "+i);
                    matrice[i][j]=scam.nextInt();
                }
            }

        }
        return matrice;
    }

    public static int[][] fillRandom(int len,int high) {
        int[][] matrice=new int[len][high];

        for (int x=0;x<len;x++) {
            for (int y = 0; y <high; y++) {
                matrice[x][y]= (int) (Math.random() * 100);
            }
        }
        return matrice;
    }
}
