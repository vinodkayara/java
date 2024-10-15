public class intThirteen {
    public static void main(String[] args) {
        
        int[] inputArr={2,5,6,7,6,8,2,9};

        intThirteen.findDuplicateUsingBruteforce(inputArr);
        //brute force method

        

    }
    private static void findDuplicateUsingBruteforce(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        System.out.println("duplicate element :"+arr[i]);
                    }
            }
        }
    }
}
