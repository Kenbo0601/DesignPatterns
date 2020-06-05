class Client {
    public static void main(String [] ignore) {
        Plot plot1 = CacheManager.get("MSFT");
        Plot plot2 = CacheManager.get("AAPL");
        Plot plot3 = CacheManager.get("MSFT");
    }
}
