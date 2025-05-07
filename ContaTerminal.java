import java.util.Scanner;

public class ContaTerminal{
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Digite o número da conta:");
        conta.setNumero(scanner.nextInt());

        System.out.println("Digite o número da agencia:");
        conta.setAgencia(scanner.nextInt());

        System.out.println("Digite o nome do cliente:");
        conta.setNomeCliente( scanner.next());

        System.out.println("Digite o saldo inicial:");
        conta.atualizaSaldo(scanner.nextDouble());

        System.out.println("Dados da conta \n"+ conta.toString());
        

    }
}