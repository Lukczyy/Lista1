public class Szesciokat extends Figura{
    double a;
    @Override
    public double ObliczPole() {
        return 1.5*a*a*Math.sqrt(3);
    }

    @Override
    public double ObliczObwod() {
        return 6*a;
    }
}
