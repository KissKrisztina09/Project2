package labor9_1;

public class MyDate implements  Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append( this.year + "/" +
                this.month + "/" +
                this.day);
        return result.toString();
    }

    @Override
    public int compareTo(MyDate myDate) {
        if( this.year != myDate.year ){
            return this.year - myDate.year;
        }
        if( this.month != myDate.month){
            return this.month - myDate.month;
        }
        if( this.day != myDate.day ){
            return this.day - myDate.day;
        }
        return 0;
    }
}
