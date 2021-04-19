package labor8_2;

public interface IDictionary {
    public final String DICTIONARY_FILE = "Labor_8/dict.txt";
    public boolean add(String word);
    public boolean find(String word);
    public int size();
}
