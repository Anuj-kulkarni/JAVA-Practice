public class merge{

    public static void PrintArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei){
        // si=0; ei = arr.length-1;
        if(si >= ei){
            return; 
        }
        int mid = si +(ei-si)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        Merge(arr, si, ei, mid);
    }

    public static void Merge(int arr[], int si, int ei, int mid){
        int i = si;
        // mid = si + (ei-si)/2;
        int j = mid +1;
        int k = 0;
        int temp[] = new int[ei - si + 1];

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while(j <= ei){
            temp[k++] = arr[j++];
        }

        for (k = 0; k < temp.length; k++) {
            arr[si + k] = temp[k];
        }

    }
    public static void main(String args[]){
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        // PrintArr(arr, 0, arr.length-1);
        PrintArr(arr);
    }
}