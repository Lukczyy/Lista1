public class Kolo extends Figura{
    double r;
    @Override
    public double ObliczPole() {
        return Math.PI * r * r;
    }

    @Override
    public double ObliczObwod() {
        return 2 * Math.PI * r;
    }
}
