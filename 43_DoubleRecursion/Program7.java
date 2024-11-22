
//  Fibonacci Series

//  Approach 2..........Recursion

class FibonacciSeries{
    int fibo(int num){
        if(num<1){
            return num;
        }
        return fibo(num-2)+fibo(num-1);
    }

    public static void main(String[]args){
        int num=5;
        FibonacciSeries obj=new FibonacciSeries();
        int retVal= obj.fibo(num);
        
        System.out.println(retVal);
    }
}