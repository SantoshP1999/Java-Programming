/*WAP to print following pattern
    1
    3  4
    6  7  8
    10 11 12 13
    15 16 17 18 19
 */

 class Program2{
    public static void main(String[] args) {
        int n=5;
        int a=1;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(a+" ");
        a++;
        }
        a++;
        System.out.println();
       } 
    }
}