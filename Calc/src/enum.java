enum Weeekday { // перечисление является классом
    MONDAY ("MON", false),
    TUESDAY ("TUE", false),
    WEDNESDAY ("WED", false),
    THUSDAY ("THU", false),
    FRIDAY ("FRI", false),
    SATURDAY ("SAT", true),
    SUNDAY ("SUN", true);
    private final String shortName;
    private final boolean weekend;

    Weeekday(String shortName, boolean weekend){
        this.shortName = shortName;
        this.weekend = weekend;
    }
    public String getShortName(){return shortName;}
    public boolean isWeekend(){return weekend;}

    String workingHours(Weeekday weekday){
        switch (weekday) {
            default:
                break;
            
        }
        return shortName;
    }
}
