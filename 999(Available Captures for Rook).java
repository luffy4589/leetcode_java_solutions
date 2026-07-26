class Solution {
    public int numRookCaptures(char[][] board) {
      int c=0,x=0,y=0;
      for(int i=0;i<8;i++){
        for(int j=0;j<8;j++){
          if(board[i][j]=='R'){
            x=i;
            y=j;
            break;
          }
        }
      }
      for(int i=x-1;i>=0;--i){
        if(board[i][y]=='B')  break;
        if(board[i][y]=='p'){
          c+=1;
          break;
        }
      }
      for(int i=x+1;i<8;++i){
        if(board[i][y]=='B')  break;
        if(board[i][y]=='p'){
          c+=1;
          break;
        }
      }
      for(int i=y-1;i>=0;--i){
        if(board[x][i]=='B')  break;
        if(board[x][i]=='p'){
          c+=1;
          break;
        }
      }
      for(int i=y+1;i<8;++i){
        if(board[x][i]=='B')  break;
        if(board[x][i]=='p'){
          c+=1;
          break;
        }
      }
      return c;
    }
}
