package sg.edu.rp.dmsd.sgholidaysv2;

public class Holiday {

    private String holiday;
    private boolean yes;

    public Holiday(String holiday, boolean yes) {
        this.holiday = holiday;
        this.yes = yes;
    }

    public String getName() {
        return holiday;
    }

    public boolean isProg() {
        return yes;
    }
}
