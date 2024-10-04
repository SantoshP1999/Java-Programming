//     4)......Annonymous Inner class

class Demo{

}
class Client{
    public static void main(String[]args){
        Demo obj=new Demo(){

        };                          //here Annonymous Inner class are created...........>   };
    }
}


/*

After compilation 3 class file are created

    1).Client.class
    2).Demo.class
    3).'Client$1.class'

*/