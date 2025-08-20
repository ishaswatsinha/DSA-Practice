package Recursion;

public class firstOccurance {
    public static int firstOccur(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }        

        if (arr[i] == key)  {
            return i;
        }
        return firstOccur(arr, key, i+1);

    }
    public static int lastOccur(int arr[],int key, int i){
        
        if (i==0) {
            return -1;
        }
        if (arr[i]==key) {
            return i;
        }
        return lastOccur(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,5,3,4,5};
        int key = 68;
        int i = arr.length-1;
        System.out.println(firstOccur(arr, key, 0));
        System.out.println(lastOccur(arr, key, i));
    }
    
}
