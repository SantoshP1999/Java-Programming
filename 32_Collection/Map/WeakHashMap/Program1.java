
//Working of Garbage Collector
import java.util.*;
class Demo{
    String str;
    Demo(String str){
        this.str=str;
    }

    public String toString(){
        return str;
    }

    public void finalize(){
        System.out.println("Notify");
    }
}

class GCDemo{
    public static void main(String[]args){
        Demo obj1=new Demo("Core2Web");
        Demo obj2=new Demo("Biencaps");

        System.out.println(obj1);
        System.out.println(obj2);

        obj1=null;

        System.gc();
        System.out.println("In main");

    }
}