  import java.util.Scanner;

  class RectangleArrayCross
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

      //left upper corner
      int w = (width / 2), h = 0;
      while(w >= 0 && h <= height / 2){
        sq[h][w] = '1';
        w--;
        h++;
      }

      //left right corner
      w = width / 2; h = 0;
      while(w >= 0 && h <= height / 2){
        sq[h][w] = '1';
        w++;
        h++;
      }

      //left down corner
      w = width / 2; h = height - 1;
      while(w >= 0 && h >= height / 2){
        sq[h][w] = '1';
        w--;
        h--;
      }

      //left down corner
      w = width / 2; h = height - 1;
      while(w >= 0 && h >= height / 2){
        sq[h][w] = '1';
        w++;
        h--;
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