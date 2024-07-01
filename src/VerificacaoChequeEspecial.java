import java.util.Scanner;

public class VerificacaoChequeEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double limiteChequeEspecial = 500.0;

        System.out.println("informe o saldo atual da conta bancária.");
        double saldo = scanner.nextDouble();
        System.out.println("informe o valor do saque.");
        double saque = scanner.nextDouble();

        if (saque<=saldo) 
            System.out.println("Transaaoo realizada com sucesso.");
        else {
            if ((saldo+limiteChequeEspecial) >= saque) {
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");        
            } else System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }
        scanner.close();    
    }
}
