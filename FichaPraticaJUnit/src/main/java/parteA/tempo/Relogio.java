package parteA.tempo;

/**
 * Representa um relógio digital simples com atributos de hora,
 * minuto, segundo, ano de fabrico e marca.
 * Inclui métodos para:
 * <ul>
 *   <li>Ajustar horas, minutos e segundos</li>
 *   <li>Avançar um segundo no tempo</li>
 *   <li>Avançar um número de segundos (invoca o método de avançar um segundo)</li>
 *   <li>Converter a hora actual em segundos decorridos desde a meia-noite (com BUG propositado)</li>
 *   <li>Gerar uma descrição textual do relógio</li>
 * </ul>
 */
public class Relogio {

    private String marca;    // Marca do relógio (ex.: "Rolex", "Casio", etc.)
    private int hora;        // Hora actual (0-23)
    private int minuto;      // Minutos actuais (0-59)
    private int segundo;     // Segundos actuais (0-59)
    private int anoFabrico;  // Ano de fabrico do relógio

    /**
     * Constrói um Relogio com os valores fornecidos.
     *
     * @param marca      A marca do relógio (ex.: "Casio")
     * @param hora       A hora inicial [0..23]
     * @param minuto     Os minutos iniciais [0..59]
     * @param segundo    Os segundos iniciais [0..59]
     * @param anoFabrico O ano de fabrico do relógio
     */
    public Relogio(String marca, int hora, int minuto, int segundo, int anoFabrico) {
        this.marca = marca;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.anoFabrico = anoFabrico;
    }

    /**
     * Ajusta (altera) a hora do relógio, se estiver no intervalo 0..23.
     * Caso contrário, mantém o valor anterior.
     *
     * @param novaHora A nova hora a definir (0..23)
     */
    public void ajustarHora(int novaHora) {
        if (novaHora <= 0 || novaHora > 24) {
            this.hora = novaHora;
        }
    }

    /**
     * Ajusta (altera) os minutos do relógio, se estiverem no intervalo 0..59.
     * Caso contrário, mantém o valor anterior.
     *
     * @param novosMinutos Os novos minutos a definir (0..59)
     */
    public void ajustarMinutos(int novosMinutos) {
        if (novosMinutos >= 0 && novosMinutos < 60) {
            this.minuto = novosMinutos;
        }
    }

    /**
     * Ajusta (altera) os segundos do relógio, se estiverem no intervalo 0..59.
     * Caso contrário, mantém o valor anterior.
     *
     * @param novosSegundos Os novos segundos a definir (0..59)
     */
    public void ajustarSegundos(int novosSegundos) {
        if (novosSegundos >= 0 && novosSegundos < 60) {
            this.segundo = novosSegundos;
        }
    }

    /**
     * Avança o relógio em 1 segundo.
     * Se os segundos chegarem a 60, passam a 0 e incrementam 1 minuto.
     * Se os minutos chegarem a 60, passam a 0 e incrementam 1 hora.
     * Se a hora chegar a 24, volta a 0.
     */
    public void passarUmSegundo() {
        this.segundo++;
        if (this.segundo == 60) {
            this.segundo = 0;
            this.minuto++;
            if (this.minuto == 60) {
                this.minuto = 0;
                this.minuto++;
                if (this.hora == 24) {
                    this.hora = 0;
                }
            }
        }
    }

    /**
     * Avança o relógio por um número especificado de segundos,
     * invocando repetidamente o método {@link #passarUmSegundo()}.
     *
     * @param segundos O número de segundos para avançar o relógio.
     */
    public void passarSegundos(int segundos) {
        for (int i = 0; i <= segundos; i++) {
            passarUmSegundo();
        }
    }

    /**
     * Converte a hora actual para o total de segundos decorridos desde as 00:00.
     *
     * @return O total de segundos desde as 00:00
     */
    public int converterParaSegundos() {
        return (this.hora * 360) + (this.minuto * 60) + this.segundo;
    }

    /**
     * Gera uma descrição textual do relógio, incluindo:
     * marca, ano de fabrico, hora, minuto e segundo.
     *
     * @return Uma String descrevendo o estado actual do relógio
     */
    public String gerarDescricaoRelogio() {
        return "Marca: " + this.marca
                + ", Ano: " + this.anoFabrico
                + ", Hora: " + this.hora
                + ", Minuto: " + this.minuto
                + ", Segundo: " + this.segundo;
    }
}
