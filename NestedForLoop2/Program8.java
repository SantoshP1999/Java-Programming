/*WAP to print following pattern
A b C d
E f G h
I j K l
M n O p
 */

 class Program8 {
    public static void main(String[] args) {
        char ch1='A';
        char ch2='a';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(j%2==0){
                    System.out.print(ch2 +" ");
                }else{
                    System.out.print(ch1 +" ");
                }
                ch1++;
                ch2++;
               }
            System.out.println();
        }
    }
}
