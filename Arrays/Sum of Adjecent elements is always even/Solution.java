public class Solution {
    public int solve(ArrayList<Integer> A) {

        int oddCount = 0, evenCount = 0;

        for(int i = 0; i< A.size();i++){
            if(A.get(i)%2==0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        return evenCount < oddCount ? evenCount : oddCount;
    }
}
