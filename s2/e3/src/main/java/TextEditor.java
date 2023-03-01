/**
 * @author: Lenin Meza <merolhack@gmail.com>
 */
public class TextEditor {
    private Command saveCommand;

    public TextEditor() {
        saveCommand = new SaveCommand();
    }

    public void onPressSaveButton() {
        System.out.println("[Saving button]");
        saveCommand.execute();
    }

    public void onMenuSaveButton() {
        System.out.println("[Menu]");
        saveCommand.execute();
    }

    public void onShortcut() {
        System.out.println("[Shortcut]");
        saveCommand.execute();
    }
}
