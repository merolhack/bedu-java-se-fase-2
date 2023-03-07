/**
 * @author Lenin Meza <merolhack@gmail.com>
 */
public class Calculadora {
    private ICalculadoraDao calculadoraDao;

    public int suma(int a, int b) {
        return a + b + calculadoraDao.findValorConstante();
    }

    public int resta(int a, int b) {
        return a - b + calculadoraDao.findValorConstante();
    }

    public int multiplica(int a, int b) {
        return a * b + calculadoraDao.findValorConstante();
    }
}
