

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) {
        //Variveis utilizadas:
        String reposta = "";
        int resultado = 0;
        List<Integer> acertados = new ArrayList<>();
        List<Integer> errados = new ArrayList<>();
        List<Integer> acima = new ArrayList<>();
        List<Integer> abaixo = new ArrayList<>();


        do {
            //Scanner para seleção de nivel:
            Scanner nivel = new Scanner(System.in);
            System.out.println("Qual nivel você quer jogar? *Nivel [1] -> (0 a 10)  *Nivel [2] -> (0 a 20) *Nivel [3] -> (0 a 30).: ");
            int escoNivel = nivel.nextInt();

            //Condicional para jogar nivel 1: obs: A mesma condicional usada no nivel 1 é também para o 2 e 3.
            if (escoNivel == 1) {
                System.out.println("Nivel 1");
                //Gerador de numeros:
                Random geradorDeNumeros = new Random();
                int numeroSorteado = geradorDeNumeros.nextInt(10);
                //System.out.println(numeroSorteado); sout para mostrar o numero sorteado.
                //Scanner para o jogo:
                Scanner input = new Scanner(System.in);
                System.out.println("Acerte o número gerado e ganhe 10 pontos. Acerte o número acima do gerado e ganhe: 5 pontos. Se abaixo: 5 pontos.");
                System.out.println("Digite um numero de 0 a 10: ");
                int digitado = input.nextInt();
                // Condicional para armazenar numeros que o usuario errou em eum arraylist:
                if (digitado != numeroSorteado) {
                    errados.add(digitado);
                }
                //Condicional caso o usuario acerte o número sorteado:
                if (digitado == numeroSorteado) {
                    System.out.println("Parabéns! Você acertou. Ganhou 10 pontos.");
                    resultado = resultado + 10;
                    acertados.add(digitado);
                    //Condicionais caso o usuario acerte um número acima ou abaixo do sorteado:
                } else if (digitado == numeroSorteado + 1) {
                    System.out.println("Você passou perto! o número " + digitado + " está acima do sorteado. Ganhou 5 pontos.");
                    resultado = resultado + 5;
                    acima.add(digitado);
                } else if (digitado == numeroSorteado - 1) {
                    System.out.println("Você passou perto! o número " + digitado + " está abaixo do sorteado. Ganhou 5 pontos.");
                    resultado = resultado + 5;
                    abaixo.add(digitado);
                } else {
                    System.out.println("Você não pontuou. o número sorteado foi: " + numeroSorteado);
                }
                //Condicional para descartar numeros negativos:
                if ((digitado < 0) || (digitado > 10)) {
                    System.out.println("Opção inválida.");
                }
                //Etapa para jogar ou não novamente:
                System.out.println("Quer jogar nivel 1 de novo? [sim ou não]");
                reposta = input.next();
            }
            //Inicio nivel 2:
            if (escoNivel == 2) {
                System.out.println("Nivel 2");
                //Gerador de numeros:
                Random geradorDeNumeros = new Random();
                int numeroSorteado = geradorDeNumeros.nextInt(20);
                //System.out.println(numeroSorteado); sout para mostrar o numero sorteado.
                //Scanner para o jogo:
                Scanner input = new Scanner(System.in);
                System.out.println("Acerte o número gerado e ganhe 10 pontos. Acerte o número acima do gerado e ganhe: 5 pontos. Se abaixo: 5 pontos.");
                System.out.println("Digite um numero de 0 a 20: ");
                int digitado = input.nextInt();
                // Condicional para armazenar numeros que o usuario errou em eum arraylist:
                if (digitado != numeroSorteado) {
                    errados.add(digitado);
                }
                //Condicional caso o usuario acerte o número sorteado:
                if (digitado == numeroSorteado) {
                    System.out.println("Parabéns! Você acertou. Ganhou 10 pontos.");
                    resultado = resultado + 10;
                    acertados.add(digitado);
                    //Condicionais caso o usuario acerte um número acima ou abaixo do sorteado:
                } else if (digitado == numeroSorteado + 1) {
                    System.out.println("Você passou perto! o número " + digitado + " está acima do sorteado. Ganhou 5 pontos.");
                    resultado = resultado + 5;
                    acima.add(digitado);
                } else if (digitado == numeroSorteado - 1) {
                    System.out.println("Você passou perto! o número " + digitado + " está abaixo do sorteado. Ganhou 5 pontos.");
                    resultado = resultado + 5;
                    abaixo.add(digitado);
                } else {
                    System.out.println("Você não pontuou. o número sorteado foi: " + numeroSorteado);
                }
                //Condicional para descartar numeros negativos:
                if ((digitado < 0) || (digitado > 20)) {
                    System.out.println("Opção inválida.");
                }
                //Etapa para jogar ou não novamente:
                System.out.println("Quer jogar nivel 2 de novo? [sim ou não]");
                reposta = input.next();
            }
            //Inicio nivel 3:
            if (escoNivel == 3) {
                System.out.println("Nivel 3");
                //Gerador de numeros:
                Random geradorDeNumeros = new Random();
                int numeroSorteado = geradorDeNumeros.nextInt(30);
                //System.out.println(numeroSorteado); sout para mostrar o numero sorteado.
                //Scanner para o jogo:
                Scanner input = new Scanner(System.in);
                System.out.println("Acerte o número gerado e ganhe 10 pontos. Acerte o número acima do gerado e ganhe: 5 pontos. Se abaixo: 5 pontos.");
                System.out.println("Digite um numero de 0 a 30: ");
                int digitado = input.nextInt();
                // Condicional para armazenar numeros que o usuario errou em eum arraylist:
                if (digitado != numeroSorteado) {
                    errados.add(digitado);
                }
                //Condicional caso o usuario acerte o número sorteado:
                if (digitado == numeroSorteado) {
                    System.out.println("Parabéns! Você acertou. Ganhou 10 pontos.");
                    resultado = resultado + 10;
                    acertados.add(digitado);
                    //Condicionais caso o usuario acerte um número acima ou abaixo do sorteado:
                } else if (digitado == numeroSorteado + 1) {
                    System.out.println("Você passou perto! o número " + digitado + " está acima do sorteado. Ganhou 5 pontos.");
                    resultado = resultado + 5;
                    acima.add(digitado);
                } else if (digitado == numeroSorteado - 1) {
                    System.out.println("Você passou perto! o número " + digitado + " está abaixo do sorteado. Ganhou 5 pontos.");
                    resultado = resultado + 5;
                    abaixo.add(digitado);
                } else {
                    System.out.println("Você não pontuou. o número sorteado foi: " + numeroSorteado);
                }
                //Condicional para descartar numeros negativos:
                if ((digitado < 0) || (digitado > 30)) {
                    System.out.println("Opção inválida.");
                }
                //Etapa para jogar ou não novamente:
                System.out.println("Quer jogar nivel 3 de novo? [sim ou não]");
                reposta = input.next();
            }
        }
        //Inicia a repetição caso o usuario queira jogar novamente:
        while (reposta.equalsIgnoreCase("Sim"));
        //Prints que são mostrados no final caso o usuario não queira jogar novamente:
        System.out.println("Total de pontos: " + resultado);
        System.out.println("numeros acertados: " + acertados + " acertos acima do sorteado: " + acima + " acertos abaixo do sorteado: " + abaixo);
        System.out.println("numeros errados: " + errados);
    }
}


