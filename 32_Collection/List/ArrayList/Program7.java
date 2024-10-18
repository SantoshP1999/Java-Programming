import java.util.*;

class Movies{
    String movieName=null;
    double totalCollection=0.0;
    float imdbRating=0.0f;

    Movies(String movieName,double totalCollection,float imdbRating){
        this.movieName=movieName;
        this.totalCollection=totalCollection;
        this.imdbRating=imdbRating;
    }

    public String toString(){
        return "{"+movieName +","+totalCollection +","+imdbRating+"}";
    }

    
}

class SortByName implements Comparator{
    public int compare(Object obj1,Object obj2){
        return ((Movies)obj1).movieName.compareTo(((Movies)obj2).movieName);
    }

}

class SortByCollection implements Comparator{
    public int compare(Object obj1,Object obj2){
        return (int) ((((Movies)obj1).totalCollection)-(((Movies)obj2).totalCollection));
        
    }
}

class SortByIMDB implements Comparator{
    public int compare(Object obj1,Object obj2){
        return (int) ((((Movies)obj1).imdbRating)-(((Movies)obj2).imdbRating));
    }
}

class ArrayListSortDemo{
    public static void main(String[]args){
        ArrayList al=new ArrayList();

        al.add(new Movies("Gadar2",200.00,9.8f));
        al.add(new Movies("OMG2",250.00,7.5f));
        al.add(new Movies("Jailer2",240.00,6.8f));
        al.add(new Movies("Natsamrat",300.00,9.9f));
        al.add(new Movies("Ved",150.00,5.8f));

        System.out.println(al);                    //[{Gadar2,200.0,9.8}, {OMG2,250.0,7.5}, {Jailer2,240.0,6.8}, {Natsamrat,300.0,9.9}, {Ved,150.0,5.8}]

        Collections.sort(al,new SortByName());
        System.out.println(al);                    //[{Gadar2,200.0,9.8}, {Jailer2,240.0,6.8}, {Natsamrat,300.0,9.9}, {OMG2,250.0,7.5}, {Ved,150.0,5.8}]


        Collections.sort(al,new SortByCollection());
        System.out.println(al);                     //[{Ved,150.0,5.8}, {Gadar2,200.0,9.8}, {Jailer2,240.0,6.8}, {OMG2,250.0,7.5}, {Natsamrat,300.0,9.9}]


        Collections.sort(al,new SortByIMDB());
        System.out.println(al);                     //[{Ved,150.0,5.8}, {Jailer2,240.0,6.8}, {OMG2,250.0,7.5}, {Gadar2,200.0,9.8}, {Natsamrat,300.0,9.9}]
    }
    
}