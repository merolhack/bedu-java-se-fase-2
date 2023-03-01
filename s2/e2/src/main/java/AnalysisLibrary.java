/**
 * @author: Lenin Meza <merolhack@gmail.com>
 */
public class AnalysisLibrary {
    public void analyzeInformation(String json) throws Exception {
        if (!validateJson(json)) {
            throw new Exception("The information has not JSON format");
        }
        System.out.println("Processing the information...");
    }

    public boolean validateJson(String json) {
        return true;
    }
}
