/*WAP to print following pattern
c2w1 c2w2 c2w3
c2w1 c2w2 c2w3
c2w1 c2w2 c2w3
 */

 class Program1 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            int a=1;
            for(int j=1;j<=3;j++){
                System.out.print("C2W"+a+""+" ");
                a++;
            }
            System.out.println();
        }
    }
}
