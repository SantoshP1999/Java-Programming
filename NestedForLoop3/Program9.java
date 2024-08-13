/*WAP to print following pattern
    1
    8  27
    64 125 216

 */

 class Program9{
    public static void main(String[] args) {
        int n=3;
        int a=1;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(a*a*a+" ");
            a++;
        }
        System.out.println();
       } 
    }
}