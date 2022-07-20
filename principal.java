import java.util.Scanner;

public class principal{
    public static void main(String[] args) {
        EquacaoX eqx = new EquacaoX();
        Delta d = new Delta();
        Scanner e = new Scanner(System.in);

        System.out.println("Bem vindo ao calculador de Equação do 2 grau");
        System.out.println("Digite o valor do termo a");
        eqx.setA(e.nextDouble());
        System.out.println("Digite o valor do termo b");
        eqx.setB(e.nextDouble());
        System.out.println("Digite o valor do termo c");
        eqx.setC(e.nextDouble());
        System.out.println(eqx.exibeRaiz(d.calculaDelta(eqx.getA(), eqx.getB(),eqx.getC())));
    }
}