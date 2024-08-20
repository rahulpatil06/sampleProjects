package practice;

public class Quoter {
    private String stockSymbol;
    private String type;
    private int lastDivident;
    private float fixedDivident;
    private int parValue;

    public Quoter(String stockSymbol, String type, int lastDivident, float fixedDivident, int parValue) {
        this.stockSymbol = stockSymbol;
        this.type = type;
        this.lastDivident = lastDivident;
        this.fixedDivident = fixedDivident;
        this.parValue = parValue;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLastDivident() {
        return lastDivident;
    }

    public void setLastDivident(int lastDivident) {
        this.lastDivident = lastDivident;
    }

    public float getFixedDivident() {
        return fixedDivident;
    }

    public void setFixedDivident(float fixedDivident) {
        this.fixedDivident = fixedDivident;
    }

    public int getParValue() {
        return parValue;
    }

    public void setParValue(int parValue) {
        this.parValue = parValue;
    }
}
