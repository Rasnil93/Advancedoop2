package Exercise8;

public class FilterOnFiveLetters extends Filter {

    @Override
    public boolean accept(String s) {
        return s.length() >= 5;
    }
}
