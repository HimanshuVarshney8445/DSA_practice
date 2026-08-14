public class Codec {
    private HashMap<String, String> shortToLong = new HashMap<>();
    private HashMap<String, String> longToShort = new HashMap<>();
    private int id=1;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(longToShort.containsKey(longUrl)){
            return longToShort.get(longUrl);
        }
        String shortUrl = "http://tinyurl.com/"+id++;
        longToShort.put(longUrl,shortUrl);
        shortToLong.put(shortUrl,longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return shortToLong.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));