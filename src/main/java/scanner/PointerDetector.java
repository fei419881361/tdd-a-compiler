package scanner;

public class PointerDetector implements TokenDetector {
    @Override
    public boolean match(String word) {
        return word.endsWith("*");
    }

    @Override
    public Token create(String word) {
        return new Pointer(word.substring(0, word.length() - 1));
    }
}
