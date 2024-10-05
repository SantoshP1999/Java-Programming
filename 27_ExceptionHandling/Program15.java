class Demo{
    public static void main(String[]args){
        for(int i=0;i<5;i++){
            System.out.println("In Loop");
        }
        try{
            Thread.sleep(3000);
        }catch(InterruptedException obj){
            
        }
    }
}