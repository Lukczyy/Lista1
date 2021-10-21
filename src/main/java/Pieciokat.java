public class Pieciokat extends Figura{
    double a;
    @Override
    public double ObliczPole() {
        return ((a*a)/4)*Math.sqrt(25+10*Math.sqrt(5));
    }

    @Override
    public double ObliczObwod() {
        return 5*a;
    }
}
