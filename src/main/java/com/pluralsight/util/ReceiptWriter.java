package com.pluralsight.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {
    // generateTimestamp generates the current date and time as a string
// it's used to create a unique filename for each receipt
// format is yyyyMMdd-HHmmss. example 20230329-121523
    private static String generateTimestamp() {
        // get the current date and time
        LocalDateTime now = LocalDateTime.now();
        // format it to match the required filename format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        // return the formatted timestamp as a string
        return now.format(formatter);
    }


}
