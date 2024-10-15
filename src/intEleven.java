
import java.util.Arrays;


public class intEleven {
    public static void main(String[] args) {
        int arr[]={5,6,3,9,25,234,7,2};
        
        int largest=arr[0];
        int smallest=arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }else if(arr[i]<smallest){
                smallest=arr[i];
            }

            }
            System.out.println(Arrays.toString(arr));
            System.out.println("largest is "+largest);
            System.out.println("smallest is "+smallest);
        }
    }

