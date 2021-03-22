package se.payerl.haws;

public final class CaseHandler {
    private CaseHandler(){}

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
        if(lastModified != (original.length() - 1)) {
            modified += original.substring(lastModified);
        }
        return modified.toLowerCase();
    }

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
        if(lastModified != (original.length() - 1)) {
            modified += original.substring(lastModified);
        }
        if(modified.length() > 0 && Character.isUpperCase(modified.charAt(0))) {
            modified = Character.toLowerCase(modified.charAt(0)) + modified.substring(1);
        }
        return modified;
    }
}