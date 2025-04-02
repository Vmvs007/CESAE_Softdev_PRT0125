package parteA.atletas;

/**
 * Representa um atleta com atributos como nome, idade, modalidade,
 * clube, total de medalhas, recorde (melhor tempo em segundos) e total de horas de treino.
 * Fornece métodos para competir, treinar, adicionar medalhas, atualizar recorde,
 * mudar de clube, descansar e gerar o perfil do atleta.
 */
public class Atleta {

    private String nome;
    private int idade;
    private String modalidade;
    private String clube;
    private int totalMedalhas;
    private double recorde;         // Melhor tempo (em segundos); quanto menor, melhor
    private double totalHorasTreino;

    /**
     * Constrói um Atleta com os parâmetros fornecidos.
     *
     * @param nome        O nome do atleta
     * @param idade       A idade do atleta
     * @param modalidade  A modalidade em que compete (ex.: "100m rasos")
     * @param clube       O clube atual do atleta
     */
    public Atleta(String nome, int idade, String modalidade, String clube) {
        this.nome = nome;
        this.idade = idade;
        this.modalidade = modalidade;
        this.clube = clube;
        this.totalMedalhas = 0;
        // Inicializa o recorde com um valor alto (ex.: 99999 segundos)
        this.recorde = 99999.0;
        this.totalHorasTreino = 0.0;
    }

    /**
     * Simula uma competição, retornando uma mensagem com o tempo alcançado.
     *
     * @param tempoCompeticao O tempo alcançado na competição (em segundos)
     * @return Uma mensagem com o resultado da competição
     */
    public String competir(double tempoCompeticao) {
        return "Competiu com tempo: " + tempoCompeticao + " segundos";
    }

    /**
     * Registra uma sessão de treino, incrementando o total de horas de treino.
     *
     * @param horas O número de horas treinadas
     */
    public void treinar(double horas) {
        totalHorasTreino += horas;
    }

    /**
     * Adiciona uma medalha ao total de medalhas conquistadas.
     */
    public void adicionarMedalha() {
        totalMedalhas++;
    }

    /**
     * Atualiza o recorde do atleta, caso o novo tempo seja melhor (menor).
     *
     * @param novoRecorde O novo tempo alcançado na competição (em segundos)
     */
    public void atualizarRecorde(double novoRecorde) {
        recorde = novoRecorde;
    }

    /**
     * Muda o clube do atleta.
     *
     * @param novoClube O novo clube a que o atleta passa
     */
    public void mudarClube(String novoClube) {
        clube = novoClube;
    }

    /**
     * Faz o atleta descansar, resetando o total de horas de treino para 0.
     */
    public void descansar() {
        totalHorasTreino = 0.0;
    }

    /**
     * Gera um perfil do atleta, contendo nome, idade, modalidade, clube,
     * total de medalhas, recorde e total de horas de treino.
     *
     * @return Uma String com o resumo do perfil do atleta
     */
    public String gerarPerfilAtleta() {
        return "Nome: " + nome +
                ", Idade: " + idade +
                ", Modalidade: " + modalidade +
                ", Clube: " + clube +
                ", Medalhas: " + totalMedalhas +
                ", Recorde: " + recorde + " s" +
                ", Horas de Treino: " + totalHorasTreino;
    }
}
