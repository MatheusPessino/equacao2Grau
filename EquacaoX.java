import java.lang.Math;

public class EquacaoX  extends Equacao{
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

    public double calculaXn(double delta){
        xn = - getB() + Math.sqrt(delta) / 2 * getA();
        return xn;
    }

    public double calculaXp(double delta){
        xp = - getB() - Math.sqrt(delta)/ 2 * getA();
        return xp;
    }
    public String exibeRaiz(double delta){
        String resolucao;
        if(delta < 0 || this.calculaXn(delta) == this.calculaXp(delta)){
            resolucao =("Digite os numeros novamente seu delta foi negativo ou suas raizes iguais!");
        }else{
            resolucao = ("Valor do delta = " + delta + System.lineSeparator());
            resolucao += ("Valor de x| = " + xn + System.lineSeparator());
            resolucao += ("Valor de x|| = " + xp + System.lineSeparator());
        }
        return resolucao;
    }
}
