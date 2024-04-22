import java.util.Scanner;
 
  public class ExCondicional7 {
                                                                                                                                                                                                                          

  public static void main(String [] args){
 
 Scanner scanner = new
 Scanner(System.in);

 System.out.println("Digite o primeiro numero real (A):");
 double A = scanner.nextDouble();

 System.out.println("Digite o segundo numero real(B):");
 double B = scanner.nextDouble();

 System.out.println("Digite o operador aritmetico (C):");
 String C = scanner.next();

 switch (C) {
  case "+":

  System.out.printf("Resultado de A + B: %.2f\n", (A + B));
  break;
  case "-":

  
  System.out.printf("Resultado de A - B: %.2f\n", (A - B));
  break;
  case "*":

  
  System.out.printf("Resultado de A * B: %.2f\n", (A * B));
  break;
  case "/":

  
  System.out.printf("Resultado de A / B: %.2f\n", (A / B));
 
 }
  }
  }
  

