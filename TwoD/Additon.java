package TwoD;

import java.util.Scanner;

public class Additon {
    static int[][] add(int x[][], int y[][]){
        int r1= x.length;
        int c1=x[0].length;
        int r2 =y.length;
        int c2=y[0].length;
        int z[][]=new int[r1][c1];

        if(r1== r2 && c1==c2) {
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    z[i][j]=x[i][j]+y[i][j];
                }
            }

        }
        return z;
    }

    static void printMatrix(int a[][]){
        int r = a.length;
        int c = a[0].length;

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(a[i][j] +  " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int x[][]= new int[r][c];
        int y[][]= new int[r][c];
        for(int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                x[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                y[i][j]= sc.nextInt();
            }
        }

        int z[][]=add(x, y);
        printMatrix(z);


    }
}
