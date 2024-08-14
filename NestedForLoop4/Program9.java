/*WAP to print following pattern
   
    1
    8   9
    27  16  125
    64  25  216  49
 */

 class Program9{
    public static void main(String[] args) {
        int n=4;
        int a=1;
       for(int i=1;i<=n;i++){
        int temp=a;
        for(int j=1;j<=i;j++){
             if(j%2==0){
                System.out.print(temp*temp +" ");
            }else{
                System.out.print(temp*temp*temp +" ");
            }
            temp++;
            
        }
        a++;
        System.out.println();
       } 
    }
}