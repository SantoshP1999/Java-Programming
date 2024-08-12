/*WAP to print following pattern
F 5 D 3 B 1
F 5 D 3 B 1
F 5 D 3 B 1
F 5 D 3 B 1
F 5 D 3 B 1
F 5 D 3 B 1
 */

 class Program10 {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
             int a=6;
             char ch='F';
             for(int j=1;j<=6;j++){
                if(j%2==0){
                    System.out.print(a+" ");
                }else{
                    System.out.print(ch+" ");
                }
                 a--;
                 ch--;
            }
            System.out.println();
        }
    }
}
