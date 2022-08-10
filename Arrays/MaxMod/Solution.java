public class Solution {
    public int solve(ArrayList<Integer> arr) {

        int maxMod = 0;
        for(int i = 0; i< arr.size();i++){

            for(int j =0; i<arr.size(); i++){

                int mod = arr.get(i) % arr.get(j);
                if(mod > maxMod){
                    maxMod = mod;     
                }
            }
        }
        return maxMod;
    }
}
