package br.com.espacial;

public abstract class SistemaPropulsao {

    protected String tipo;

    public SistemaPropulsao(String tipo) {

        this.tipo = tipo;
    }

    public abstract void ativarPropulsao();
}