/*WAP to print countdown of days to submit the Assignment 
i/p=7
o/p=7 days remaining
    6 days remaining
    5 days remaining
    .
    .
    1 days remaining
    0 days to Assignment is overdue
 */

class CountdownDays {
    public static void main(String[] args) {
       int day=0;
       if(day<=0){
        System.out.println("0 Days to Assignment is overdue");
       } else{
        while(day>=1){
            System.out.println(day+" days remaining");
            day--;
        }
       
       }
      
    }
}
