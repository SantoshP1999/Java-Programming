//method append()

class InsertDemo{
    public static void main(String[]args){
        StringBuffer sb= new StringBuffer("SantoshCore2Web");
        System.out.println(sb);     //SantoshCore2Web

        sb.insert(7,"Phatangare");
        System.out.println(sb);     //SantoshPhatangareCore2Web
    }
}