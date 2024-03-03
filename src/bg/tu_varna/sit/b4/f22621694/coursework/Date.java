package bg.tu_varna.sit.b4.f22621694.coursework;

public class Date {
    private int day;
    private int month;
    private int year;


    public int getDay() {
        return day;
    }

    public void setDay(int day) throws DateException{
        if(day>0 && day<32){
        this.day = day;
        } else throw new DateException("Invalid day");
    }

    public int getMonth(){
        return month;
    }

    public void setMonth(int month) throws DateException {
        if(month>0 && month<13){
        this.month = month;
        } else throw new DateException("Invalid month");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
