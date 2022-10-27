import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class projetoFinal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos calcular uma média para você, digite ARITMETICA (para calcular a media aritmética) e HARMONICA (para calcular a média harmônica).");
        while (true) {
            String media = entrada.nextLine();
            if (media.equals("ARITMETICA") || media.equals("aritmetica")) {
                System.out.println("Quantos números você deseja calcular na sua média?");
                try {
                    int n = entrada.nextInt();
                    float[] arrayDeInteiros = new float[n];

                    System.out.println("Agora digite os " + n + " valores para calcular a média.");
                    double soma = 0;
                    double valor = 0;
                    int i = 0;
                    while (i < n) {
                        valor = entrada.nextDouble();
                        arrayDeInteiros[i] = (float) valor;
                        soma = valor + soma;
                        i++;


                    }
                    soma = soma / n;
                    System.out.println("Os valores que você digitou foram: " + Arrays.toString(arrayDeInteiros));
                    System.out.println(" A média aritmética dos valores é " + soma);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Você não digitou um número inteiro, por favor rode a aplicação novamente.");
                } finally {
                    break;
                }


            } else if (media.equals("HARMONICA") || media.equals("harmonica")) {
                System.out.println("Quantos números você deseja calcular na sua média?");
                try {
                    int n = entrada.nextInt();

                    float[] arrayDeInteiros = new float[n];

                    System.out.println("Agora digite os " + n + " valores para calcular a média.");
                    double soma = 0;
                    double valor = 0;
                    int i = 0;
                    while (i < n) {
                        valor = entrada.nextDouble();
                        arrayDeInteiros[i] = (float) valor;
                        soma = 1 / valor + soma;
                        i++;


                    }
                    soma = n / soma;
                    System.out.println("Os valores que você digitou foram: " + Arrays.toString(arrayDeInteiros));
                    System.out.println(" A média harmônica dos valores é " + soma);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Você não digitou um número inteiro, por favor rode a aplicação novamente.");
                } finally {
                    break;
                }

            } else {
                System.out.println("Você digitou uma palavra inválida, por favor tente de novo (dica: digite as palavras sem acento!)");
            }
        }
    }
}

