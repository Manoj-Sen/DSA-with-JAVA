class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        ArrayList<Integer> copy = new ArrayList<>(arr);

        do {
            ans.add(new ArrayList<>(arr));
            arr = nextPermutation(arr, n);
        } while (!copy.equals(arr));
    
     Collections.sort(ans, (a, b) -> {
            for (int i = 0; i < n; i++) {
                int cmp = Integer.compare(a.get(i), b.get(i));
                if (cmp != 0) {
                    return cmp;
                }
            }
            return 0;
        });
        
        return ans;
    }

    private static ArrayList<Integer> nextPermutation(ArrayList<Integer> arr, int n) {
        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) < arr.get(i + 1)) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            Collections.reverse(arr);
            return arr;
        }

        for (int i = n - 1; i > ind; i--) {
            if (arr.get(i) > arr.get(ind)) {
                Collections.swap(arr, i, ind);
                break;
            }
        }

        List<Integer> sublist = arr.subList(ind + 1, n);
        Collections.reverse(sublist);

        return arr;
    }
};
