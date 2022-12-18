import java.util.Scanner;

public class complexosConsole{
    public complexosConsole(){
        Scanner entrada = new Scanner(System.in);
        ComplexNumber num1; 
        ComplexNumber num2;
        ComplexNumber num3;
        float a, b;
        char op; 

        System.out.println("Primeiro Número");
        System.out.println("Insira a parte real: ");
        a = entrada.nextFloat();
        System.out.println("Insira a parte imaginaria: ");
        b = entrada.nextFloat();
        num1 = new ComplexNumber(a,b);
        System.out.println(num1.toString());

        System.out.println("Segundo Número");
        System.out.println("Insira a parte real: ");
        a = entrada.nextFloat();
        System.out.println("Insira a parte imaginaria: ");
        b = entrada.nextFloat();
        num2 = new ComplexNumber(a,b);
        System.out.println(num2.toString());

        System.out.println("Insira o sinal da operação (+ - * /): ");
        op = entrada.next().charAt(0);
        switch (op){
            case '+':
                num3 = num1.add(num2);
                System.out.println("Resultado: " + num3.toString());
                break;
            case '-':
                num3 = num1.subtract(num2);
                System.out.println("Resultado: " + num3.toString());
                break;
            case '*':
                num3 = num1.multiply(num2);
                System.out.println("Resultado: " + num3.toString());
                break;
            case '/':
                num3 = num1.divide(num2);
                System.out.println("Resultado: " + num3.toString());
                break;
        }
        

    }
}