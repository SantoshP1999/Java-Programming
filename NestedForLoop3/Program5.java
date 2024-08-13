/*WAP to print following pattern
    10 10 10 10
    11 11 11
    12 12
    13
 */

 class Program5{
    public static void main(String[] args) {
        int n=4;
        int a=10;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(a+" ");
        }
        a++;
        System.out.println();
       } 
    }
}