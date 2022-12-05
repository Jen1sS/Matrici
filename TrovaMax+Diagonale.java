package com.JoeMama;

class Main {
    public static void main(String[] args){
        //input
        int[][] matrice = Matrix.input(false);
        matrice = Matrix.fillRandom(matrice.length,matrice[0].length);

        //variabili
            //x=0,y=0
            int[][] coordinate= new int[matrice.length*matrice[0].length][2];
        int max=Integer.MIN_VALUE;
        int occorrenze=0;
        int coordA=0;
        int coordB=0;
        int diagonale1=0;
        int diagonale2=0;


        //processo max
        for (int x=0;x< matrice.length;x++){
            for(int y=0;y<matrice[0].length;y++){
                if (max<matrice[x][y]){
                    //assegnazione massimo
                    max=matrice[x][y];
                    //inizializzazione variabile coordinate
                    coordA=0;
                    coordB=0;
                    coordinate=new int[matrice.length*matrice[0].length][2];
                    coordinate[0][0]=x;
                    coordinate[0][1]=y;
                    occorrenze=1;
                } else if (max==matrice[x][y]){
                    coordA++;
                    coordB++;
                    coordinate[coordA][0]=x;
                    coordinate[coordB][1]=y;
                    occorrenze++;
                }
            }
        }

        //somma diagonali
        for (int i=0;i<matrice.length;i++){
            diagonale1+=matrice[i][i];
            diagonale2+=matrice[matrice.length-1-i][matrice[0].length-1-i];
        }

        //output
        System.out.println("il numero max e' "+max);
        System.out.println("----------------------------------");
        System.out.println("Occorrenze del numero "+max+": "+occorrenze);
        for (int i=0;i<occorrenze;i++){
            System.out.println("occorrenza "+(i+1)+" = "+"("+coordinate[i][0]+","+coordinate[i][1]+")");
        }
        System.out.println("----------------------------------");
        System.out.print("La diagonale maggiore e' ");
        if(diagonale1>diagonale2){
            System.out.print(1+" con una somma di: "+diagonale1);
        } else {
            System.out.print(2+" con una somma di: "+diagonale1);
        }
        System.out.println("----------------------------------");

    }

}
