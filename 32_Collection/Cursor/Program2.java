//Cursor

import java.util.*;
class CursorDemo{
    public static void main(String[]args){
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(10.5);
        al.add(30.5f);
        al.add("C2W");

        for(var x:al){
            System.out.println(x);
            System.out.println(x.getClass().getName());
        }
    }
}