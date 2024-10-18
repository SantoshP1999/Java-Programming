//Iterator

import java.util.*;
class IteratorDemo{
    public static void main(String[]args){
        ArrayList al=new ArrayList();
        al.add("Ashish");
        al.add("Kanha");
        al.add("Rahul");
        al.add("C2W");

        for(var x:al){
            System.out.println(x);
            //System.out.println(x).getClass().getName();


            //Iterator
            Iterator itr=al.iterator();

            while(itr.hasNext()){
                if("Ashish".equals(itr.next())){
                    itr.remove();
                }
            }
            System.out.println(al);

        }
    }
}