/*WAP to count the digits of given number
 * i/p=942111423
 * o/p=count of digit=9
 */

class CountDigit {
    public static void main(String[] args) {
        int no=942111423;
         int count=0;
        int i=1;
        while(no!=0){
           int rem = no%10;
           no=no/10;
        count++;
        }
        System.out.println("count of Digit "+count);
    }
}
