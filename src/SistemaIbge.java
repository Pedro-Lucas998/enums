public class SistemaIbge {
    public static void main(String[] args) {
        // Percorrendo todas as opções no enum
        for (EstadosBrasileiros e : EstadosBrasileiros.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());
        }

        // Selecionando um estado de forma específica:
        EstadosBrasileiros estado_brasileir = EstadosBrasileiros.SAO_PAULO;
        System.out.println(estado_brasileir.getSigla());
        System.out.println(estado_brasileir.getNome());
        System.out.println(estado_brasileir.getNomeMaiusculo());

    }
}
