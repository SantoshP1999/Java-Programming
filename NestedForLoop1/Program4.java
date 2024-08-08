/*WAP to print following pattern
1A 1A 1A
1A 1A 1A
1A 1A 1A
 */

 class Program4 {
    public static void main(String[] args) {
        int a=1;
        char ch='A';
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.print(a +""+ch+" ");
        
            }
           
            System.out.println();
        }
    }
}
