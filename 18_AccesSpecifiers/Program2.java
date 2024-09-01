class Employee{
    int empId=10;
    String name="Santosh";
    void empInfo(){
        System.out.println("ID="+empId);
        System.out.println("Name="+name);

    }
}

class MainDemo{
    public static void main(String args[]){
        Employee emp1=new Employee();
        emp1.empInfo();
        
        System.out.println(emp1.empId);
        System.out.println(emp1.name);
    }
}