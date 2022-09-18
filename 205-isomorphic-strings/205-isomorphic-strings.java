import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        //All occurrences of a character must be replaced with another character while preserving the order of characters. 
        
        //No two characters may map to the same character, but a character may map to itself.
        
        // s and t ; s-> t
        HashMap<Character,Character> mapped = new HashMap<>();
        HashSet<Character> added = new HashSet<>();
            
        for(int i=0; i<s.length();i++){
            if(mapped.get(s.charAt(i))==null){
                if(added.contains(t.charAt(i))) return false;
                mapped.put(s.charAt(i),t.charAt(i));
                added.add(t.charAt(i));
            }  
            else{
                if(mapped.get(s.charAt(i))!=t.charAt(i)) return false;
            }
        }
        return true;
   }
}