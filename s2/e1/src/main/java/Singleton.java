/**
 * @author: Lenin Meza <merolhack@gmail.com>
 */
public class Singleton {

    private static Singleton myInstance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (myInstance == null) {
            myInstance = new Singleton(value);
        }
        return myInstance;
    }
}
