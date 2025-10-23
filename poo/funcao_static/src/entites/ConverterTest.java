package entites;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void taxDeveSerSeisPorCento() {
        assertEquals(0.06, Converter.TAX, 1e-12);
    }

    // Se a regra for: total = cotacao * dolar * (1 + TAX)
    @ParameterizedTest
    @CsvSource({
        "5.00, 10.0, 53.0",     // 5*10=50; 50*1.06 = 53
        "4.00,  0.5, 2.12",     // 4*0.5=2;  2*1.06  = 2.12
        "5.25,  3.0, 16.695"    // 5.25*3=15.75; *1.06 = 16.695
    })
    void conversaoCalculaValorEmReaisComIof(double cotacao, double dolares, double esperado) {
        double total = Converter.conversao(cotacao, dolares);
        assertEquals(esperado, total, 1e-9);
    }

    // Exemplos de validações extras (se você decidir tratar entradas inválidas):
    // @Test
    // void deveLancarSeCotacaoForNaoPositiva() {
    //     assertThrows(IllegalArgumentException.class, () -> Converter.conversao(0.0, 10));
    // }
}
