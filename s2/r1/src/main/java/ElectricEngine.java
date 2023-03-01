/**
 * @author: Lenin Meza <merolhack@gmail.com>
 */
public class ElectricEngine {

    private boolean conectado = false;
  
    public ElectricEngine() {
      System.out.println(" - ElectricEngine: Creating an Electric Engine");
      this.conectado = false;
    }
  
    public void connect() {
      System.out.println(" - ElectricEngine: Connecting an Electric Engine");
      this.conectado = true;
    }
  
    public void activate() {
      if (!this.conectado) {
        System.out.println(" - ElectricEngine: It cannot be activated because the electric motor is not connected...");
      } else {
        System.out.println(" - ElectricEngine: It is connected, activating electric motor....");
      }
    }
  
    public void movingFaster() {
      if (!this.conectado) {
        System.out.println(" - ElectricEngine: The electric motor cannot be moved fast because it is not connected...");
      } else {
        System.out.println(" - ElectricEngine: Moving faster");
      }
    }
  
    public void stop() {
      if (!this.conectado) {
        System.out.println(" - ElectricEngine: Cannot stop electric motor because it's not connected");
      } else {
        System.out.println(" - ElectricEngine: Stopping electric motor");
      }
    }
  
    public void disconnect() {
      System.out.println(" - ElectricEngine: Disconnecting electric motor...");
      this.conectado = false;
    }
}