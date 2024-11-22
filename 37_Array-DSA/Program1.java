// Count no of elements having atleast 1 elements greater than itself

//  1) Bruteforce Approach

class ArrayDemo{
    public static void main(String[]args){
        int arr[]=new int[]{2,5,1,4,8,0,8,1,3,8};
        int n=10;
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]<arr[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println("Count= "+count);
    }
}

