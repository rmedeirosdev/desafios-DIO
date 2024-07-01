import java.util.Scanner;
@SuppressWarnings("resource")

public class Desafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double valorImposto = 0;

        // Obtendo os dados de entrada
        System.out.println("Digite o valor do Salário Bruto:");
        double salarioBruto = scan.nextDouble();
        System.out.println("Digite o valor dos Benefícios:");
        double beneficios = scan.nextDouble();
        
        // Atribuindo imposto com base nos dados pedidos

        if (salarioBruto >=0 && salarioBruto <= 1100.00) {
            valorImposto = 0.05 * salarioBruto;
        } else if (salarioBruto > 1100 && salarioBruto <=2500) {
            valorImposto = 0.10* salarioBruto;
        } else {
            valorImposto = 0.15 * salarioBruto;
        }

        // Calculando valor de saída e voltando o mesmo para usuário

        double salarioLiquido = (salarioBruto - valorImposto) + beneficios;

        System.out.printf("O salário líquido do funcionário é de R$ %.2f", salarioLiquido);
    }
}
