package util;

public class ValidationUtil {

    public static Boolean isValidId(Integer id) {
        return id != null && id > 0;
    }
}