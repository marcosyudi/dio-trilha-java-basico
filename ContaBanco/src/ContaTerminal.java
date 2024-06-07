// Importando as classes
import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    private static Scanner scanner;

    public static void main(String[] args) throws Exception {
        //ToDo: 
        //Conhecer e importar a classe scanner.
        //Exibir as mensagens para o nosso usuário.
        //Obter pela scanner os valores digitados pelo terminal.
        //Exibir as mensagens pela conta criada.

        //Declarando as variáveis.
        int numero;
        String agencia, nomeCliente;
        double saldo;

        // Criando uma instância do Scanner para ler do teclado
        scanner = new Scanner(System.in).useLocale(Locale.US);

        // Abaixo são as atribuições às variáveissão de acordo com as entradas de dados pelo usuário
        System.out.println("Por gentileza, digite o número da Agência!");
        agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta!");
        numero = lerInteiro();
        
        System.out.println("Por favor, digite o seu Nome!");
        nomeCliente = scanner.nextLine();// nao exibe o nome completo
        
        System.out.println("Em seguida digite seu Saldo.");
        saldo = lerNumerico();
        
        // Exibindo a mensagem e concatenando com os dados fornecido pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();

    }
    // Durante o desenvolvimento deste programa, me deparei com um problema. Ao ler as entradas de dados
    //o método "nextLine()" não estava efetuando a leitura do "nomeCliente", pois durante a entrada de dados
    //no "numero" localizado na linha 27, quando o usuário digita o número e dá um ENTER. O método "nextLine()" 
    //da linha 30 entendia o ENTER como um caractere vazio "/n" e pula para a próxima leitura, "saldo".
    // Para resolver este problema foi criado os dois métodos abaixo "lerInteiro()" e o "lerNumerico()". 
    //Estes métodos tem por objetivo fazer a leitura de entrada de dados em string utilizando o método "nextLine()"
    // e em seguida convertendo para o tipo da variavel correspondente, interio ou double.
    private static int lerInteiro() {
        String digitado = "";
    
        digitado = scanner.nextLine();
    
        return Integer.parseInt(digitado);
    }

    private static double lerNumerico() {
        String digitado = "";
    
        digitado = scanner.nextLine();
    
        return Double.parseDouble(digitado);
    }
}
