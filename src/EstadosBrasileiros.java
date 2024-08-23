public enum EstadosBrasileiros {
    SAO_PAULO ("São Paulo", "SP"),
    RIO_DE_JANEIRO ("Rio de Janeiro", "RJ"),
    PIAU ("Piauí", "PI"),
    MARANHAO ("Maranhão", "MA");
    //SAO_PAULO ("São Paulo", "SP") -> cria uma constante de objeto denominado SAO_PAULO onde
    //o nome desse objeto é São paulo, e a sua sigla é SP.

    private String nome;
    private String sigla;

    private EstadosBrasileiros(String nome, String sigla){ // construtor da enum
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome(){
        return nome;
    }

    public String getSigla(){
        return sigla;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
