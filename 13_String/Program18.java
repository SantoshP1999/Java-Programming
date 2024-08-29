//method equals()

class EqualsDemo{
    public static void main(String[]args){
        String str1="Santosh";
        String str2=new String("Santosh");

        System.out.println(str1.equals(str2));      //true
    }
}

/**
 str1 & str2 both are different objects
 equals() method check the content of the strins ...it dont check the identityHashCode
 */