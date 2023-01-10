package TwoD;

import java.util.Scanner;

public class Product {
    static int[][]  inpu(int r, int c){
        Scanner sc= new Scanner(System.in);
        int a[][]=new int[r][c];
        for(int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                a[i][j]= sc.nextInt();
            }
        }
        return a;
    }

    static int[][] prod(int x[][], int y[][]){
        int r1= x.length;
        int c1=x[0].length;
        int r2= y.length;
        int c2= y[0].length;

        int z[][]= new int[r1][c2];

        if(r2 == c1){
            for (int i=0; i<r1; i++){
                for (int j=0; j<c2; j++){
                    int sum=0;
                    for (int k=0; k<c1; k++){
                        sum+= x[i][k] * y[k][j];
                    }
                    z[i][j]=sum;
                }
            }

        }
        return z;

    }

    static void prif(int z[][]){
        int r =z.length;
        int c= z[0].length;
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(z[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row and Column First Matrix: ");
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        System.out.println("Enter Row and Column Second Matrix: ");
        int r2= sc.nextInt();
        int c2= sc.nextInt();
        System.out.println("Enter First Matrix: ");
        int x[][]=inpu(r1, c1);
        System.out.println("Enter Second Matrix Matrix: ");
        int y[][]=inpu(r2, c2);

        int z[][]=prod(x, y);
        System.out.println("Product of Matrix: ");
        prif(z);
    }



}
