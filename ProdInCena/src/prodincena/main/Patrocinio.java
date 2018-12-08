package prodincena.main;

public enum Patrocinio {
    EMPRESA_PUBLICA("Empresa Publica"), 
    EMPRESA_PRIVADA("Empresa Privada"), 
    LIC("Leis de Incentivo a Cultura"), 
    VENDA_PRODUCAO("Venda da Produção");
    
    public String valPatrocinio;

    private Patrocinio(String valPatrocinio) {
        this.valPatrocinio = valPatrocinio;
    }

    public String getValPatrocinio() {
        return valPatrocinio;
    }
}
