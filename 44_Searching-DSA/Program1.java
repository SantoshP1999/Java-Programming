import java.util.*;

class UserInput{
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[]args){
        int arr[]=new int[7];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Element");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr);

    }
}