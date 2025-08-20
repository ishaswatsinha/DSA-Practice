package Recursion;
public class fibonacci {
    public static int fiboRec(int n){
        int fn;
        if(n==0 || n==1){
            return n;
        }
        

        int fn1 = fiboRec(n-1);
        int fn2 = fiboRec(n-2);

        fn = fn1 + fn2;

        return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        // fibo(n);
        System.out.println(fiboRec(n));
    }
}


 