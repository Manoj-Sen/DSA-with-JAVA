class Solution {
    String printLargest(int n, String[] arr) {
        Arrays.sort(arr, (a,b) -> (b+a).compareTo(a+b));
        return arr[0].equals("0")?"0":String.join("", arr);
    }
}
