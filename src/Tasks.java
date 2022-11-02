public class Tasks {
    public static String validOrDefault(String value, String defoltValue) {
        if (value == null || value.isBlank()) {
            return defoltValue;
        } else return value;
    }




}
