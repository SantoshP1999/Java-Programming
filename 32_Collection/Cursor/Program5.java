//Enumeration

import java.util.*;
class EnumerationDemo{
    public static void main(String[]args){
        Vector v=new Vector();
        v.add("Ashish");
        v.add("Kanha");
        v.add("Rahul");
        v.add("Badhe");

        //Enumeration

        Enumeration cursor=v.elements();
        System.out.println(cursor.getClass().getName());

        while(cursor.hasMoreElements()){
            System.out.println(cursor.nextElement());
        }
    }
}