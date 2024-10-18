import java.util.*;
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