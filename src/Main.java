import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        //----------------Var´s---------------
        double peso,altura,imc;
        //----------------Bienvenida--------------
        System.out.println("Bienvenido/a, si desea calcular su IMC, siga  las instrucciones");
        //---------------Informacion----------------
        System.out.println("Cual es su peso ( ejemplo 10,00) ");
        peso= teclado.nextDouble();
        System.out.println("Cual es tu altura ( ejemplo 1,00)");
        altura= teclado.nextDouble();
        //----------------CALCULO----------------
        imc= peso/(altura*altura);
        System.out.println("Su IMC es: "+imc);
        //--------------IMC POR PERSONA-------
        if (imc<18.5) {
            System.out.println("BAJO PESO");
        } else if (imc>=18.5 && imc<=24.9) {
            System.out.println("MEDIA");
        } else if (imc>=25 && imc<=29.9) {
            System.out.println("SOBREPESO");
        } else {
            System.out.println("OBESIDAD");
        }
    }

}