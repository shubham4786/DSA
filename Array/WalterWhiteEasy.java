package Array;

public class WalterWhiteEasy {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 1, 2, 4, 1, 2, 3};
        int b[] = {1, 2, 3};
        int n = a.length;
        int m = b.length;

        int x[] = new int[m];
        int y[] = new int[2 * m];
        int p = x.length;
        int q = y.length;

        y[0] = b[0] - b[n - 1];
        y[m] = y[0];

        for (int i = 1; i < m; i++){
            y[i] = b[i] - b[i - 1];
            y[m+i] = y[i];
        }

        int count = 0;
        for(int i=0; i<=n-m; i++){
            x[0] = a[i] - a[i+m-1];
            for(int j=1; j<p; j++){
                x[j] = a[i+j] - a[i+j-1];
            }

            boolean flag = true;
            //search X inside Y
            for(int u=0; u<q; u++){
                flag = true;
                for(int v=0; v<p; v++){
                    if(x[v] != y[u+v]){
                        flag = false;
                        break;
                    }
                }

                if(flag == true){
                    break;
                }
            }

            if(flag == true){
                count++;
            }
        }

        System.out.println(count);
    }
}
