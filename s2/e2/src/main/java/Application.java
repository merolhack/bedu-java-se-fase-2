/**
 * @author: Lenin Meza <merolhack@gmail.com>
 */
public class Application {
    public static void main(String[] args) throws Exception {
        IStockMarketReport report = new StockMarketAdapter();
        String json = report.download();

        AnalysisLibrary library = new AnalysisLibrary();
        library.analyzeInformation(json);
    }
}
