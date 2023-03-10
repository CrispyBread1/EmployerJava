package Managment;


public class Director extends Manager{

    private double budget;

    public Director(String name, String nINumber, int salary, String deptName, double budget) {
        super(name, nINumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }

    @Override
    public double bonus(){
        return getSalary() * 0.02;
    }
}
