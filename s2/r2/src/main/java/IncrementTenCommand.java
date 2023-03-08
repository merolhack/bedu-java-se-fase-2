/**
 * @author: Lenin Meza <merolhack@gmail.com>
 */
public class IncrementTenCommand implements ICommand {

    public int execute(int counter) {
        return counter + 10;
    }

    public int unExecute(int counter) {
        return counter - 10;
    }
}
