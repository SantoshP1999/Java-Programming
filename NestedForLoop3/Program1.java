/*WAP to print following pattern
    C2W
    C2W C2W
    C2W C2W C2W
    C2W C2W C2W C2W
 */

class Program1{
    public static void main(String[] args) {
        int n=4;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("C2W"+" ");;
        }
        System.out.println();
       } 
    }
}