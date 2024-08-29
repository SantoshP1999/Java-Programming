class StringDemo11{
    public static void main(String[]args){
        String str1="Santosh";
        String str3="Phatangare";

        String str2=str1 + str3;
        String str4=str1.concat(str3);
    
        System.out.println(str2);       //SantoshPhatangare
        System.out.println(str4);       //SantoshPhatangare
            
        
    }
}

/*
 In str1+str2 + is internally called append() method
 append() method is a method of StringBuilder class
 append() method return a new String
 */