package modulo;

public class Inverse {
    public static void main(String[] args) {
        int a = 10;
        int m = 30;
        int b = -1;

        for(int i=1; i<m; i++){
            if((a*i)%m == 1){
                b = i;
                break;
            }
        }

        System.out.println(b);
    }
}
