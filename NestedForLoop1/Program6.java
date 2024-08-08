/*WAP to print following pattern
9 8 7
9 8 7 
9 8 7
 */

 class Program6 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            int a=9;
            for(int j=1;j<=3;j++){
                System.out.print(a +" ");
                a--;
            }
            System.out.println();
        }
    }
}
