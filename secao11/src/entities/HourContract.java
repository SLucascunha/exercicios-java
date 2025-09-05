package entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valueHour;
    private Integer hour;

    public HourContract() {
    }

    public HourContract(Date date, Double valueHour, Integer hour) {
        this.date = date;
        this.valueHour = valueHour;
        this.hour = hour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Double getValueHour() {
        return valueHour;
    }

    public void setValueHour(Double valueHour) {
        this.valueHour = valueHour;
    }

    public double totalValue() {
        return valueHour * hour;
    }

}
