import java.util.Scanner;
public class Calc {
    public Calc(){
        Scanner entrada = new Scanner(System.in);
        float a, b, c;
        char op; 

        System.out.println("Insira os números: ");
        a = entrada.nextFloat();
        b = entrada.nextFloat();
        System.out.println("Insira o sinal da operação (+ - * /): ");
        op = entrada.next().charAt(0);
        switch (op){
            case '+':
                c = a + b;
                System.out.println("Resultado: " + c);
                break;
            case '-':
                c = a - b;
                System.out.println("Resultado: " + c);
                break;
            case '*':
                c = a * b;
                System.out.println("Resultado: " + c);
                break;
            case '/':
                c = a / b;
                System.out.println("Resultado: " + c);
                break;
        }
        
    }
}
