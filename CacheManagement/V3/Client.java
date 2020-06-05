class Client {
    public static void main(String [] ignore) {
        PlotIF plot1 = CacheManager.get("MSFT");
        PlotIF plot2 = CacheManager.get("AAPL");
        PlotIF plot3 = CacheManager.get("MSFT");
        // PlotIF plot4 = new CacheManager.Plot("AAPL");
    }
}

