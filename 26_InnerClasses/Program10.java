//NOTE: static are not allowed in Inner class


class Outer{
    int x=10;
    static int y=20;
    void m1(){
        int a=30;
        static int b=30;           //error:static modifire not allowed here
    }

    public static void main(String[]args){
        int p=50;
        static int q=60;        //error:static modifire not allowed here
    }
}

/*

NOTE: static are not allowed in Inner class

    we cannot write static variables in any block

    static is only allowed in class not allowed in any method
    because the priority of static is comes first hence it is not allowed in any block & method

    After the static block sequence static variables & static methods are comes

*/