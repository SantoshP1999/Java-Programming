
//  Equilibrium Index

class Equilibrium{
    public static void main(String[]args){
        int flag =0;
        int leftSum=0;
        int rightSum=0;
        
        int arr[]=new int[]{-7,1,5,2,-4,3,0};
        for(int i=0;i<arr.length;i++){
            

            for(int j=0;j<i;j++){
                leftSum=leftSum+arr[j];
            }

            for(int j=i+1;j<arr.length;j++){
                rightSum=leftSum+arr[j];
            }

            if(leftSum==rightSum){
                flag=1;
                System.out.println(i);
                break;
            }
        }
        if(flag==0){
                System.out.println(-1);

        }
    }
}