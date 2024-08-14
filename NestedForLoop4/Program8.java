/*WAP to print following pattern
    10
    I  H
    7  6  5
    D  C  B  A
 */

 class Program8{
    public static void main(String[] args) {
        int n=4;
        int a=10;
        char ch='J';
       for(int i=1;i<=n;i++){
        
        for(int j=1;j<=i;j++){
             if(i%2==0){
                System.out.print(ch+" ");
            }else{
                System.out.print(a +" ");
                
            }
            a--;
            ch--;
            
        }
        //ch--;
        System.out.println();
       } 
    }
}