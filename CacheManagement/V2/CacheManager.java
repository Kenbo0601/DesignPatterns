import java.util.Hashtable;

class CacheManager {
    private CacheManager(){}
    static Hashtable<String,Plot> cache = new Hashtable<>();
    static Plot get(String key) {
        Plot plot = cache.get(key);
        if(plot == null) {
            plot = new Plot(key);
            cache.put(key,plot);
        }
        return plot;
    }
}
