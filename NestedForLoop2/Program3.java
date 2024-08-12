/*WAP to print following pattern
14 15 16 17
15 16 17 18
16 17 18 19
17 18 19 20
 */

 class Program3 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            int a=14+i-1;
            for(int j=1;j<=4;j++){
                System.out.print(a+" ");
                a++;
            }
            a++;
            System.out.println();
        }
    }
}
