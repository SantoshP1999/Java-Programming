/*WAP to count the Odd digits of given number
 * i/p=942111423
 * o/p=count of Odd digit=4
 */

class CountOddDigit {
    public static void main(String[] args) {
        int no=942111423;
        int count=0;
        while(no!=0){
            int rem=no%10;

            if(rem%2==1){
                count++;
            }
            no=no/10;
        }
        System.out.print("Count of Odd Digit is :"+count);
    }
}
