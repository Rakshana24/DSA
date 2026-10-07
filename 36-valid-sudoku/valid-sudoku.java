class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0;i<9;i++){
            List<Character> list=new ArrayList<>();
            Set<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                if(Character.isDigit(board[i][j])){
                list.add(board[i][j]);
                set.add(board[i][j]);
                }
            }
            if(list.size()!=set.size()){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            List<Character> list=new ArrayList<>();
            Set<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                if(Character.isDigit(board[j][i])){
                list.add(board[j][i]);
                set.add(board[j][i]);
                }
            }
            if(list.size()!=set.size()){
                return false;
            }
        }
        for(int row=0; row<9; row+=3){
    for(int col=0; col<9; col+=3){

        Set<Character> set = new HashSet<>();

        for(int i=row; i<row+3; i++){
            for(int j=col; j<col+3; j++){

                if(Character.isDigit(board[i][j])){

                    if(!set.add(board[i][j])){
                        return false;
                    }
                }
            }
        }
    }
}
        return true;

        
    }
}