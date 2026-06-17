package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {

    private static final DateTimeFormatter REPORT_FORMAT =
            DateTimeFormatter.ofPattern(
                    "dd-MMM-yyyy HH:mm:ss"
            );

    private DateTimeUtil() {
    }

    public static String getCurrentDateTime() {

        return LocalDateTime.now()
                .format(REPORT_FORMAT);
    }
}