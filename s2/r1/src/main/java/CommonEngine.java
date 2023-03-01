/**
 * @author: Lenin Meza <merolhack@gmail.com>
 */
public class CommonEngine extends Engine {

    public CommonEngine() {
      super();
      System.out.println("Creating the Common Engine");
    }
  
    @Override
    public void turnOn() {
      System.out.println("Turning up the common engine");
    }
  
    @Override
    public void speedUp() {
      System.out.println("Speeding up the common engine");
    }
  
    @Override
    public void turnOff() {
      System.out.println("Turning off the common engine");
    }
}