// Interface Example

interface Yewale{
    void makingTea();
    default void creamRoles(){           // writting body in Intrface is not allowed upto java version 1.7===
        System.out.println("We making our own CreamRoles");//writting body in Intrface is allowed from java version 1.8.......>
    }                                                       //If we write body in interface then we write default word
}

class puneYewale implements Yewale{
     public void makingTea(){
        System.out.println("Open at 5 AM");
        System.out.println("Best Taste");
    }
}

class baramatiYewale implements Yewale{
    public void makingTea(){
        System.out.println("Open at 7 AM");
        System.out.println("Best Taste");
    }
}

class TeaLover{
    public static void main(String[]args){
        Yewale y=new puneYewale();
        y.makingTea();
        y.creamRoles();

        Yewale y1=new baramatiYewale();
        y1.makingTea();
        y1.creamRoles();
    }
}
