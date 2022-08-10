public class Solution {
    public int solve(String A) {

        int count = 0;
        int count0 = 0;
        int count1 = 0;

        for(int i=0; i<A.length();i++)
        {
            if(A.charAt(i)=='0'){
                count0++; 
            }
            else if (A.charAt(i)=='1'){
                count1++;
            }
            if(count0 == count1){
                count++;
                count0 = 0;
                count1 = 0;
            }
        }
        return count;

    }
}
