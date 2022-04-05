package Exercise8;

public class FilterOnTwoStrings extends Filter {

    @Override
    public boolean accept(String s) {
        return s.length() <= 2;
    }
}
