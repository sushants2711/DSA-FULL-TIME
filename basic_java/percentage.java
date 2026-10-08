package basic_java;

public class percentage {
    public static void main(String[] args) {
        double math = 99.12d;
        double phy = 98d;
        double che = 94d;
        double eng = 90.34d;
        double hin = 99d;

        double sum = math + phy + che + eng + hin;

        double percentageIs = (sum * 100) / 500;
        System.out.println(percentageIs);
    }
}
