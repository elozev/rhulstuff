  import java.util.Scanner;
  
  class FillArrayB
  {
    public static void main(String[] args)
    {   
      Scanner s = new Scanner(System.in);
      System.out.print("Enter the length of the array: ");
      int n = s.nextInt();
      
      double [] a = new double[n];
      
      for (int i=0; i<n; i=i+1)
      {
        a[i] = Math.sqrt(i);
      }
  
      for (int i=0; i<n; i=i+1)
      {
        System.out.println("a[" + i + "] = " + a[i]);			
      }
    }
  }