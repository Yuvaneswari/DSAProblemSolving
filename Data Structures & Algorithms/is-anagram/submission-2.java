class Solution {
    public boolean isAnagram(String s, String t) {

       
          if(s.length() != t.length()){
        
            return false;
          }
           HashMap< Character,Integer> mp = new HashMap<>();
        for ( char ch : s.toCharArray()){
            mp.put(ch ,mp. getOrDefault (ch,0)+1 );
            
        }
           for ( char ch : t.toCharArray()){
            mp.put(ch, mp. getOrDefault (ch,0)  - 1);   
    }
       for( int val : mp.values()){
        if ( val != 0){
            return false;
        }
       }
       return true;
    }
}