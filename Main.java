// Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
// o produto do dobro do primeiro com metade do segundo .
// a soma do triplo do primeiro com o terceiro.
// o terceiro elevado ao cubo.

import java.lang.Math; 
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    System.out.println("Informe um número inteiro");
    Scanner tecladoPrimeiro = new Scanner(System.in);
    int primeiroNumero = tecladoPrimeiro.nextInt();
    
    System.out.println("Informe o segundo número inteiro");
    Scanner tecladoSegundo = new Scanner(System.in);
    int segundoNumero = tecladoSegundo.nextInt();
    
    System.out.println("Informe um número real");
    Scanner tecladoTerceiro = new Scanner(System.in);
    float terceiroNumero = tecladoTerceiro.nextFloat();

    int dobroPrimeiroNumeroMaisMetadeDoSegundo = primeiroNumero * primeiroNumero;

    dobroPrimeiroNumeroMaisMetadeDoSegundo = (segundoNumero / 2) * dobroPrimeiroNumeroMaisMetadeDoSegundo;

    System.out.println("O produto do primeiro número mais a metado do segundo é: " + dobroPrimeiroNumeroMaisMetadeDoSegundo);

    float triploPrimeiroNumeroMaisSomaDoTerceiro = primeiroNumero * primeiroNumero * primeiroNumero;

    triploPrimeiroNumeroMaisSomaDoTerceiro = triploPrimeiroNumeroMaisSomaDoTerceiro + terceiroNumero;

  System.out.println("O triplo do primeiro número mais a soma do terceiro é: " + triploPrimeiroNumeroMaisSomaDoTerceiro);

   double triploTerceiroNumero = Math.pow(terceiroNumero, 3);

    System.out.println("O triplo do terceiro número é: " + triploTerceiroNumero);
  }
}