import javax.swing.JOptionPane;

public class upgft9p4 {

    public static double upphöjtTill(double x, int n) {
        double res = 1;
        int i = 1;
        if (n >= 0)
            for (; i <= n; i++)
                res = res * x;
        else {
            if (x == 0) {
                return Double.POSITIVE_INFINITY;
            }
            for (; i >= n; i--)
                res = res / x;
        }
        return res;
    }

    public static double räntaPåRänta(double b, double r, int n) {
        return b * upphöjtTill(1 + 0.01 * r, n);
    }

    public static double beloppvidUttag(double b, double r, int n, double ut) {
        if (ut > b * 0.01 * r * n) {
            JOptionPane.showMessageDialog(null, "För stort uttag");
            return 0;
        } else {
            int i = 1;
            while (i <= n) {
                b = b + b * 0.01 * r - ut;
                i++;
            }
            return b;
        }
    }




    public static void main(String[] args) {
        // input som valuta ränta år och uttag
        double initialAmount = Double.parseDouble(JOptionPane.showInputDialog("valuta på banken: "));
        double interestRate = Double.parseDouble(JOptionPane.showInputDialog("ränta i %: "));
        int numberOfYears = Integer.parseInt(JOptionPane.showInputDialog("Hur många år: "));
        double withdrawalAmount = Double.parseDouble(JOptionPane.showInputDialog("hur mycket tar du ut: "));


        System.out.printf("%-10s%-20s\n", "Year", "Amount");


        // visa i rader
        for (int year = 1; year <= numberOfYears; year++) {

            double amount = beloppvidUttag(initialAmount, interestRate, year, withdrawalAmount);
            System.out.printf("%-10d%-20.2f\n", year, amount);

        }
    }
}
