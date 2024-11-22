//  Non-Tail Recursion

class Recursion{
    void fun(int num){
        if(num==0){
            return;
        }
         fun(--num);                    ////////////
        System.out.println(num);        /////////
       
    }

    public static void main(String[]args){
      System.out.println("Start main");  
      Recursion obj=new Recursion();
      obj.fun(2);
      System.out.println("End Main");
    }
}