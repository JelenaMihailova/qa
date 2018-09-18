import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoanSumCalculationTest {

    @Test
    public class LoanSumCalculation {

        public void totalLoanSum(int startSum, int procent, int procent2, int procent3, int periodMonth) {
            double loanLeftSum = startSum - (startSum / 360 * 120);
            double loanLeftSum2 = startSum - (startSum / 360 * 240);
            if (periodMonth <= 120);
            {
                double monthlyPayment = startSum / 360 + (startSum * procent / 100);
                double totalFirstTenYears = monthlyPayment * 120;
            }
            if (periodMonth <= 240 ) ;
            {
                double monthlyPayment2 = startSum / 360 + (loanLeftSum * procent2 / 100);
                double totalSecondTenYears2 = monthlyPayment2 * 120;
            }
        else
            {
                double monthlyPayment3 = startSum / 360 + (loanLeftSum2 * procent3 / 100);
                double totalThirdTenYears3 = monthlyPayment3 * 120;
            }
            double totalLoanSum = totalFirstTenYears + totalSecondTenYears2 + totalThirdTenYears3;
        }

        public LoanSumCalculation() {
            LoanSumCalculation sum = new LoanSumCalculation();
            double s = sum.totalLoanSum(1000, 5, 3, 2);
            System.out.println(s);
        }
    }
}

