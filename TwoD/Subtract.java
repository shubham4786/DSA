package TwoD;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Subtract {


    static int[][] inpt(int r, int c){
        Scanner sc= new Scanner(System.in);
        int x[][]=new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                 x[i][j]=sc.nextInt();
            }
        }
        return x;
    }



    static int[][] subt(int x[][], int y[][]){
        int r1= x.length;
        int c1= x[0].length;
        int r2= y.length;
        int c2=y[0].length;

        int z[][] = new int[r1][c1];
        if(r1==r2 && c1==c2) {
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    z[i][j] = x[i][j] - y[i][j];
                }
            }

        }
        return z;
    }


    static void prif(int a[][]){
        int r=a.length;
        int c=a[0].length;

        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Row And Column: ");
        int r= sc.nextInt();
        int c=sc.nextInt();
        System.out.println("\n Enter First Matrix: ");
        int x[][]=inpt(r,c);
        System.out.println("\n Enter Second Matrix: ");
        int y[][]=inpt(r, c);

        int a[][]=subt(x, y);
        System.out.println("\n Subtraction of Matrix: ");
        prif(a);



    }
}
