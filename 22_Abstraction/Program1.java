//Abstract class Example

abstract class Baba{
    void getProperty(){
        System.out.println("Bunglow + Car");
    }

    abstract void marry();
}

class Shashi extends Baba{
    void marry(){
        System.out.println("Shashi=>Kriti Sanon");
    }
}

class Demo{
    public static void main(String [] args){
        Shashi s = new Shashi();  //We can create object of child class
        s.getProperty();        //Bunglow + Car
        s.marry();              //Shashi=>Kriti Sanon

        Baba b = new Shashi();   //We cannot create object of Abstract class But we can create its instance
        b.getProperty();      //Bunglow + Car
        b.marry();            //Shashi=>Kriti Sanon
    }
}
