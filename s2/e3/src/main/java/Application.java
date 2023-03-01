/**
 * @author: Lenin Meza <merolhack@gmail.com>
 */
public class Application {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.onPressSaveButton();
        editor.onMenuSaveButton();
        editor.onShortcut();
    }
}
