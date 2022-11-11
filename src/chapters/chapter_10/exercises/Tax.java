package chapters.chapter_10.exercises;

public class Tax {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    public double getTax(){
        double tax = 0;
        if (taxableIncome >= brackets[filingStatus][0]) {
            for (int i = brackets[filingStatus].length - 1; i >= 0; i--) {
                if (taxableIncome > brackets[filingStatus][i]) {
                    tax += (taxableIncome - brackets[filingStatus][i]) * rates[i + 1];
                    taxableIncome = brackets[filingStatus][i];
                }
            }
            tax += brackets[filingStatus][0] * rates[0];
        }else{
            tax = taxableIncome * rates[0];
        }
        return tax;
    }
}
