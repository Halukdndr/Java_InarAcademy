package chapters.chapter_10.exercises;

public class Exercise_08 {
    public static void main(String[] args) {
       int[][] bracketsFor2009 = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 208850, 372950}, // Married jointly or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };
        double[] ratesFor2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] bracketsFor2001 = {
                {27050, 65550,136750,297350}, // Single filer
                {45200,109250,166500,297350}, // Married jointly or qualifying widow(er)
                {22600,54625,83250,148675}, // Married separately
                {36250,93650,151650,297350} // Head of household
        };
        double[] ratesFor2001 = {0.15, 0.275,0.305,0.355,0.391};
        Tax mytax1 = new Tax();
        mytax1.setBrackets(bracketsFor2001);
        mytax1.setRates(ratesFor2001);
        displayTable(mytax1,2001);
        System.out.println("---------------------------------------------");
        Tax mytax2 = new Tax();
        mytax2.setBrackets(bracketsFor2009);
        mytax2.setRates(ratesFor2009);
        displayTable(mytax2,2009);



    }
    public static void displayTable(Tax tax,int year){
        System.out.println("    " + year + "                               Married filing jointly    Married filing ");
        System.out.println("TaxableIncome           Single filers  or qualifying widow(er)   separately       Head of household");
        for (int i = 50_000; i <= 60_000 ; i += 1_000) {
            tax.setTaxableIncome(i);
            System.out.print(tax.getTaxableIncome() + "         ");
            for (int j = 0; j < 4; j++) {
                tax.setTaxableIncome(i);
                tax.setFilingStatus(j);
                System.out.printf("%19.1f",tax.getTax());
            }
            System.out.println();
        }



    }

}
