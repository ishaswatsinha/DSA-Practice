package BasicQuestions;
public class isPallindrom {

    public static void isPalindrome(int n) {
        // n = 141;
        int x = n;
        int lastDigit;
        int rev = 0;
        
        while (n>0) {
            lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n = n/10;
        }
        System.out.println("rev is :" + rev);
        if (rev == x ) {
            // return true;
            System.out.println("Number is Pallindrom");
        }
        else{
            // return false;
        }
        
}
    public static void main(String[] args){
        isPalindrome(121);

}
}
