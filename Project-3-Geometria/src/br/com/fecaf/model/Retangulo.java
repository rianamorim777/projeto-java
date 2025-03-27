package br.com.fecaf.model;

import java.util.Scanner;

public class Retangulo {
    public double lado1, lado2, area, perimetro;

    // Scanner para entrada de dados
    Scanner scanner = new Scanner(System.in);

    //Função para registrar um retângulo e guardar as informações em variáveis

    public boolean cadastrarRetangulo() {
        System.out.println("/*************************/");
        System.out.println("/** Cadastrar Retangulo **/");
        System.out.println("/*************************/");
        System.out.print("Informe o lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.print("Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.println("Retangulo Cadastrado com Sucesso !");
        System.out.println("/***********************************/");

        return true;

    }

    /// Função para calcular a área do retângulo
    public void calcularArea() {
        System.out.println("/* Calculando Area */");
        area = lado1 * lado2;
        System.out.println("A area é: " + area);
    }

    // Função para calcular o perímetro do retângulo
    public void calcularPerimetro () {
        System.out.println("/* Calculando Perimetro */");
        perimetro = lado1 * 2 + lado2 * 2;
        System.out.println("O Perimetro é: " + perimetro);
    }

    // Função para verificar se o retângulo é um quadrado
    public boolean definirQuadrado() {
        if (lado1 == lado2) {
            System.out.println("Isso é um Quadrado ...");
            return true;
        }
        System.out.println("Não é um Quadrado ...");
        return false;
    }






}