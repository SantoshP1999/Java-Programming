//Passing Array as an Arguments

class ArrayDemo15{
    static void fun(int xarr[]){
        for(int x : xarr){
            System.out.println(x);
        }
    } 

    public static void main(String [] args){
        int arr[]={10,20,30,40,50};
        
        for(int x : arr){
            System.out.println(x);
            
        }

        return(arr);
    }
}