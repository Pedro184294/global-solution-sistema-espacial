package br.com.espacial;

public class PropulsaoQuimica
        extends SistemaPropulsao {

    public PropulsaoQuimica() {

        super("Propulsão Química");
    }

    @Override
    public void ativarPropulsao() {

        System.out.println(
            "Sistema de propulsão química ativado!"
        );
    }
}