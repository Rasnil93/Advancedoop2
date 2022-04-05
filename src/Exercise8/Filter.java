package Exercise8;

abstract public class Filter {
    abstract public boolean accept(String s);

    public String[] filter(String[] strings) {
        String result[] = new String[strings.length];
        int j = 0;
        for (int i = 0; i < strings.length; i++) {
            if (accept(strings[i])) {
                result[j] = strings[i];
                j++;
            }
        }
        return result;
    }
}
