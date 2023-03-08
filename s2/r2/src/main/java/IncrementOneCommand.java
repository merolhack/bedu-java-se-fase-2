/**
 * @author: Lenin Meza <merolhack@gmail.com>
 */
public class IncrementOneCommand implements ICommand {

    public int execute(int counter) {
      return counter + 1;
    }

    public int unExecute(int counter) {
      return counter - 1;
    }
}