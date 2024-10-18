/*.................Cursors..................
4 Types of Cursors
    1)Iterator
    2)ListIterator
    3)Enumeration
    4)SplitIterator

*/



//............1)Iterator(Universal Cursor)

import java.util.*;
class IteratorDemo{
    public static void main(String[]args){
        ArrayList al=new ArrayList();
        al.add("Kanha");
        al.add("Rahul");
        al.add("Ashish");

        Iterator itr=al.iterator();
        while(itr.hasNext()){
            if("Rahul".equals(itr.next()));
            itr.remove();
            System.out.println(itr.next());
        }
        //System.out.println(al);
    }
}