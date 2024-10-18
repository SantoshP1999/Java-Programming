import java.util.*;
class HashMapDemo{
    public static void main(String[]args){
        HashMap hm=new HashMap();

        hm.put("Java",".java");
        hm.put("Python",".py");
        hm.put("Dart",".dart");
        hm.put("C++",".cpp");

        System.out.println(hm);                 //{Java=.java, C++=.cpp, Python=.py, Dart=.dart}


        //get()
        System.out.println(hm.get("Python"));       //  .py

        //keySet()
        System.out.println(hm.keySet());            //[Java, C++, Python, Dart]

        //values()
        System.out.println(hm.values());            //[.java, .cpp, .py, .dart]

        //entrySet()
        System.out.println(hm.entrySet());          //[Java=.java, C++=.cpp, Python=.py, Dart=.dart]

        
    }
}