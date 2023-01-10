package Patterns;

public class Triangle {
    static void basicSolid(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void basicSolidNumDiff(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((j) + " ");
            }
            System.out.println();
        }
    }

    static void basicSolidNumSame(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((i) + " ");
            }
            System.out.println();
        }
    }

    static void basicSolidAlphaDiff(int n){

        for(int i=1; i<=n; i++){

            char ch = 'a';

            for(int j=1;  j<=i; j++,ch++){
                System.out.print(ch + " ");
//                ch++;
            }
            System.out.println();
        }
    }

    static void basicSolidAlphaSame(int n){

        char ch = 'a';
        for(int i=1; i<=n; i++, ch++){
            for(int j=1; j<=i; j++){
                System.out.print(ch + " ");
            }
            System.out.println();
//            ch++;
        }
    }

    static void basicSolidReverse(int n){
        for(int i=1; i<=n; i++){
            //Spaces
            for(int j=1; j<=n-i; j++)
                System.out.print("  ");

            //Star
            for(int j=1; j<=i; j++)
                System.out.print("* ");

            //Shift cursor to nextLine
            System.out.println();
        }

    }

    public static void main(String[] args) {
        basicSolid(5);
        basicSolidNumDiff(5);
        basicSolidNumSame(5);
        basicSolidAlphaDiff(5);
        basicSolidAlphaSame(5);
        basicSolidReverse(5);

    }
}
