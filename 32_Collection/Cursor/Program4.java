//List Iterator................>ListIterator only works on List

import java.util.*;
class ListIteratorDedmo{
    public static void main(String[]args){
        List al=new LinkedList();
        al.add("Ashish");
        al.add("Kanha");
        al.add("Rahul");
        al.add("Badhe");

        ListIterator litr= al.listIterator();
        System.out.println(litr.getClass().getName());

        while(litr.hasNext()){
            System.out.println(litr.next());
        }

        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}