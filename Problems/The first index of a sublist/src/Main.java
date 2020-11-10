import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String lastString = scanner.nextLine();
        int firstPosition = firstString.indexOf(lastString);
        int lastPosition = firstString.lastIndexOf(lastString);
        if (firstPosition == -1) {
            System.out.println("-1 -1");
        } else {
            System.out.print((firstString.substring(0, firstPosition) + " ").split(" ").length);
            System.out.println(" " + (firstString.substring(0, lastPosition) + " ").split(" ").length);
        }
    }
}