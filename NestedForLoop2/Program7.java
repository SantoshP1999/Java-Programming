/*WAP to print following pattern
1  2  9
4  25 6
49 8  81
 */

 class Program7 {
    public static void main(String[] args) {
        int a=1;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                if(a%2==0){
                    System.out.print(a+" ");
                    a++;
                }else{
                    System.out.print(a*a +" ");
                    a++;
                }
            }
            System.out.println();
        }
    }
}
