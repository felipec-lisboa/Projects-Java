package entities;


public class ContaEmpresarial extends Conta{
    
    private double limiteEmprestimo;

    public ContaEmpresarial(){
        super();
    }

    public ContaEmpresarial(int numeroConta, String nome, double saldo, double limiteEmprestimo){
        super(numeroConta,nome,saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public double getLimiteEmprestimo(){
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo){
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double valor){
        if(valor >= this.limiteEmprestimo){
            System.out.println("Você não tem limite para essa transação");
        }else depositoConta(valor);
    }

    @Override
    public void saqueConta(double valor){
        super.saqueConta(valor);
        this.saldo -= 2;
    }

}
