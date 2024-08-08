/*WAP to print following pattern
12 12 12
11 11 11
10 10 10
 */

 class Program5 {
    public static void main(String[] args) {
        int a=12;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.print(a +" ");
                
            }
           a--;
            System.out.println();
        }
    }
}
