package StringUtility;

public class StringUtility {
    public String ReverseString(String input) {
        byte[] strAsByteArray = input.getBytes();
        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i<strAsByteArray.length; i++){
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }
        return new String(result);
    }

    public String CapitalizeString(String input) {
        return input.toUpperCase();
    }

    public String LowercaseString(String input) {
        return input.toLowerCase();
    }
}
