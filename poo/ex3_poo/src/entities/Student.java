package entities;

public class Student {
    public String nome;
    public double[] notas = new double[3];
    public boolean aprovado;



public double NotaFinal() {
    double soma = 0;
    for (double nota : this.notas) {
        soma += nota;
    }
    return soma;
}
public double pontosFaltantes(){
    return 100 - this.NotaFinal();
}

public String VerificaSePassou(){
    if(this.NotaFinal() < 60) {
        return "Failed\nMissing " + pontosFaltantes();
    } else {
        return "Pass";
    }
}
public String toString(){

return "FINAL GRADE = " + NotaFinal()+ "\n"+ VerificaSePassou();

}

}