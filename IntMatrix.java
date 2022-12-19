package com.JoeMama;

import org.jetbrains.annotations.Nullable;

public class IntMatrix {
    private static int[][] matrix;
    private static boolean isSquare=false;

    public IntMatrix(int[][] matrice){
        matrix=matrice;
        if(matrice.length==matrice[0].length){
            isSquare=true;
        }
    }

    public static int[][] fillRandom(int len,int high) {
        int[][] matrix=new int[len][high];

        for (int x=0;x<len;x++) {
            for (int y = 0; y <high; y++) {
                matrix[x][y]= (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    @Override
    public String toString() {
        String matrice="";
        for (int i=0;i<matrix[0].length;i++){
            for (int j=0;j< matrix.length;j++){
                matrice=matrice+matrix[i][j]+" ";
            }
            matrice=matrice+"\n";
        }

        return matrice;
    }

    public static int getLength() {
        return matrix.length;
    }

    public static int getHeight() {
        return matrix[0].length;
    }


    public static void sum(int[][] matriceA,int[][] matriceB){
        if (matriceA.length==matriceB.length && matriceA[0].length==matriceB[0].length) {
            for (int x=0;x<matriceA.length;x++){
                for (int y=0;y<matriceA[0].length;y++) {
                    matrix[x][y] = matriceA[x][y] + matriceB[x][y];
                }
            }
        }
    }

    public static void multiply(int[][] matriceA,int[][] matriceB){
        int parz=0;
        for (int x=0;x<getLength();x++) {
            for (int y = 0; y < getHeight(); y++) {
                for (int i=0;i<matriceB[0].length;i++){
                    parz=parz+matriceA[i][y]+matriceB[x][i];
                }
                matrix[x][y]=parz;
            }
        }
    }


}
