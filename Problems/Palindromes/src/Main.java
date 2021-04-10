class StringUtils {
    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        str = str.replaceAll("\\W", "");
        return (!str.isEmpty() && sb.append(str.toLowerCase()).reverse().toString().equals(str.toLowerCase()));
    }
}