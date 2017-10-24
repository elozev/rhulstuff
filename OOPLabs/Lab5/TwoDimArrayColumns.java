import java.util.Scanner;

  class TwoDimArrayColumns
    {
      public static void main(String[] args)
      {
        Scanner scanner = new Scanner(System.in);
        // the dimensions of the array
        int m = 3, n = 4;

        // the array
        String [][] a = new String [m][n];
        
        // an auxiliary variable to print the array
        String line;
        
        // fill the 2-dim array
        for (int i = 0; i < m; i++)
        {
          for (int j = 0; j < n; j++)
          {
            a[i][j] = " "+ i + j;
          }
        }
        
        System.out.println("Enter Number...");
        int l = scanner.nextInt();
        if(l > n){
          System.out.println("Out of range! Terminating...");
          System.exit(1);
        }
        l--;
        for(int k = 0; k < m; k++){
          System.out.println(a[k][l] + " ");
        }
        // print the 2-dim array
        // for (int i = 0; i < m; i++)
        // {
        //   line = "";
        //   for (int j = 0; j < n; j++)
        //   {
        //     line += a[i][j];
        //   }
        //   System.out.println(line);
        // }

        // System.out.println("Number of columns: " + a[0].length);
      }
    }