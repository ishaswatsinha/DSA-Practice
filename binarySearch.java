public class binarySearch {

    public static int BinSearch(int Numbers[],int target){
        int start = 0;
        int end = Numbers.length-1;

        while (start<=end) {
            int mid = (start+end)/2;

            if (Numbers[mid]==target) {
                return mid;
            }
            else if (Numbers[mid]<target) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            start++;
            end--;
        }
        return -1;
    }
    public static void main(String args[]){
        int Numbers[]={2,3,4,5,6,7,8,9};
        int target = 5;
        int result = BinSearch(Numbers,target);
        System.out.println("Target Found on index: "+ result);
    }
}
