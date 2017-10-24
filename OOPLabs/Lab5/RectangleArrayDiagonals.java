  import java.util.Scanner;

  class RectangleArrayDiagonals
  {
    public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);
      System.out.print("height: ");
      int height = s.nextInt();
      System.out.print("width: ");
      int width = s.nextInt();
            
      char [][] sq = new char [height][width];
      
      String line;

      // fill the array
      for (int i = 0; i < height; i++)
      {
        for (int j = 0; j < width; j++)
        {
          sq[i][j] = 'o';
        }
      }

      int c = 0, r = 0, q = width - 1;
      while(c < width && r < height){
        sq[c][r] = 'x';
        sq[c][q] = 'x';
        c++; r++; q--;
      }

      // print the array
      for (int i = 0; i < height; i++)
      {
        line = "";
        for (int j = 0; j < width; j++)
        {
          line += sq[i][j];
        }
        System.out.println( line );
      }
    }
  }