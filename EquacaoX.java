import java.lang.Math;

public class EquacaoX extends Equacao {
    private double xn = 0;
    private double xp = 0;

    public double getXn() {
        return xn;
    }

    public void setXn(double xn) {
        this.xn = xn;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }

    public double calculaXn(double delta) {
        xn = -super.getB() + Math.sqrt(delta) / 2 * super.getA();
        return xn;
    }

    public double calculaXp(double delta) {
        xp = -super.getB() - Math.sqrt(delta) / 2 * super.getA();
        return xp;
    }

    public String exibeRaiz(double delta) {
        String resolucao;
        System.out.println("-----------------------------------------------" + System.lineSeparator());
        if (delta < 0 ) {
            resolucao = ("Digite os termos novamente seu delta foi negativo!");
        }else if(super.getA() == 0){
            resolucao =("Digite um a diferente de zero senão não é uma equacao do 2 grau");
        }else if(this.calculaXn(delta) == this.calculaXp(delta)){
            resolucao = ("Suas raizes são iguais");
        } else {
            resolucao = ("Resultados:" + System.lineSeparator());
            resolucao += ("Valor do delta = " + delta + System.lineSeparator());
            resolucao += ("Valor de x| = " + xn + System.lineSeparator());
            resolucao += ("Valor de x|| = " + xp + System.lineSeparator());
        }
        return resolucao;
    }
}
