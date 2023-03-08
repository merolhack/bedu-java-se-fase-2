/**
 * @author: Lenin Meza <merolhack@gmail.com>
 */
public class MultiplyCommand implements ICommand {

    public int execute(int counter) {
        return counter * 2;
    }
  
    public int unExecute(int counter) {
        return counter / 2;
    }
}