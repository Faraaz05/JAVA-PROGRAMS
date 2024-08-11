class Data {
    private int date;
    private int month;
    private int year;
    Data(int date,int month,int year) {
        setDate(date);
        setMonth(month);
        setYear(year);
    }
    public void setDate(int date) {
        this.date = date;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void displayDate() {
        System.out.println("Date: " + date + "/" + month + "/" + year);
    }
}
public class prac_3_4 {
    public static void main(String[] args) {
        Data d1 = new Data(3,4,2024);
        d1.displayDate();

        System.out.println("\n 23CS012_Faraaz_Bhojawala");
    }
}
