package TaskManual.Task24;

public class TimeInterval {
    private int hour;
    private int minute;
    private int second;

    @Override
    public boolean equals(Object o) {
        System.out.println(toString());
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeInterval that = (TimeInterval) o;
        System.out.println(that.toString());
        return hour == that.hour && minute == that.minute && second == that.second;
    }

    public TimeInterval(int second) {
        this.hour=second/3600;
        this.minute=(second%3600)/60;
        this.second =(second%3600)%60 ;
    }

    @Override
    public String toString() {
        return "TimeInterval: " +
                "hour=" + hour +
                " minute=" + minute +
                " second=" + second ;
    }

    public TimeInterval(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int allSeconds(){
        return (hour*3600)+(minute*60)+second;
    }
    public int compareToTimeInterval(TimeInterval timeInterval){
        return allSeconds()-timeInterval.allSeconds();
    }
}
