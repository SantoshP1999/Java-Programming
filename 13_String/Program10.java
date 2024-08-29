class StringDemo10{
    public static void main(String [] args){
        String str1="Santosh";
        String str2=new String("Santosh");

        if(str1==str2){                     //Compare identityHashCode
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");     //Not Equal
        }
    }
}

/*The result retun the Not equal because if(str==str2) compare the identityHashCode of the Strings
-It doesnt compare the content of the Strings */