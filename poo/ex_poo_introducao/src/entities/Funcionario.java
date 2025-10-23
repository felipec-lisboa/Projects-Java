package entities;

public class Funcionario {
    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary(){


        return grossSalary - tax;
    }

    public void increaseSalary (double porcentage){

        grossSalary += grossSalary * porcentage / 100.0;
        
    }
    public String toString(){
        return "Employee: "+name + ","+ " $ " + NetSalary();
    }
}

