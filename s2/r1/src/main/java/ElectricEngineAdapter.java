/**
 * @author: Lenin Meza <merolhack@gmail.com>
 */
public class ElectricEngineAdapter extends Engine {

    private ElectricEngine electricEngine;
    
    public ElectricEngineAdapter() {
      super();
      this.electricEngine = new ElectricEngine();
      System.out.println(" * Adapter: Creating the adapter of electric engine.");
    }
    
    @Override
    public void turnOn() {
      System.out.println(" * Adapter: Turning on the adapter of electric engine.");
      this.electricEngine.connect();
      this.electricEngine.activate();
    }
    
    @Override
    public void speedUp() {
      System.out.println(" * Adapter: Speeding up the adapter of electric engine.");
      this.electricEngine.movingFaster();
    }
    
    @Override
    public void turnOff() {
      System.out.println(" * Adapter: Turning off the adapter of electric engine.");
      this.electricEngine.stop();
      this.electricEngine.disconnect();
    }
}