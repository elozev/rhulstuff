import java.util.Scanner;

class FixMe3
{
  public static void main(String[] args)
  {
  double x, y, quotient;

  Scanner kbd = new Scanner(System.in);

  System.out.print("First integer? ");
  x = kbd.nextInt();

  do{
    System.out.print("Second integer? ");
    y = kbd.nextInt();
    if(y == 0){
      System.out.println("Cannot divide by zero!");
    }
  }while(y == 0);

  quotient = x / y;
  System.out.println("The quotient is " + quotient);
  }
}
