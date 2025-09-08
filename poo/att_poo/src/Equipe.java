public class Equipe {
    private String nome;
    private int partidasDisputadas;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int golsMarcados;
    private int golsSofridos;

    public Equipe(String nome){
        this.nome = nome;
        this.partidasDisputadas = 0;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
        this.golsMarcados = 0;
        this.golsSofridos = 0;
    }

    public int getPartidasDisputadas() { return partidasDisputadas; }

    public int pontosGanhos(){
        return vitorias * 3 + empates;
    }

    public int saldoDeGols(){
        return golsMarcados - golsSofridos;
    }

    // simples e robusto: ignora inválidos
    public int registrarPartida(String placar) {
        try {
            String[] p = placar.split("x", 2);
            int feitos  = Integer.parseInt(p[0].trim());
            int levados = Integer.parseInt(p[1].trim());
            if (feitos < 0 || levados < 0) return pontosGanhos(); // ignora

            partidasDisputadas++;
            golsMarcados += feitos;
            golsSofridos += levados;

            if (feitos > levados)       vitorias++;
            else if (feitos == levados) empates++;
            else                        derrotas++;
        } catch (Exception e) {
            // placar inválido: não altera nada
        }
        return pontosGanhos();
    }

    // pontos → vitórias → saldo → gols marcados
    public boolean superaEquipe(Equipe outra){
        if (this.pontosGanhos() != outra.pontosGanhos())
            return this.pontosGanhos() > outra.pontosGanhos();
        if (this.vitorias != outra.vitorias)
            return this.vitorias > outra.vitorias;
        if (this.saldoDeGols() != outra.saldoDeGols())
            return this.saldoDeGols() > outra.saldoDeGols();
        if (this.golsMarcados != outra.golsMarcados)
            return this.golsMarcados > outra.golsMarcados;
        return false;
    }

    // (opcional) resumo com 2 dígitos em tudo
    private static String dd(int n){
        return (n >= 0) ? String.format("%02d", n)
                        : "-" + String.format("%02d", -n);
    }
    public String resumo() {
        return String.format("%s %s %s %s %s %s %s %s %s",
            nome,
            dd(pontosGanhos()),
            dd(partidasDisputadas),
            dd(vitorias),
            dd(empates),
            dd(derrotas),
            dd(golsMarcados),
            dd(golsSofridos),
            dd(saldoDeGols())
        );
    }
}
