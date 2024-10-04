class Outer{
    int x=10;
    static int y=20;

    class Inner{
        final static int a=30;
    }
}

class Client{
    public static void main(String[]args){
        System.out.println(Outer.y);
        Outer obj=new Outer();
        System.out.println(obj.x);
       // Outer.Inner obj1=new Inner();
        System.out.println(obj.new Inner().a);
    }
}