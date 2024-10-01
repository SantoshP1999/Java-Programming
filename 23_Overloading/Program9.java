class Demo{
    void fun(String str1){
        System.out.println("String");
    }

    void fun(StringBuffer str2){
        System.out.println("StringBuffer");
    }
}

class DemoMain{
    public static void main(String [] args){
        Demo obj=new Demo();
        obj.fun("Core2Web");
        obj.fun(new StringBuffer("Core2Web"));
        obj.fun(null);      //Ambiguity
    }
}