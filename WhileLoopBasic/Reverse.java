/*WAP to reverse the given number
 i/p=942111423
 o/324111249
 */

class Reverse {
    public static void main(String[] args) {
        int N=942111423;
        int rev=0;

        while(N!=0){
            int rem=N%10;
            rev=rev*10+rem;
            N=N/10;
           
        }
        System.out.println(rev);
    }
    
}
