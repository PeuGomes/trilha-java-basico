import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 2) {
            System.out.println("---Menu inicial---" + "\n1- Criar Conta" + "\n2- Sair");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    input = new Scanner(System.in);
                    System.out.println("Por favor, digite seu nome: ");
                    String nome = input.nextLine();
                    System.out.println("Por favor, digite o numero da conta: ");
                    int numero = input.nextInt();
                    do {

                        try {
                            if (numero <= 0) {
                                System.out.print("\nDigite o numero da conta, em que o numero seja maior que 0 ");
                                numero = input.nextInt();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println(
                                    "\nOps... você digitou caracteres. Precisamos que digite corretamente o número.");
                        }
                        input.nextLine();

                    } while (numero == 0);
                    System.out.println("Por favor, digite a sua Agência: ");
                    int agencia = input.nextInt();
                    do {

                        try {
                            if (agencia <= 0) {
                                System.out.print("\nDigite a agência da conta, em que o numero seja maior que 0 ");
                                agencia = input.nextInt();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println(
                                    "\nOps... você digitou caracteres. Precisamos que digite corretamente a agência.");
                        }
                        input.nextLine();

                    } while (agencia == 0);
                    double saldo =0;
                    while(saldo ==0){
                        try{
                            System.out.print("\nDigite o Saldo: ");
                            saldo = Double.parseDouble(input.next());
                        }catch (Exception e) {
                            System.out.println(
                                    "\nOps... Digite com ponto Ex: 20.0 se digitar letras  digite corretamente o saldo.");
                        }
                    }
                    
                    
                    Cliente cliente = new Cliente(numero, agencia, saldo, nome);
                    System.out.println("\nOlá " + cliente.getNome()
                            + ", obrigado por criar uma conta em nosso banco, sua agência é:  " + cliente.getAgencia()
                            + ", conta:  " + cliente.getNumero() + "  e seu saldo R$: " + cliente.getSaldo()
                            + " já está disponível para \n");
                    break;
            }
        }
        input.close();
    }
}
