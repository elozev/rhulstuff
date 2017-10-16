  import java.util.Scanner;
  
  class FillArrayA
  {
    public static void main(String[] args)
    {   
      Scanner s = new Scanner(System.in);
      System.out.print("Enter the length of the array: ");
      int n = s.nextInt();
      
      int [] a = new int[n];
      
      for (int i=0; i<n; i=i+1)
      {
        a[i] = i*i;
      }
  
      for (int i=0; i<n; i=i+1)
      {
        System.out.println("a[" + i + "] = " + a[i]);			
      }
    }
  }