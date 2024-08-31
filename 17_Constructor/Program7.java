class Demo7{
    String projName="OnlineEdu";
    int noOfEmp=20;
    void clientInfo(){
        String clientName="Core2Web";

        System.out.println(clientName);
        System.out.println(projName);
        System.out.println(noOfEmp);

    }
}

class C2W{
    public static void main(String[]args){
        Demo7 obj=new Demo7();
        obj.clientInfo();
    }
}