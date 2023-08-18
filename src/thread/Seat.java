package thread;

public class Seat {
    private Integer number;
    private String status;

    private String Category;

    public Seat(Integer number, String status, String category) {
        this.number = number;
        this.status = status;
        Category = category;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
