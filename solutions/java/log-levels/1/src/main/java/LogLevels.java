public class LogLevels {
    
    public static String message(String log) {
        return log.split("]:")[1].trim();
    }

    public static String logLevel(String log) {
        int start = log.indexOf("[");
        int end = log.indexOf("]");
        return (log.substring(start + 1, end)).toLowerCase();
    }

    public static String reformat(String log) {
        return message(log) + " (" + logLevel(log) + ")";
    }
}
