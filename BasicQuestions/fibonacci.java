package BasicQuestions;

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

    public static void main(String[] args) {
        int n = 10;
        fibo(n);
    }
    
}
