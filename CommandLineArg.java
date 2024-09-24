// 3) Illustrate the use of command line argument. question
public class CommandLineArg{
  public static void main(String[] args){
    if(args.length<2){
      System.out.println("\n Please privide to intergers ");
      return;
    }
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int result = num1+num2;
    System.out.println("\n Sum of two intergers  are  ---> " +result);
  }
}