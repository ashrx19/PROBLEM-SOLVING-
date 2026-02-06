
// find largest and smalest in array


class Main {
    public static void main(String[] args) {
        int[] arr = {5,2,6,8,1,6,20};
        
        int smallest=arr[1];
        int largest=arr[1];
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
            if(arr[i]>largest){
                largest=arr[i];
            }
            
        }
        System.out.println("Smallest : "+smallest);
        System.out.println("Largest : "+largest);
    }
}