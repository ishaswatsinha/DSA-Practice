package BasicQuestions;
import java.util.*;
public class StrQue {
    // Question1: Count how many times lowercase vowels occurred in a String entered by the user.

    public static int countVowel(String str){
        // char lowerCaseVowel[] = {'a','e','i','o','u'};

        int count = 0;
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u' ){
                count++;
            }
        }
        return count;
    }

    public static boolean anagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // System.out.println(arr1);
        // System.out.println(arr2);

        return Arrays.equals(arr1, arr2);
    }



    public static void main(String[] Args){
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // System.out.println(countVowel(str));
        String str1 = "race";
        String str2 = "care";
        System.out.println(anagrams(str1, str2));

       
    }
}
