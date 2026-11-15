public class Book {
    String title;
    int totalPage;
    int currentPage;

    Book(String title, int total, int cur) {
        this.title = title;
        this.totalPage = total;
        this.currentPage = cur;
    }

    public void read() {currentPage++;}
    public void ripPages(int n) {totalPage -= n;}
}
