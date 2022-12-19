package com.JoeMama;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scam=new Scanner(System.in);
        //Il codice l'ho copiato e incollato per fare più velocemente

        System.out.println("Matrice 1");

        System.out.println("Dimmi la lunghezza della matrice quadrata: ");
        int len=scam.nextInt();
        System.out.println("Dimmi l'altezza della matrice quadrata: ");
        int high=scam.nextInt();
        int[][] matrice=new int[len][high];
        IntMatrix matrix=new IntMatrix(matrice);


        System.out.println("riempimento a mano(1) o riempimento veloce(2)?");
        switch (scam.nextInt()){
            case 1:
                for (int x=0;x<len;x++){
                    for (int y=0;y<high;y++){
                        System.out.println("Dimmi l'elemento a "+x+" "+y);
                        matrice[x][y]=scam.nextInt();
                    }
                }

                break;
            case 2:
                matrice= IntMatrix.fillRandom(len,len);
                break;
        }

        matrix=new IntMatrix(matrice);
        System.out.println(matrix.toString());


        //-------------------------------------------------------------------------------------------------------------------------------------//

        System.out.println("Matrice 2");

        System.out.println("Dimmi la lunghezza della matrice quadrata: ");
        int len2=scam.nextInt();
        System.out.println("Dimmi l'altezza della matrice quadrata: ");
        int high2=scam.nextInt();
        int[][] matrice2=new int[len][len];
        IntMatrix matrix2=new IntMatrix(matrice);


        System.out.println("riempimento a mano(1) o riempimento veloce(2)?");
        switch (scam.nextInt()){
            case 1:
                for (int x=0;x<len2;x++){
                    for (int y=0;y<high2;y++){
                        System.out.println("Dimmi l'elemento a "+x+" "+y);
                        matrice2[x][y]=scam.nextInt();
                    }
                }

                break;
            case 2:
                matrice2= IntMatrix.fillRandom(len2,len2);
                break;
        }

        matrix2=new IntMatrix(matrice2);
        System.out.println(matrix2.toString());

        //-------------------------------------------------------------------------------------------------------------------------------------//

        IntMatrix prodotto=new IntMatrix(new int[len][high2]);
        IntMatrix somma=new IntMatrix(new int[len][len]);
        System.out.println();

        System.out.println("somma");
        somma.sum(matrice,matrice2);
        System.out.println(somma.toString());

        System.out.println("prodotto");
        prodotto.multiply(matrice,matrice2);
        System.out.println(prodotto.toString());




    }
}