class Core2Web{
    int numOfCourses=8;
    private String favCourse="Java";
    void disp(){
        System.out.println(noOfCourses);
        System.out.println(favCourse);
    }
}

class Student{
    public static void main(String[]args){
        Core2Web obj=new Core2Web();
        obj.disp();

        System.out.println(obj.noOfCourses);
        System.out.println(obj.favCourse);      //error: favCourse has private access in Core2Web
        
    }
}