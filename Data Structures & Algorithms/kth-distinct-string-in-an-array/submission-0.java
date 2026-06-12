class Solution {
    public String kthDistinct(String[] arr, int k) {

        int n = arr.length;

        HashMap<String,Integer> counts = new HashMap<>();

        int distinctcount = 0; 

        for (String s: arr){
            counts.put(s,counts.getOrDefault(s,0) + 1);
        }

        for (String s: arr){
            if (counts.get(s) == 1){
            distinctcount++;
            if (distinctcount == k){
                return s;
            }
        }
    }
    return "";


        
    }
}