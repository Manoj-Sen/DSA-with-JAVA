public class Max_sum_SubArray
{
	public static void main(String[] args) {
		int[] Arr = {100 ,200 ,300 ,400};
		int K = 2;
		System.out.println(maxsubArray(Arr , K));
	}
	
	static int maxsubArray(int[] Arr,int K){
	    int ans = 0;
      int sum = 0;
        
        for(int i=0;i<Arr.length;i++){
            if(i<K){
                sum+=Arr[i];
            }else{
                ans = Math.max(ans,sum);
                sum+=Arr[i];
                sum-=Arr[i-K];
            }
        }
        int max  = Math.max(ans,sum);
        
        return max;
	}
}
