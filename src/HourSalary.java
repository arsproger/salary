public class HourSalary extends AbstractEmployee implements ReceivingSalary{

    double hoursSalary;

    public HourSalary(String name, String secondName, int age, String jodTitle, String company, double hoursSalary) {
        super(name, secondName, age, jodTitle, company);
        this.hoursSalary = hoursSalary;
    }

    @Override
    public String getSalary() {
        String res = "avg salary: " + 20.8 * 8 * hoursSalary;
        return res;
    }

    public double getHoursSalary() {
        return hoursSalary;
    }

    public void setHoursSalary(double hoursSalary) {
        this.hoursSalary = hoursSalary;
    }
}
