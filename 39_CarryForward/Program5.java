/*
    Given an character array(lowercase)
    return the count of pair(i,j) such that 
        a)i<i
        b)arr[i]='a'
        arr[j]='g'

        arr=[a,b,e,g,a,g]
        O/P=3

*/

//1) Appoach 2

class PairCode{
    public  static void main(String[]args){
        char arr[]=new char[]{'a','b','e','g','a','g'};
        int count=0;
        for(int i=0;i<arr.length;i++){
            
                if(arr[j]=='g'){
                    count++;
                }
            
        }
        System.out.println(count);
    }
}