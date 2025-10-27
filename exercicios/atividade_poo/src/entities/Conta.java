package entities;

public class Conta{

private static final int TAXA = 5;
private int numeroConta;
private String nome;
protected double saldo;

public Conta(){
}

public Conta(int numeroConta, String nome, double saldo){
    this.numeroConta = numeroConta;
    this.nome = nome;
    this.saldo = saldo;
}
public Conta(int numeroConta, String nome){
    this.numeroConta = numeroConta;
    this.nome = nome;
}

public void setNome(String nome){
    this.nome = nome;
}

public String getNome(){
    return this.nome;
}

public void depositoConta(double deposito){

    this.saldo += deposito;

}   

public void saqueConta(double valor){

    this.saldo = saldo - valor - TAXA;
}


public String toString(){
    return "Conta " + numeroConta + ", "+ "Titular: " + nome + ", " + "Saldo: R$ " + saldo;
}


}