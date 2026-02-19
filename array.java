public class array {
    public static void changeArr(int arr[], int i, int val){
        // base case 
        if(i == arr.length){
            printArr(arr);
            return;
        }
        // recusive call
        arr[i] = val;
        changeArr(arr, i+1, val+1);

    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void reverseArr(int arr[]){
        for(int i=arr.length-1; i>=0; i--){ // back tracking is done after recusive call of fnx
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[4];
        changeArr(arr, 0, 0);
        reverseArr(arr);
    }
}
