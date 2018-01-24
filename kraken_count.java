/*
 * Complete the function below.
 */

    static int krakenCount(int m, int n) {
    if (m==1 || n==1)
        return 1;
        
    return (krakenCount(m-1,n)+krakenCount(m,n-1)+krakenCount(m-1,n-1));

    }

