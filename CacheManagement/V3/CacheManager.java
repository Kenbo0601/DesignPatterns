import java.util.Hashtable;

class CacheManager {
    private static class Plot implements PlotIF {
        Plot(String ticker) { System.out.println("Creating " + ticker); }
        // lot of stuff
    }

    private CacheManager() {}
    static Hashtable<String, PlotIF> cache = new Hashtable<>();
    static PlotIF get(String key) {
        PlotIF plot = cache.get(key);
        if (plot == null) {
            plot = new Plot(key);
            cache.put(key, plot);
        }
        return plot;
    }
}
