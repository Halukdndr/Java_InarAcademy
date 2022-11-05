package weeks.week_11;

public class FootballClub {
    // Data Field
    private String clubName;
    private double balance;
    private double ticketFee;
    private String stadium;
    private double stadiumCapacity;
    private int[] player;

    // Constructor
    public FootballClub(){
    }
    public FootballClub(double balance,String clubName,double ticketFee,String stadium,double stadiumCapacity,int[] player){
        this.clubName = clubName;
        this.balance = balance;
        this.ticketFee = ticketFee;
        this.player = player;
        this.stadiumCapacity = stadiumCapacity;
        this.stadium = stadium;

    }
    // Methods



}
