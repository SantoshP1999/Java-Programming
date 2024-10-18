import java.util.*;
class HashtableDemo{
    public static void main(String[]args){
        Hashtable ht=new Hashtable();
        ht.put(10,"Sachin");
        ht.put(7,"MSD");
        ht.put(18,"Virat");
        ht.put(1,"KLRahul");
        ht.put(45,"Rohit");

        System.out.println(ht);                     //{10=Sachin, 18=Virat, 7=MSD, 45=Rohit, 1=KLRahul}
    }
}