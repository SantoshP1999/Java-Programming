//  Sum of Digit 

//  Approach 2

class SumOfDigit{
    int sum=0;
    int sumDigit(int num){
        if(num==0){
         return sum;
        }
        sum=sum+num%10;
        num=num/10;
        sumDigit(num);
        return sum;
    }

    public static void main(String[]args){
        SumOfDigit obj=new SumOfDigit();
        int ret=obj.sumDigit(123);
        System.out.println(ret);
    }
}