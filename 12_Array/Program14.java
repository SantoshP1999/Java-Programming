class ArrayDemo14{
    static void fun(int x,int y){
        System.out.println(x);     //10
        System.out.println(y);  //20

        x=x+10;
        y=y+10;

        System.out.println(x);  //20
        System.out.println(y);  //30
    }

    public static void main(String[]args){
        int x=10;
        int y=20;

        System.out.println(x);  //10
        System.out.println(y);  //20

        fun (x,y);
        System.out.println(x);  //10
        System.out.println(y);  //20
    }
}