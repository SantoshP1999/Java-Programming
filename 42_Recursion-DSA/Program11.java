//  Sum of Digit 

//  Approach 3

class SumOfDigit{
    int sumDigit(int num){
        if(num==0){
            return 0;
        }
        return num%10 + sumDigit(num/10);
    }
    public static void main(String[]args){
        SumOfDigit obj=new SumOfDigit();
        int ret=obj.sumDigit(123);
        System.out.println(ret);
    }
}