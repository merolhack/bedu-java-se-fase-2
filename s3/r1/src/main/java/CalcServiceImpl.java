public class CalcServiceImpl implements CalculadoraService {
    @Override
    public double add(double input1, double input2) {
        return input1 + input2;
    }

    @Override
    public double subtract(double input1, double input2) {
        return input1 - input2;
    }

    @Override
    public double multiply(double input1, double input2) {
        return input1 * input2;
    }

    @Override
    public double split(double input1, double input2) {
        return 0;
    }
}
