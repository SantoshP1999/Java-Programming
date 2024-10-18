//Lambda Expression with one Parameter

interface  Core2Web{
    String lang(int noOfCourse);
}

class Year2023{
    public static void main(String[]args){
        Core2Web c2w=(xyz)-> "C,C++,Java,Python" +xyz ;
        System.out.println(c2w.lang(4));
    }
    
    
}