enum LineUp{
    Rohit,
    Virat,
    Shubhman,
    Ishan;

    public static void main(String[]args){
        LineUp player =LineUp.Virat;
        
        switch(player){
            case Rohit:
                System.out.println("Sharma");
                break;

            case Virat:
                System.out.println("Kohli");
                break;

            case Shubhman:
                System.out.println("Gill");
                break;

            case Ishan:
                System.out.println("Kishan");
                break;

            default:
                System.out.println("Player not found");
        }
    }
}