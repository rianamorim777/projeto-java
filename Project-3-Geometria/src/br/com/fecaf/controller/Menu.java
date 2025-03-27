package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

public class Menu {

    // Instancia Scanner
    Scanner scanner = new Scanner(System.in);

    //Função responsável pelo menu
    public void executarMenu () {

        // Variável para o menu continuar rodando caso a sua saida ainda seja falsa
        boolean exit = false;

        //Loop que continua enquanto a saida é falsa
        while (!exit) {

            System.out.println("/*******************/");
            System.out.println("/*    Geometria    */");
            System.out.println("/*******************/");
            System.out.println("/* 1 - Circulo     */");
            System.out.println("/* 2 - Retângulo   */");
            System.out.println("/* 3 - Triângulo   */");
            System.out.println("/* 4 - Sair        */");
            System.out.println("/*******************/");
            //Recebe a opção escolhida
            System.out.print("Informe a opção desejada: ");
            int optionUser = scanner.nextInt();

            //Executa um caso conforme a escolha do usuário
            switch (optionUser) {

                /*Caso escolha círculo*/
                case 1:
                    // Variável para o círculo continuar rodando caso a sua saida ainda seja falsa
                    boolean exitCirculo = false;

                    //Instância um novo círculo
                    Circulo circulo = new Circulo();

                    //Variável que se a forma foi cadastrada
                    boolean validaCadastro = false;

                    //Loop que continua enquanto a saida é falsa
                    while (!exitCirculo) {

                        System.out.println("/**************************/");
                        System.out.println("/****     Circulo      ****/");
                        System.out.println("/**************************/");
                        System.out.println("/* 1 - Cadastrar Circulo  */");
                        System.out.println("/* 2 - Calcular Área      */");
                        System.out.println("/* 3 - Calcular Perimetro */");
                        System.out.println("/* 4 - Sair               */");
                        System.out.println("/**************************/");

                        //Recebe a opção escolhida
                        System.out.print("Informe a opção desejada: ");
                        int optionCirculo = scanner.nextInt();

                        //Executa um caso conforme a escolha do usuário
                        switch (optionCirculo) {
                            /* Caso escolha cadastrar um círculo */
                            case 1:
                               validaCadastro = circulo.cadastrarCirculo();
                                break;
                            /* Caso escolha calcular área */
                            case 2:
                                if (validaCadastro) {
                                    circulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Circulo");
                                }
                                break;
                            /* Caso escolha calcular perímetro */
                            case 3:
                                if (validaCadastro) {
                                    circulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Circulo");
                                }
                                break;

                            /* Caso escolha Sair, faz com que a saida se torne verdadeira*/
                            case 4:
                                System.out.println("Saindo do Circulo ...");
                                exitCirculo = true;
                                break;
                            /* Caso escolha uma opção invalida*/
                            default:
                                System.out.println("Escolha uma Opção Válida !");
                        }

                    }
                    break;

                /* Caso escolha retângulo*/
                case 2:
                    // Variável para o retângulo continuar rodando caso a sua saida ainda seja falsa
                    boolean exitRetangulo = false;

                    //Instância um novo retângulo
                    Retangulo retangulo = new Retangulo();

                    //Variável que se a forma foi cadastrada
                    boolean validaRetangulo = false;

                    //Loop que continua enquanto a saida é falsa
                    while (!exitRetangulo) {
                        System.out.println("/**************************/");
                        System.out.println("/****     Retangulo    ****/");
                        System.out.println("/**************************/");
                        System.out.println("/* 1 - Cadastrar Retangulo  */");
                        System.out.println("/* 2 - Calcular Área      */");
                        System.out.println("/* 3 - Calcular Perimetro */");
                        System.out.println("/* 4 - É quadrado??          */");
                        System.out.println("/* 5 - Sair               */");
                        System.out.println("/**************************/");

                        //Recebe a opção escolhida
                        System.out.print("Informe a opção desejada: ");
                        int optionRetangulo = scanner.nextInt();

                        //Executa um caso conforme a escolha do usuário
                        switch (optionRetangulo) {
                            /* Caso escolha cadastrar um retângulo */
                            case 1:
                                validaRetangulo = retangulo.cadastrarRetangulo();
                                break;
                            /* Caso escolha calcular área */
                            case 2:
                                if (validaRetangulo) {
                                    retangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Retângulo !");
                                }
                                break;
                            /* Caso escolha calcular perímetro */
                            case 3:
                                if (validaRetangulo) {
                                    retangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Retângulo !");
                                }
                                break;
                            /* Caso escolha ver se é um quadrado */
                            case 4:
                                if (validaRetangulo) {
                                    retangulo.definirQuadrado();
                                } else {
                                    System.out.println("Cadastre um Retângulo !");
                                }
                                break;

                            /* Caso escolha Sair, faz com que a saida se torne verdadeira*/
                            case 5:
                                System.out.println("Saindo Retângulo...");
                                exitRetangulo = true;
                                 break;

                            /* Caso escolha uma opção invalida*/
                            default:
                                System.out.println("Escolha uma opção valida...");
                        }

                    }
                    break;
                /* Caso escolha triangulo*/
                case 3:
                    // Variável para o triângulo continuar rodando caso a sua saida ainda seja falsa
                    boolean exitTriangulo = false;

                    //Instância um novo triângulo
                    Triangulo triangulo = new Triangulo();

                    //Variável que se a forma foi cadastrada
                    boolean validaTriangulo = false;

                    //Loop que continua enquanto a saida é falsa
                    while (!exitTriangulo) {
                        System.out.println("/******************************/");
                        System.out.println("/****       Triangulo      ****/");
                        System.out.println("/******************************/");
                        System.out.println("/* 1 - Cadastrar Triangulo    */");
                        System.out.println("/* 2 - Calcular Área          */");
                        System.out.println("/* 3 - Calcular Perimetro     */");
                        System.out.println("/* 4 - Definir Triângulo      */");
                        System.out.println("/* 5 - É Triangulo Retangulo? */");
                        System.out.println("/* 6 - É 3,4,5?               */");
                        System.out.println("/* 7 - Sair                   */");
                        System.out.println("/******************************/");

                        //Recebe a opção escolhida
                        System.out.print("Informe a opção desejada: ");
                        int optionTriangulo = scanner.nextInt();

                        //Executa um caso conforme a escolha do usuário
                        switch (optionTriangulo) {
                            /* Caso escolha cadastrar um triângulo */
                            case 1:
                                validaTriangulo = triangulo.cadastrarTriangulo();
                                break;
                            /* Caso escolha calcular área */
                            case 2:
                                if (validaTriangulo){
                                    triangulo.calcularArea();
                                }
                                else {
                                    System.out.println("Cadastre um triângulo ");
                                }
                                break;
                            /* Caso escolha calcular perímetro */
                            case 3:
                                if (validaTriangulo){
                                    triangulo.calcularPerimetro();
                                }
                                else {
                                    System.out.println("Cadastre um triângulo ");
                                }
                                break;
                            case 4:
                                if (validaTriangulo){
                                    triangulo.definirTipo();
                                }
                                else {
                                    System.out.println("Cadastre um triângulo ");
                                }
                                break;
                            case 5:
                                if (validaTriangulo){
                                    triangulo.definirTrianguloRetangulo();
                                }
                                else{
                                System.out.println("Cadastre um triângulo ");
                                }
                                break;
                            case 6:
                                if (validaTriangulo){
                                    triangulo.definir345();
                                }
                                else{
                                    System.out.println("Cadastre um triângulo ");
                                }
                                break;

                            /* Caso escolha Sair, faz com que a saida se torne verdadeira*/
                            case 7:
                                System.out.println("Saindo triângulo...");
                                exitTriangulo = true;
                                break;

                            /* Caso escolha uma opção invalida*/
                            default:
                                System.out.println("Escolha uma opção valida...");
                        }
                    }
                    break;

                /* Caso escolha Sair, faz com que a saida se torne verdadeira*/
                case 4:
                    System.out.println("Escolheu 4");
                    exit = true;
                    break;

                /* Caso escolha uma opção invalida*/
                default:
                    System.out.println("Escolha uma Opção Válida");

            }

        }

    }

}