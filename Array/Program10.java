// IntegerCache

class IntegerCacheDemo{
    public static void main(String [] args){
        int x=10;
        int y=10;
        Integer z=10;

        System.out.println(System.identityHashCode(x)); //434924654  ....Unique Number
        System.out.println(System.identityHashCode(y)); //434924654
        System.out.println(System.identityHashCode(z)); //434924654
    }
}

//on Integer cahe only one object created for x, y, z
//one object created for same value