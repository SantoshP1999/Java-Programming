/*WAP to print following pattern
    9
    9 8
    9 8 7
    9 8 7 6
 */

 class Program6{
    public static void main(String[] args) {
        int n=4;
       for(int i=1;i<=n;i++){
        int a=9;
        for(int j=1;j<=i;j++){
            System.out.print(a+" ");
            a--;
        }
        System.out.println();
       } 
    }
}