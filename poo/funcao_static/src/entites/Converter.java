package entites;

public class Converter {

    public static final double TAX = 6/100;
    public double valorDolar;
    public double valorReal;


    public static double conversao(double cotacaoDolar, double quantidadeEmDolares) {
        double bruto = cotacaoDolar * quantidadeEmDolares;
        return bruto * (1.0 + TAX);
    }
    
}