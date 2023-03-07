/**
 *
 */
public class MathApplication {
    private CalculadoraService calcService;

    public double add(double input1, double input2) {
        return calcService.add(input1, input2);
    }

    public double subtract(double input1, double input2) {
        return calcService.subtract(input1, input2);
    }

    public double multiply(double input1, double input2) {
        return calcService.multiply(input1, input2);
    }

    public double split(double input1, double input2) {
        return calcService.split(input1, input2);
    }
}
