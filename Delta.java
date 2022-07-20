import java.lang.Math;

public class Delta extends Equacao {
    

    double delta;

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public double calculaDelta(double a, double b, double c){
        delta = Math.pow(b, 2) - 4 * (a * c);
        return delta;
    }
}
