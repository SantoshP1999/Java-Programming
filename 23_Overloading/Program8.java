class Demo{
    void fun(int x,float y){
        System.out.println("In int-float Para");
    }

    void fun(float x,int y){
        System.out.println("In float-int Para");
    }
}

class DemoMain{
    public static void main(String[]args){
        Demo obj=new Demo();
        obj.fun(10,10);     //obj.fun(10,10.5f);===============>error:reference to fun is ambiguous
    }
}