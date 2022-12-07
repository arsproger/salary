public abstract class AbstractEmployee {
    private String name;
    private String secondName;
    private int age;
    private String jodTitle;
    private String company;//подразделение в котором он работает

    public AbstractEmployee(String name, String secondName, int age, String jodTitle, String company) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.jodTitle = jodTitle;
        this.company = company;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJodTitle() {
        return jodTitle;
    }

    public void setJodTitle(String jodTitle) {
        this.jodTitle = jodTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
