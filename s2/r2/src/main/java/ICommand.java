/**
 * @author: Lenin Meza <merolhack@gmail.com>
 */
public interface ICommand {

    public int execute(int counter);

    public int unExecute(int counter);

}