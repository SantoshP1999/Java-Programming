//Method Overriding Example
class Baba{
    void getProperty(){
        System.out.println("Bunglow");
    }

    void career(){
        System.out.println("Shashi Doctor vhava");
    }

    void marry(){
        System.out.println("Shashi=>Deepika Padukon");
    }
}

class Shashi extends Baba{
    void career(){
        System.out.println("Shashi Teacher & Engineer zala");
    }

    void marry(){
        System.out.println("Shashi=>Kriti Sanon");
    }
}

class Kaka{
    public static void main(String [] args){
        Baba b=new Baba();
        b.getProperty();          //Bunglow
        b.career();               //Shashi Doctor vhava
        b.marry();                //Shashi=>Deepika Padukon

        Shashi s= new Shashi();
        s.getProperty();           //Bunglow
        s.career();                //Shashi Teacher & Engineer zala
        s.marry();                  //Shashi=>Kriti Sanon

        Baba b1=new Shashi();
        b1.getProperty();          //Bunglow
        b1.career();               //Shashi Teacher & Engineer zala
        b1.marry();                //Shashi=>Kriti Sanon
    }
}