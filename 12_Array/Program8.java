//OddEven Count
import java.util.Scanner;
class OddEvenCount{
    public static void main(String [] args){
        int oddCount=0;
        int evenCount=0;
        
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter Array Size");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter Array Elements");
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;

            }else{
                oddCount++;
            }
        }
        System.out.println("Even Count is: "+evenCount);
        System.out.println("Odd Count is: "+oddCount);
    }
}