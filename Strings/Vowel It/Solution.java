public class Solution {
    public String solve(String str) {
        
        String vowels = "";
        for(int i=0; i<str.length(); i++) 
            if(str.charAt(i)=='a' || str.charAt(i) =='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
               vowels += str.charAt(i);
                 
        }
        return vowels;
    }

}
