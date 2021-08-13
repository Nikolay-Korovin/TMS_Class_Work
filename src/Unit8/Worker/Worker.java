package Unit8.Worker;

public class Worker {
    private String name;
    private String surname;
    private double rate;
    private int days;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getRate() {
        return rate;
    }

    public int getDays() {
        return days;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getSalary(){
        return rate*days;
    }
}
