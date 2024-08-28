//Command Line Arguments

class ArrayDemo18{
    public static void main(String [] args){
        String friends[]={"Santosh","Shivam","Shiva","Suraj","Shital"};
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}

/*

javac Program18.java
java ArrayDemo18 10 20 30

output:
    10
    20
    30   

*/