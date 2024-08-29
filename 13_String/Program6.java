class StringDemo6{
    public static void main(String[]args){
        char str[]={'C','2','W'};

        System.out.println(str);                    //C2W
        System.out.println("String is "+str);       //String is [C@251a69d7
    }
}

/*
    when we concat Array with any Double cote String then it return the identityHashCode of given Array

    If anythings or Object comes with String then it internally call to toString() method
 */