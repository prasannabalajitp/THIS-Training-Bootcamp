package model;

public class Book {
    private int bId;
    private String bName;
    private int bprice;

    public Book(int bId, String bName, int bprice) {
        this.bId = bId;
        this.bName = bName;
        this.bprice = bprice;
    }

    @Override
    public String toString() {
        return "model.Book{" +
                "bId=" + bId +
                ", bName='" + bName + '\'' +
                ", bprice=" + bprice +
                '}';
    }
}
