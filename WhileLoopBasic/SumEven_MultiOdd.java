/*WAP to print sum of all even numbers & Multiplication of Odd numbers between 1 to 10
  
 sum of even no = 30
 Multiplication of odd no = 945
 */
class SumEven_MultiOdd {
    public static void main(String[] args) {
        int N=10;
        int sum=0;
        int mult =1;
        int i=1;

        while(i<=N){
            if(i%2==0){
                sum=sum+i;
            }else{
                mult=mult*i;
            }
            i++;

        }
        System.out.println("Sum of even no:"+sum);
        System.out.println("Multiplication of Odd no:"+mult);
        
    }
}
