/*WAP to print following pattern
4 5 6 7 
4 5 6 7 
4 5 6 7
4 5 6 7
 */


class Program2 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            int a=4;
            for(int j=1;j<=4;j++){
                System.out.print(a +" ");
                a++;
            }
            System.out.println();
        }
    }
}
