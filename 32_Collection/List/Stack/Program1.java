import java.util.*;
class StackDemo{
    public static void main(String[]args){
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println(s);                                  //[10, 20, 30, 40, 50]

        s.pop();
        System.out.println(s);                                  //[10, 20, 30, 40]

        s.peek();  
        System.out.println(s);                                  //[10, 20, 30, 40]
    }
}