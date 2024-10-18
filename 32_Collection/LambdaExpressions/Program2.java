//Syntax 3

interface Core2Web{
    String lang();
}

class Year2023{
    public static void main(String[]args){
        Core2Web c2w=()->{
            return "C,C++,Java,Python";
        };
        System.out.println(c2w.lang());
     }

    //===============Sysntax4===============

    // public static void main(String[]args){
    //     Core2Web c2w=()-> "C,C++,Java,Python";
    //     System.out.println(c2w.lang());
    // }

}