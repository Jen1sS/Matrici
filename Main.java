package com.JoeMama;

class Main {
    public static void main(String[] args){
        int[][] matrice = Matrix.input(true);

        double risultato = 0;
        int somma;
        int max = 0;
        int maxriga = 0;
        int[] somme = new int[matrice.length];

        double[] media1 = new double[matrice.length];
        for (double i : media1) {
            media1[(int) i] = 0;
        }


        //calcolo media aritmetica


        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                media1[i] += matrice[i][j];
            }
            risultato += media1[i];
        }
        risultato = risultato / matrice.length;

        System.out.println("La media aritmetica e' di: " + risultato);

        //calcolo riga piu alta

        for (int i = 0; i < matrice.length; i++) {
            somma = 0;
            for (int j = 0; j < matrice.length; j++) {
                somma += matrice[i][j];
            }

            if (somma > max) {
                max = somma;
                maxriga = i;
            }
            somme[i] = somma;
        }

        System.out.print("La somma piu alta e' " + max + " nella riga " + maxriga+"\n");

        //somme per colonna
        System.out.print("{");

        for (int i = 0; i < matrice.length - 1; i++) {
            System.out.print(somme[i] + ",");
        }
        System.out.print(somme[somme.length-1]+"}");
    }

}
