public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public float dividir(float a, float b) {
        if (b == 0) {
            throw new IllegalArgumentException("No es posible dividir un valor entre 0");
        }
        return a / b;
    }
}