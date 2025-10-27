package entities;


public class ContaPopanca extends Conta{
    private double taxaDeJuros;

    public ContaPopanca(){
        super();
    }
    public ContaPopanca(int numeroConta, String nome, double saldo, double taxaDeJuros){
        super(numeroConta, nome, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getTaxaDeJuros(){
        return taxaDeJuros;
    }

    public void setTaxadeJuros(double taxaDeJuros){
        this.taxaDeJuros = taxaDeJuros;
    }

    public void atualizarSaldoConta(){
        saldo += saldo * taxaDeJuros;
    }

    @Override
    public void saqueConta(double valor){
    this.saldo = saldo - valor;
}
}
