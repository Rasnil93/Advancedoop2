package Exercise8;

public class TestClass {

    public static void printStringArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null) {
                break;
            }
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Filter f1 = new FilterOnTwoStrings();
        Filter f2 = new FilterOnFiveLetters();

        String[] strArr1 =  new String[]{"this", "iss", "stringTwo", "dd", "stringThree"};
        strArr1 = f1.filter(strArr1);

        String[] strArr2 =  new String[]{"this", "iss", "stringTwo", "dd", "stringThree"};
        strArr2 = f2.filter(strArr2);

        printStringArray(strArr1);
        printStringArray(strArr2);
    }
}




