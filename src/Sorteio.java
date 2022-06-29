import java.util.Random;
import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) {

        String reposta = "";
        int resultado = 0;

        do {

            Random geradorDeNumeros = new Random();
            int numeroSorteado = geradorDeNumeros.nextInt(10);

            Scanner input = new Scanner(System.in);
            System.out.println("Acerte o número gerado e ganhe 10 pontos. Acerte o número acima do gerado  ganhe 5 pontos se abaixo 5 pontos.");
            System.out.println("Digite um numero de 0 a 10: ");
            int digitado = input.nextInt();


            if (digitado == numeroSorteado) {
                System.out.println("Parabéns! Você acertou. Ganhou 10 pontos.");
                resultado = resultado +10;

            } else if (digitado == numeroSorteado + 1) {
                System.out.println("Você passou perto! o número " + digitado + " está acima do sorteado. Ganhou 5 pontos.");
                resultado = resultado+5;
            } else if (digitado == numeroSorteado - 1) {
                System.out.println("Você passou perto! o número " + digitado + " está abaixo do sorteado. Ganhou 5 pontos.");
                resultado = resultado+5;

            } else {
                System.out.println("Você não pontuou. o número sorteado foi: " + numeroSorteado);
            }

            System.out.println("Quer jogar de novo? [sim ou não]");
            reposta = input.next();

        }while (reposta.equalsIgnoreCase("Sim"));

        System.out.println("Total de pontos: " + resultado);
    }
}
