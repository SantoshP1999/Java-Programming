class Program3{
    int empId=10;
    String name="Santosh";
    static int y=50;

    void empInfo(){
        System.out.println("ID:"+empId);
        System.out.println("Name:"+name);
        System.out.println("y:"+y);

    }
}

class Program3Main{
    public static void main(String[]args){
        Program3 obj1=new Program3();
        Program3 obj2=new Program3();

        obj1.empInfo();
        obj2.empInfo();

        System.out.println("==========================================");

        obj2.empId=20;
        obj2.name="Shivam";
        obj2.y=5000;

        obj1.empInfo();
        obj2.empInfo();

    }
}