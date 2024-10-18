import java.util.*;
class NavigableSetDemo{
    public static void main(String[]args){
        NavigableSet ns=new TreeSet();
        ns.add(10);
        ns.add(30);
        ns.add(14);
        ns.add(27);
        ns.add(23);

        System.out.println(ns);                 //[10, 14, 23, 27, 30]

        //lower()
        System.out.println(ns.lower(23));        //14

        //floor()
        System.out.println(ns.floor(23));       //23

        //celing()
        System.out.println(ns.ceiling(23));     //23

        //higher()
        System.out.println(ns.higher(23));      //27

       

        //descendingSet()
        System.out.println(ns.descendingSet());     //[30, 27, 23, 14, 10]

        //iterator()
        Iterator itr=ns.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());         
        }

        //descendingIterator()

        Iterator itr2=ns.descendingIterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        //subSet()
        System.out.println(ns.subSet(10,true,27,false));        //[10, 14, 23]

        //headSet()
        System.out.println(ns.headSet(23,true));                //[10, 14, 23]

        //tailSet()
        System.out.println(ns.tailSet(10,true));                //[10, 14, 23, 27, 30]

        //subSet()
        System.out.println(ns.subSet(14,27));                   //[14, 23]

        //headSet()
        System.out.println(ns.headSet(23));                     //[10, 14]

        //tailSet()
        System.out.println(ns.tailSet(23));                     //[23, 27, 30]

       //pollFirst()
        System.out.println(ns.pollFirst());                     //10

        //pollLast()
        System.out.println(ns.pollLast());                      //30
    }
}