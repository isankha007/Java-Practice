package com.sankha.misc.comp;

public class DemoRunner {
    public static void main(String[] args) {
        int rowNumber=4;
        int end=0;
        for(int i=0;i<rowNumber-1;i++){
            end+=i+1;
            //System.out.println(" ==  "+end);
        }
        //System.out.println(end);
        int count=0;
        int temp=0;
        int start=end+1;
        System.out.println(start);
        while(count<rowNumber){
            temp+=(start+count);
            count++;
        }
        System.out.println("Sum ="+temp);

        ///max subarray sum
        int[] arr=   {-5, -3, 4, -2, 7, 5, -3};  //{-5, -3, 1, -4, 5, 9, -3};
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        int resEnd=0,resStart=0;
        int i=0,j=0;
        while(j<arr.length ){
            sum+=arr[j];
            if(sum>maxSum){
                maxSum=sum;
                resStart=i;
                resEnd=j;

            }
            if(sum<0){
                sum=0;
                i=j+1;
            }
            j++;
        }
       /* for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(maxSum<sum){
                maxSum=sum;
                resStart=j;
                resEnd=i;
            }
            if(sum<0){
                sum=0;
                j=j+1;
            }
        }*/
        for(int k=resStart;k<=resEnd;k++){
            System.out.print(arr[k]+",");
        }
        //System.out.println("Start "+resStart+" End "+resEnd);

        int Integer = 24;
        char String  = 'I';
        System.out.print(Integer);
        System.out.print(String);
    }
}
