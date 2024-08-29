//method charAt() Demo
class CharAtDemo{
    public static void main(String []args){
        String str="Core2Web";

        System.out.println(str.charAt(4));      //2
        System.out.println(str.charAt(0));      //C
        System.out.println(str.charAt(8));      //StringIndexOutOfBoundsException

    }
}