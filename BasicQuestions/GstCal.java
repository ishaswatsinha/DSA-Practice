package BasicQuestions;
import java.util.Scanner;

public class GstCal {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Item Price");
        float a = sc.nextFloat();
        System.out.println("Enter 2nd Item Price");
        float b = sc.nextFloat();
        System.out.println("Enter 3rd Item Price");
        float c = sc.nextFloat();
        sc.close();
        float Price = a + b + c;
        float gst = Price * 0.18f;
        float TotalPrice = Price + gst;
        System.out.println("GST: " + gst);
        System.out.println("Total Price: " + TotalPrice);
    }
}
