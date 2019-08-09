package userDefinedException;

public class testMyException {
    private static int accNum[] = {1001, 1002, 1003, 1004};
    private static String accName[] = {"Nish", "Shubh", "Sush", "Abhi"};
    private static double balance[] = {10000.00, 12000.00, 5600.0, 999.00};

    public static void main(String[] args) {
        try {
            System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
            for (int i = 0; i < 5; i++) {
                System.out.println(accNum[i] + "\t" + accName[i] + "\t" + balance[i]);
                if (balance[i] < 1000) {
                    throw new MyException("Balance is less than 1000");
                }
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
