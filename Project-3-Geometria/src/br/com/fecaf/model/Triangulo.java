package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    public double base, lado2, lado3, area, perimetro, altura, hipotenusa, catetoMaior, catetoMenor;

    // Instancia Biblioteca Scanner
    Scanner scanner = new Scanner(System.in);

    //Função para registrar um triângulo e guardar as informações em variáveis

    public boolean cadastrarTriangulo() {
        System.out.println("/************************/");
        System.out.println("/*   Cadastro Triângulo */");
        System.out.println("/************************/");
        System.out.print("/* Informe a Base: ");
        base = scanner.nextDouble();
        System.out.print("/* Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.print("/* Informe o lado 3: ");
        lado3 = scanner.nextDouble();
        System.out.print("Informe a Altura: ");
        altura = scanner.nextDouble();
        System.out.println("/* Triângulo Cadastrado com Sucesso !");
        System.out.println("/***********************************/");

        return true;
    }

    // Função para calcular área
    public void calcularArea () {
        System.out.println("/*********************************/");
        System.out.println("/*        Calculando Area        */");
        System.out.println("/*********************************/");

        area = (base * altura) / 2 ;
        System.out.println("A área é: " + area);
        System.out.println("/*********************************/");
    }

    // Função para calcular perimetro
    public void calcularPerimetro () {
        System.out.println("/*********************************/");
        System.out.println("/*      Calculando Perimetro     */");
        System.out.println("/*********************************/");

        perimetro = base + lado2 + lado3;
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/*********************************/");
    }

    // Define se o triângulo  é Isosceles, Escaleno, Equilatero
    public void definirTipo () {
        System.out.println("/*********************************/");
        System.out.println("/*        Definindo Tipo         */");
        System.out.println("/*********************************/");
        //Valida se todos os lados são iguas
        if (base == lado2 && base == lado3) {

            System.out.println("Este Triângulo é Equilátero ...");

        //Valida se todos os lados são diferentes
        } else if (base != lado2 && base != lado3 && lado2 != lado3) {

            System.out.println("Este Triângulo é Escaleno ...");

        // Caso a validação não der certo ele imprime esse aviso, ou seja, dois lados iguais
        } else {
            System.out.println("Este Triângulo é Isosceles ...");
        }
        System.out.println("/***************************************/");

    }
    //Função para definir o cateto menor, cateto maior e hipotenusa
    public void catetoHipotenusa (double l1, double l2, double b){

        //Validação para confirmar se l1 é a hipotenusa enquanto l2 e b são catetos
        if(l1 > b && l1 > l2 ){

            hipotenusa = l1;

            if( l2 > b){
                catetoMaior = l2;
                catetoMenor = b;
            }
            else {
                catetoMaior = b;
                catetoMenor = l2;
            }

        //Validação para confirmar se l2 é a hipotenusa enquanto l1 e b são catetos
        } else if ( l2 > l1 && l2 > b) {
            hipotenusa = l2;

            if( l1 > b){
                catetoMaior = l1;
                catetoMenor = b;
            }
            else {
                catetoMaior = b;
                catetoMenor = l2;
            }
        }
        //Validação para confirmar se b é a hipotenusa enquanto l1 e l2 são catetos
        else if ( b > l1 && b > l2) {
            hipotenusa = b;

            if( l1 > l2){
                catetoMaior = l1;
                catetoMenor = l2;
            }
            else {
                catetoMaior = l2;
                catetoMenor = l1;
            }
        }
    }

    //Define se o triângulo é retângulo
    public void definirTrianguloRetangulo (){

        //Chama a função para definir os catetos e hipotenusa
        catetoHipotenusa(lado2, lado3, base);

        // Realiza a validação baseado no cálculo de pitágoras para confirmar se o triângulo é retângulo
        if ((Math.pow(catetoMenor,2) + Math.pow(catetoMaior,2)) == Math.pow(hipotenusa,2)){

            System.out.println("Seu Triângulo é Retângulo");
        }
        // Caso a validação não der certo ele imprime esse aviso
        else {
            System.out.println("Seu Triângulo não é Retângulo");
        }

    }

    //Define se o triângulo faz parte do padrão 3,4,5
    public void definir345(){

        //Chama a função para definir os catetos e hipotenusa
        catetoHipotenusa(lado2, lado3, base);
        //Valida se os catetos possuem resto 0 sendo divididos por 3 e 4, também verifica se a hipotenusa tem resto 0 dividido por 5
        if (catetoMenor % 3 == 0 && catetoMaior % 4 == 0 && hipotenusa % 5 == 0 ){
            System.out.println("Seu triangulo faz parte do padrão 3, 4, 5");
        }

        // Caso a validação não der certo ele imprime esse aviso
        else {
            System.out.println("Seu triangulo não faz parte do padrão 3, 4, 5");
        }

    }
}