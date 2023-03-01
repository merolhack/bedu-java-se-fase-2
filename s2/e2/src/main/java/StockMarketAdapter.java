/**
 * @author: Lenin Meza <merolhack@gmail.com>
 */
public class StockMarketAdapter implements IStockMarketReport {
    private StockMarket stockMarket;

    public StockMarketAdapter() {
        stockMarket = new StockMarket();
    }

    @Override
    public String download() {
        String xml = stockMarket.download();
        return convertToJson(xml);
    }

    public String convertToJson(String xml) {
        String json = "";
        System.out.println("Converting XML to JSON...");
        return json;
    }
}
