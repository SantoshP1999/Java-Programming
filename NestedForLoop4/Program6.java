/*WAP to print following pattern
    1
    2 3
    3 4 5
    4 5 6 7
 */

 class Program6{
    public static void main(String[] args) {
        int n=4;
        int a=1;
       for(int i=1;i<=n;i++){
        int temp=a;
        for(int j=1;j<=i;j++){
            System.out.print(temp+" ");
        temp++;
        }
        a++;
        System.out.println();
       } 
    }
}