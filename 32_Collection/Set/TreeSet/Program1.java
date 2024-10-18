import java.util.*;
class TreeSetDemo{
    public static void main(String[]args){
        TreeSet ts=new TreeSet();
        ts.add("Kanha");
        ts.add("Rahul");
        ts.add("Ashish");
        ts.add("Badhe");

        System.out.println(ts);             //[Ashish, Badhe, Kanha, Rahul]
    }
}