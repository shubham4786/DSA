package TwoD;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();


        for(int k=1; k<=t; k++){
            int row= sc.nextInt();
            int col= sc.nextInt();
            int mat[][]=new int[row][col];
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    mat[i][j]= sc.nextInt();
                }
            }
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    if(mat[i][j]==1){
                        for(int h=0; h<col; h++){
                            mat[i][h]=1;
                        }
                        break;
                    }
                }
            }
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }


        }
    }
}
