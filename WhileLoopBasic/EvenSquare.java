/*WAP to print the square of even digits of the given number
 * i/p=942111423
 * o/p=4 16 4 16
 */

class EvenSquare{
    public static void main(String[] args) {
        int no=942111423;
        while(no!=0){
            int rem=no%10;
            if (rem%2==0){
                System.out.print (rem * rem+" ");

            }
            no=no/10;
        }
        System.out.println();
    }
}