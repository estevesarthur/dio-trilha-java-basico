import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroConta;
        String agencia, nomeCliente;
        float saldoConta;

        System.out.println("---Bem vindo! Vamos iniciar sua conta.---");

        System.out.println("Primeiramente, digite o número da sua Agencia e após pressione o botão ENTER. ");
        numeroConta = scan.nextInt();

        System.out.println("Agora, preciso que você digite a sua agencia. Após inserir pressione ENTER.");
        agencia = scan.next();

        System.out.println("Precisamos agora que você digite o seu Nome completo. E após, pressione Enter para continuarmos.");
        nomeCliente = scan.next();

        System.out.println("Para finalizarmos, digite o seu saldo. E pressione Enter para finalizarmos.");
        saldoConta = scan.nextFloat();

        System.out.println("Obrigado! Finalizamos o seu cadastro.");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");
        scan.close();  
    }
}