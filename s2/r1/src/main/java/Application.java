/**
 * @author: Lenin Meza <merolhack@gmail.com>
 */
public class Application {
    public static void main(String [] args) {
        System.out.println("Design pattern: Adapter");
        Engine engine = new ElectricEngineAdapter();
        engine.turnOn();
        engine.speedUp();
        engine.turnOff();
    }
}