class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();

        for( int i=0 ; i<numRows; i++){

            List<Integer>Rows = new ArrayList<>();

            for( int j=0; j<=i; j++){

                if( j == 0 || j == i){
                    Rows.add(1);
                }
                else {

            List<Integer>previousRows = pascal.get(i-1);
             Rows.add(previousRows.get(j-1) + previousRows.get(j));
        
                }
                      
            }
            pascal.add(Rows);
        }
            return pascal;
        
    }
}