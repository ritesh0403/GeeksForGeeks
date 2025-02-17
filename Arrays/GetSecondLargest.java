public class GetSecondLargest {
    public static int getSecondLargest(int[] arr) {

        int largest = -1, secLargest = -1;

        for(int i : arr){
            if(i > largest) {
                secLargest = largest;
                largest = i;
            }
            else if(i < largest && i > secLargest) secLargest = i;
        }
        return secLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }
}