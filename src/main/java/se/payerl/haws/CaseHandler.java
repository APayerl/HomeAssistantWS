package se.payerl.haws;

/**
 * Class to handle case changes
 */
public final class CaseHandler {
    private CaseHandler(){}

    /**
     * Change input string from camel case to snake case
     * @param original String to convert to snake case from camel case
     * @return Formatted camel case string as a snake case
     */
    public static String camelCaseTo_snake_case(String original) {
        String modified = "";
        int lastModified = 0;
        for(int first = 0, second = first + 1; first < original.length(); first++, second = first + 1) {
            if(second < (original.length()) && Character.isUpperCase(original.charAt(second))) {
                modified += original.substring(lastModified, second);
                modified += "_" + Character.toLowerCase(original.charAt(second));
                lastModified = second + 1;
            }
        }
        if(lastModified != original.length()) {
            modified += original.substring(lastModified);
        }
        return modified.toLowerCase();
    }

    /**
     * Change input string from snake case to camel case
     * @param original String to convert to camel case from snake case
     * @return Formatted snake case string as a camel case
     */
    public static String snake_case_ToCamelCase(String original) {
        String modified = "";
        int lastModified = 0;
        for(int first = 0, second = first + 1; second < original.length(); first++, second = first + 1) {
            if(original.charAt(first) == '_') {
                modified += original.substring(lastModified, first);
                modified += Character.toUpperCase(original.charAt(second));
                lastModified = second + 1;
            }
        }
        if(lastModified != (original.length())) {
            modified += original.substring(lastModified);
        }
        if(modified.length() > 0 && Character.isUpperCase(modified.charAt(0))) {
            modified = Character.toLowerCase(modified.charAt(0)) + modified.substring(1);
        }
        return modified;
    }
}