class RealTimeEX {
    public static void main(String[] args) {
        int money=5500;
        if(money>5000){
            System.out.println("Goa Trip");
        }else if(money<=5000 && money>=3000){
            System.out.println(" Raigad Fort Trip");
        }else if(money<3000 && money>1000){
            System.out.println("Sinhagad Fort Trip");
        }else{
            System.out.println("Stay in Home");
        }
    }    
}
