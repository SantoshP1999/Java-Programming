//for each loop

class ArrayDemo11{
    public static void main(String[]args){
        int arr[]={10,20,30,40,50};
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //for each loop
        for(int x : arr){
            System.out.println(x);
        }
    }
}

/*for each loop do not work on normal variables ...it works on only classes
  In Simple for loop we can skip the sequence ...........break,continue
  We do not skip sequence in for each loop
*/