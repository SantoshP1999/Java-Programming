
//  Approach 2

class SumOfN{
    int fun(int num){
        if(num==1){
            return 1;
        }
        return num+fun(--num);
    }

    public static void main(String[]args){
        System.out.println("Start Main");
        SumOfN obj=new SumOfN();
        int retSum=obj.fun(5);
        System.out.println(retSum);
        System.out.println("End Main");
    }
}