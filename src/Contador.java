import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        int firstNumber = 0;
        int secondNumber = 0;
        
        try {
            try (Scanner terminal = new Scanner(System.in)) {
                // Get user input
                System.out.print("Digite o primeiro parâmetro: ");
                firstNumber = terminal.nextInt();

                System.out.print("Digite o segundo parâmetro: ");
                secondNumber = terminal.nextInt();
            }
        } catch (Exception e) {
            // Handle exception if there is no number
            System.err.println("A entrada precisa ser um número inteiro.");
        }

        try {
            contar(firstNumber, secondNumber);


        } catch (Exception e) {
            // Handle exception of parameters
            System.out.println(e);
        }

    }

    static void contar(int numberOne, int numberTwo) throws ParametrosInvalidosException{
        if(numberOne > numberTwo)
            throw new ParametrosInvalidosException("Número inicial menor que final.");

        
        int count = numberTwo - numberOne;
        for(int i = 1; i <= count; i++){
            System.out.println("Imprindo o número " + i);
        }
    }
}
