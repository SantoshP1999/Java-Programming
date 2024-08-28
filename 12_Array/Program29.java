class ArrayDemo29{
    public static void main(String[]args){
        int arr[][]={{10,20,30},{40,50,60}};
        for(int x[] : arr){
            for(int y : x){
                System.out.println(x);
            }
        }
    }
}

/*
[I@7ad041f3
[I@7ad041f3
[I@7ad041f3
[I@251a69d7
[I@251a69d7
[I@251a69d7

*/