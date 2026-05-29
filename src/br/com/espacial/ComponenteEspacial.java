package br.com.espacial;

public abstract class ComponenteEspacial {

    protected String nome;
    protected String status;

    public ComponenteEspacial(String nome) {

        this.nome = nome;
        this.status = "Operacional";
    }

    public abstract void exibirStatus();
}