package Arrays;
public class Pairs {

    public static void Pair(int numbers[]){
        for (int i = 0; i < numbers.length; i++) {
            for(int j = i;j<numbers.length;j++){
                if (i==j) {
                    System.out.print("("+numbers[i]+") ");
                }else{
                    System.out.print(" , "+"("+numbers[i]+","+numbers[j]+")");
                }

            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int numbers[]={2,3,4,5};
        Pair(numbers);
        
    }
}
