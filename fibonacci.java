public class fibonacci {

    public static void fibo(int n){
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // update values
            int next = first + second;
            first = second;
            second = next;
        }
    }
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
        fibo(n);
        // System.out.println(fiboRec(n));
    }
}


// 0 1 1 2 3 5 8 