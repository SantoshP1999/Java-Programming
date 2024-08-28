/*
Jagged Array
1 2 3 
4 5 
6
*/

class ArrayDemo25{
    public static void main(String[]args){
        int arr2[][]={{1,2,3},{4,5},{6}};
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}