import java.util.Scanner;
 
  public class ExCondicional6 {

  public static void main(String [] arg) {

    Scanner input = new 
    Scanner(System.in);

int horasTrabalhadas;
double salarioHora, salarioTotal,
horasExtras;

System.out.println("Insira o número de horas trabalhadas no mês: ");
horasTrabalhadas = 
input.nextInt();

System.out.println("Insira o valor do salario por hora: ");
salarioHora = input.nextDouble();

if (horasTrabalhadas > 160) {
    horasExtras = horasTrabalhadas
    - 160;
    salarioTotal = (160 * salarioHora) + (horasExtras * salarioHora * 1.5);
} else {
    salarioTotal =
    horasTrabalhadas * salarioHora;

}

System.out.printf("O salario total de funcionario é: R$ %.2f%n",
salarioTotal);
  }
  }