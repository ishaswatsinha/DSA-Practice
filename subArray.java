public class subArray {

    public static void printSubArray(int number[]){
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {

            for(int j = i ; j<number.length; j++){
                int sum = 0;
                for(int k=i; k<=j;k++){
                    System.out.print(number[k] );
                    sum += number[k];
                    if (maxSum<sum) {
                        maxSum = sum;
                    }
                }
                System.out.println(" = "+sum);
            }
        }
        System.out.println("Maximum Sum is : "+maxSum);
    }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        printSubArray(number);
    }
}
