
//  Approach 3

class SumOfN{
    int sum=0;
    int fun(int num){
        if(num==0){
            return 1;
        }
        sum=sum+num;
        fun(--num);
        return sum;
    }

    public static void main(String[]args){
        System.out.println("Start Main");
        SumOfN obj=new SumOfN();
        int retSum=obj.fun(5);
        System.out.println(retSum);
        System.out.println("End Main");
    }
}