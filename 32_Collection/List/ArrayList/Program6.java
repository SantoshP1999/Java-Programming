import java.util.*;
class Employee{
    String name=null;
    float sal=0.0f;

    Employee(String name,float sal){
        this.name=name;
        this.sal=sal;
    }

    public String toString(){
        return "{"+name +":"+sal+"}";
    }

}

class SortByName implements Comparator<Employee>{
    public int compare(Employee obj1,Employee obj2){
        return obj1.name.compareTo(obj2.name);
    }
}

class SortBySal implements Comparator<Employee>{
    public int compare(Employee obj1,Employee obj2){
        return (int)(obj1.sal-obj2.sal);
    }
}



class ArrayListSortDemo{
    public static void main(String[]args){
        ArrayList<Employee> al=new ArrayList<Employee>();

        al.add(new Employee("Kanha",250000.00f));
        al.add(new Employee("Ashish",300000.00f));
        al.add(new Employee("Rahul",220000.00f));
        al.add(new Employee("Badhe",270000.00f));

        System.out.println(al);                     //[{Kanha:250000.0}, {Ashish:300000.0}, {Rahul:220000.0}, {Badhe:270000.0}]

        Collections.sort(al,new SortByName());
        System.out.println(al);                     //[{Ashish:300000.0}, {Badhe:270000.0}, {Kanha:250000.0}, {Rahul:220000.0}]


        Collections.sort(al,new SortBySal());
        System.out.println(al);                     //[{Rahul:220000.0}, {Kanha:250000.0}, {Badhe:270000.0}, {Ashish:300000.0}]
    }
}