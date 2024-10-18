//Lambda Expression by multiple parameters

interface Core2Web{
    String lang(String company1,String company2);
}

class Year2023{
    public static void main(String[]args){
        Core2Web c2w=(name1,name2)-> {
            return name1 + " & " + name2 +" by Shashi Bagal";
        };
        System.out.println(c2w.lang("Core2Web","BienCaps"));
    }
}