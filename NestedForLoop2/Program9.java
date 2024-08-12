/*WAP to print following pattern
1C3  4B2  9A1
16C3 25B2 36A1
49C3 64B2 81A1
 */

 class Program9 {
    public static void main(String[] args) {
        int a=1;
        for(int i=1;i<=3;i++){
            char ch='C';
            int b=3;
            for(int j=1;j<=3;j++){
                System.out.print(a*a+""+ch+""+b+" ");
                a++;
                b--;
                ch--;
            }
            System.out.println();
        }
    }
}
