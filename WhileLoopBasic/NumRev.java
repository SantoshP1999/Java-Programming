/*
 WAP that take number if number is even print that number in reverse order or if number is odd print that number in reverse order by difference 2
 i/p = 6
 o/p = 6 5 4 3 2 1 

 i/p=7
 o/p=7 5 3 1 
 */

class NumRev{
    public static void main(String[] args) {
        int no=7;
        int i=1;

            if(no%2==0){
            while(no>=i){
          
                System.out.print(no+" ");
                no--;
            }
        }else{
                
             while(no>=i){
            
                 System.out.print(no +" ");
                  no=no-2;
            }
        }
        System.out.println();
         
    }
}