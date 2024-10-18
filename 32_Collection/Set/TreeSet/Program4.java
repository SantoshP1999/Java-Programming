
import java.util.*;
class Movies implements Comparable{
    String movieName=null;
    float totalCollection=0.0f;

    Movies(String movieName,float totalCollection){
        this.movieName=movieName;
        this.totalCollection=totalCollection;
    }

    public int compareTo(Object obj){
        return (movieName.compareTo(((Movies)obj).movieName));  //for Descending order ......> return -(movieName.compareTo(((Movies)obj).movieName));
    }

    public String toString(){
        return movieName+":"+totalCollection;
    }
}

class TreeSetDemo{
    public static void main(String[]args){
        TreeSet ts=new TreeSet();
        ts.add(new Movies("Gadar2",250.5f));
        ts.add(new Movies("OMG22",200.5f));
        ts.add(new Movies("Jailer",300.5f));
        ts.add(new Movies("OMG2",200.5f));

        System.out.println(ts);
    }
}