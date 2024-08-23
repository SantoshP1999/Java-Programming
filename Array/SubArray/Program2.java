/*

    Given an integer array of size N 
    Return the length of smallest subarray which contains both the maximum of the array & minimum of the Array 

    arr[1,2,3,1,3,4,6,4,6,3]

*/

class Subarray{
    public static void main(String[]args){
       int arr[]=new int[]{1,2,3,1,3,4,6,4,6,3}; 
       int length=0;
       int minLength=Integer.MAX_VALUE;
       int minValue=Integer.MAX_VALUE;
       int maxValue=Integer.MIN_VALUE;

       for(int i=0;i<arr.length;i++){
            if(arr[i]<minValue){
                minValue=arr[i];
            }
            if(arr[i]<maxValue){
                maxValue=arr[i];
            }
       }

       for(int i=0;i<arr.length;i++){
        if(arr[i]==minValue){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==maxValue){
                    length=j-i+1;
                    if(minLength>length){
                    minLength=length;
                    }
                }
            

               if(arr[i]==maxValue){

                  for(int j=i+1;j<arr.length;j++){
                  if(arr[j]==minValue){
                    length=j-i+1;
                  }
                   else if(minLength>length){
                    minLength=length;
                    }  
                  }
                }
            }
        }
       }
       
       System.out.println(minLength);

  
    }
}

