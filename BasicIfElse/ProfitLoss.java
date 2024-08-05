class ProfitLoss {
    public static void main(String[] args) {
        int sellingPrice=1200;
        int costPrice=1500;

        if(costPrice<sellingPrice){
            System.out.println("profit of "+(sellingPrice-costPrice));
        }else if(costPrice>sellingPrice){
            System.out.println("Loss of" +(costPrice-sellingPrice));
        }else{
            System.out.println("No profit or loss");
        }
    }
}
