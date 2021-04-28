public class Pracownik {

    private String name;
    private String surname;
    private double salary;

    public Pracownik(){
        this.name = "";
        this.surname = "";
        this.salary = 0.0;
    }

    public Pracownik(Pracownik p){
        name = p.name;
        surname = p.surname;
        salary = p.salary;
    }

    public Pracownik(String n, String s, double sal){
        name = n;
        surname = s;
        salary = sal;
    }


    public String getName(){
        return name;
    }

    public void setName(String s){
        name = s;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String s){
        surname = s;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double s){
        salary = s;
    }

    public void salaryRise(double percent){
        salary = salary + salary * (percent/100);
    }


}
