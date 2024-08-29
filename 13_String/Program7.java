//Identity HashCode

class StringDemo7{
    public static void main(String[]args){
        char ch='A';
        int x=65;

        System.out.println(System.identityHashCode(ch));        //1757689238
        System.out.println(System.identityHashCode(x));          //1151023939cd  

    }
}