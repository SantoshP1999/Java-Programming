class ArrayDemo17{

    public static void main(String ... args){
        int arr[]={10,20,30,40};

        String friends[]={"Santosh","Shivam","Shiva","Suraj","Shital"};

        for(String x : friends){
            System.out.println(x);
        }

        for(int x : arr){
            System.out.println(x);
        }
    }
}