public class Kierownik extends Pracownik {

    private double bonus;

    public Kierownik(){
        super();
        bonus = 0;
    }

    public Kierownik(Kierownik k){
        super(k);
        bonus = 0;
    }

    public Kierownik(String n, String s, double sal){
        super(n,s,sal);
        bonus = 0;
    }



    public double getSalaryWithBonus(){
        return super.getSalary() + bonus;
    }

    public void setBonus(double b){
        bonus = b;
    }





}
