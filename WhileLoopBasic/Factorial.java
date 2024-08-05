/*WAP to calculate factorial of given number
 * i/p=6
 * o/p=Factorial is 720
 */

class Factorial {
    public static void main(String[] args) {
        int no=6;
        int i=1;
        int fact=1;
        while(i<=no){
            fact=fact*i;
            
            i++;
        }
        System.out.println("Factorial is: "+fact);
    }
}
