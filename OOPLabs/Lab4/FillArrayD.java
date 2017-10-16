  import java.util.Scanner;
  
  class FillArrayD
  {
    public static void main(String[] args)
    {   
      Scanner s = new Scanner(System.in);
      System.out.print("Enter the length of the array: ");
      int n = s.nextInt();
      
      int [] a = new int[n];
      
      for (int i=0; i<n; i++)
      {
        a[i] = i;
      }
  
      for (int i=n-1; i > 0; i--)
      {
        System.out.println("a[" + i + "] = " + a[i]);			
      }
    }
  }