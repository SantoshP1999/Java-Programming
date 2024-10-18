//Dictionary & Dictionary methods

import java.util.*;
class DictionaryDemo{
    public static void main(String[]args){
        Dictionary d=new Hashtable();
        d.put(10,"Sachin");
        d.put(7,"MSD");
        d.put(18,"Virat");
        d.put(1,"KLRahul");
        d.put(45,"Rohit");

        System.out.println(d);              //{10=Sachin, 18=Virat, 7=MSD, 45=Rohit, 1=KLRahul}


        //keys()
        Enumeration itr1=d.keys();
        while(itr1.hasMoreElements()){
            System.out.println(itr1.nextElement());
        }

        //elements()
        Enumeration itr2=d.elements();
        while(itr2.hasMoreElements()){
            System.out.println(itr2.nextElement());
        }

        //get()
        System.out.println(d.get(10));                  //Sachin

        //remove()
        d.remove(1);
        System.out.println(d);                              //{10=Sachin, 18=Virat, 7=MSD, 45=Rohit}



    }
}