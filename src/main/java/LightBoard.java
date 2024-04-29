public class LightBoard
{
  /** The lights on the board, where true represents on and false represents off.
   */
  private boolean[][] lights;

  /** Constructs a LightBoard object having numRows rows and numCols columns.
   * Precondition: numRows > 0, numCols > 0
   * Postcondition: each light has a 40% probability of being set to on.
   */
  public LightBoard(int numRows, int numCols)
  {
    private int r = numRows;
    private int c = numCols;
    lights = new boolean [r][c];
    for(int i = 0; i < r; i++){
      for(int k = 0; k < c; i++){
        int j = (int)(Math.random()*10)
          if(j < 4)
            lights[r][c] = true;
          }
        }
  }

  /** Evaluates a light in row index row and column index col and returns a status
   *  as described in part (b).
   *  Precondition: row and col are valid indexes in lights.
   */
  public boolean evaluateLight(int row, int col)
  {
    /* to be implemented in part (b) */
    int count;
   if(lights[row][col]){
     count = 0;
     for(int i = 0; i < row; i++){
       if(lights[i][col])
         count ++;
     }
     if(count%2 == 0)
       return false;
   }
    if(count%3 == 0)
      return true;
   return lights.getLights();
  }
  public boolean[][] getLights()
  {
    return lights;
  }
  //used for testing
  public String toString()
  {
    String s = "";
    for (int r = 0; r < lights.length; r++)
    {
      for (int c = 0; c < lights[0].length; c++)
        if (lights[r][c])
          s += "*";
        else
          s += ".";
      s += "\n";
    }
    return s;
  }
  
}
