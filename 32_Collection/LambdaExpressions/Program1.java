interface Core2Web{
    void lang();
}

class Year2023{

    //=================Syntax 1==========================

    public static void main(String[]args){
        Core2Web c2w=()->{
            System.out.println("C,C++,Java,Pyhton");
        };
        c2w.lang();
    }

    //=================Syntax 2==========================

    // public static void main(String[]args){
    //     Core2Web c2w=()->System.out.println("C,C++,Java,Pyhton..");
    //     c2w.lang();
    // }
}