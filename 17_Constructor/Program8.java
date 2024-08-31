//Magdi Information
class Demo8{
    int item=5;
    String product="Fries";

    void menu(){
        String menu1="Veg";
        String menu2="Non-Veg";

        System.out.println(item);
        System.out.println(product);
    }
}

class Users{
    public static void main(String[]args){
        Demo8 obj =new Demo8();

        obj.menu();
    }
}