import java.util.*;

abstract class MyClass implements Comparable{
    String str=null;
    MyClass(String str){
        this.str=str;
    }

    public int compareTo(MyClass obj){
        return 1;    //(obj.str).compareTo(this.str);
    }

    public String toString(){
        return str;
    }
}
class TreeSetDemo{
    public static void main(String[]args){
        TreeSet ts=new TreeSet();
        ts.add(new String("Kanha"));
        ts.add(new String("Rahul"));
        ts.add(new String("Ashish"));
        ts.add(new String("Badhe"));

        System.out.println(ts);             //[Ashish, Badhe, Kanha, Rahul]
    }
}