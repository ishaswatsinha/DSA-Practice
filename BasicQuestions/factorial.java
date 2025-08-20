package BasicQuestions;
public class factorial {
    
    public static int fact(int n){
        int x=1;
        for(int i = 1 ; i<=n ; i++){  
            x = x*i;
        }
        return x;
    }
    public static void main(String[] args){
        int ans = fact(4);
        System.out.println("Result is : "+ ans );
    
    }
}