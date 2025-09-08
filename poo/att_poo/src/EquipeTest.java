import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EquipeTest {

    @Test
    void ignoraPlacarInvalido() {
        Equipe e = new Equipe("Cabuloso");
        e.registrarPartida("-1x2");  // inválido
        e.registrarPartida("abc");   // inválido
        e.registrarPartida("0x2");   // válido (derrota)
        assertEquals(1, e.getPartidasDisputadas()); // só contou a válida
        assertEquals(0, e.pontosGanhos());          // derrota = 0
    }

    @Test
    void calculaPontuacao() {
        Equipe e = new Equipe("LPM");
        e.registrarPartida("1x0"); // +3
        e.registrarPartida("2x0"); // +3  => 6
        e.registrarPartida("1x3"); // +0  => 6
        assertEquals(6, e.pontosGanhos());
    }

    @Test
    void comparaEquipesCorretamente() {
        Equipe a = new Equipe("A");
        a.registrarPartida("3x1");
        a.registrarPartida("2x0"); // 6 pts, saldo 4, gols 5

        Equipe b = new Equipe("B");
        b.registrarPartida("2x1");
        b.registrarPartida("2x1"); // 6 pts, saldo 2, gols 4

        assertTrue(a.superaEquipe(b)); // saldo decide

        Equipe c = new Equipe("C");
        c.registrarPartida("3x2");
        c.registrarPartida("3x2"); // 6 pts, saldo 2, gols 6
        assertTrue(c.superaEquipe(b)); // gols marcados decide
    }
}
