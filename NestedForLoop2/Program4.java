/*WAP to print following pattern
1A 2B 3C
1A 2B 3C
1A 2B 3C
 */

 class Program4 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            int a=1;
            char ch='A';
            for(int j=1;j<=3;j++){
                System.out.print(a+""+ch+" ");
                a++;
                ch++;
            }
            System.out.println();
        }
    }
}
