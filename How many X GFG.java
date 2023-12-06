class Solution {
    int countX(int L, int R, int X) {
       int count = 0;
       
       for(int i=L+1;i<R;i++){
           int temp = i;
           
           while(temp>0){
               if(temp%10==X){
                   count++;
               }
               temp/=10;
           }
       }
       return count;
    }
};
