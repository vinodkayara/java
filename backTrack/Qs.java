package backTrack;

public class Qs {
    public static void quicksort(int arr[], int low , int high ){
       
     if(low<high)  {

     
        int pi = partition(arr, low, high);

        quicksort(arr, low, pi-1);
        quicksort(arr, pi+1, high);
    }
}

public static int partition( int arr[], int low , int high){
    int pivot=arr[high];
    int i =low-1;
    
    for(int j= low;j<high; j++){
        if(arr[j]<pivot){
            i++;
            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;


        }
    }
    //swap with pivot
    
    i++;
    int temp = arr[i];
    arr[i] = arr[high];
    arr[high] = temp;
    return  i;
}
}
