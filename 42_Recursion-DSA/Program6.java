
//  Approach 1

class SumOfN{
    void fun(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }

    public static void main(String[]args){
        System.out.println("Start Main");
        SumOfN obj=new SumOfN();
        obj.fun(5);
        System.out.println("End Main");
    }
}