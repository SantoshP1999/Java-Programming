/*WAP to print following pattern
    F
    E 1
    D 2 E
    C 3 D 4
    B 5 C 6 D
    A 7 B 8 C 9
 */

 class Program7{
    public static void main(String[] args) {
        int n=6;
        int a=1;
        char ch='F';
       for(int i=1;i<=n;i++){
        char temp=ch;
        for(int j=1;j<=i;j++){
             if(j%2==0){
                System.out.print(a+" ");
                a++;
            }else{
                System.out.print(temp +" ");
                temp++;
            }
            
        }
        ch--;
        System.out.println();
       } 
    }
}