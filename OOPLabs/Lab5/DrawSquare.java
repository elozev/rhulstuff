import java.util.Scanner;

  class DrawSquare
  {
    public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);
      System.out.print("Size of the square: ");
      int n = s.nextInt();
      
      String line = "";
      int i = 0;
      while(i < n){
        line += "o";
        i++;
      }
      i = 0;
      while(i < n){
        System.out.println(line);
        i++;
      }
    }
  }