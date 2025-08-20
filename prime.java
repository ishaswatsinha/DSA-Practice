public class prime {

    //IsPrime Function
    public static boolean isPrime(int n){
        // for 2
        if (n == 2) {
            return true;
        }

        for(int i=2 ; i<=(int)Math.sqrt(n) ; i++){
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    // Prime in range
    public static void primeInRange(int n){
        for(int i=2; i<=n ; i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(isPrime(15));
        // primeInRange(20);
    }
}