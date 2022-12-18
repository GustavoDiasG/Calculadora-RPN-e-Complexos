import java.util.Scanner; 

public class Main {
    public static void main(String[] args){      
        Scanner teclado = new Scanner(System.in);
        System.out.println("GUI(1) ou console(2)?");
        int a = teclado.nextInt();
        if (a== 1)
            new Calculadora2();
        else{
            System.out.println("RPN(1) ou Complexos(2)?");
            a = teclado.nextInt();
            if (a==1) new Calc();
            else new complexosConsole();
        }
    }
}

