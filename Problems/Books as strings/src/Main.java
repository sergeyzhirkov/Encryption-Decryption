import java.util.Arrays;

class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "title=" + title  +
                ",yearOfPublishing=" + yearOfPublishing +
                ",authors=" + Arrays.toString(authors).replaceAll(", ",",");
    }

//    public static void main(String[] args) {
//        Book book = new Book("java", 2017, new String[]{"Mario Fusco", "Alan Mycroft"});
//        System.out.println(book);
//    }

}