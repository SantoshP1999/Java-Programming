class PythagoreanTriplets {
    public static void main(String[] args) {
        int a=3,b=4,c=5;
        if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b){
            System.out.println("Triangle is Pythagorean Triplets");
        }else {
            System.out.println("Triangle is not Pythogorean Triplets");
        }
    }
}
