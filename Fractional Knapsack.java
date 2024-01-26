class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        Arrays.sort(arr, Comparator.comparingDouble(item -> -1.0 * item.value / item.weight));

        double maxValue = 0.0;

        for(int i=0;i<n;i++){
            if(W==0){
                break;
            }
            int quantity = Math.min(W, arr[i].weight);

            maxValue += (1.0 * arr[i].value * quantity) / arr[i].weight;

            W -= quantity;
        }

        return maxValue;
    }
}
