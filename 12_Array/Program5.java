//Accessing Array Elements
import java.io.*;
class ArrayDemo5{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Array Elements");
        int arr[]=new int[5];
        for (int i=0;i<5;i++){
            
            arr[i]=Integer.parseInt(br.readLine());
        }
        //Printing Array
    
        for(int j=0;j<5;j++){
            System.out.println(arr[j]);
        }
    }
}