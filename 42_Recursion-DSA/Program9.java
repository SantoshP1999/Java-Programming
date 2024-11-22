//  Sum of Digit 

//  Approach 1

class SumOfDigit{
    int sumDigit(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        return sum;
    }

    public static void main(String[]args){
        SumOfDigit obj=new SumOfDigit();
        int ret=obj.sumDigit(123);
        System.out.println(ret);
    }
}