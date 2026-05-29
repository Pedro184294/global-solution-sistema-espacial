package br.com.espacial;

public class Satelite
        extends ComponenteEspacial {

    private SistemaPropulsao propulsao;

    public Satelite(
            String nome,
            SistemaPropulsao propulsao) {

        super(nome);

        this.propulsao = propulsao;
    }

    @Override
    public void exibirStatus() {

        System.out.println(
            "Satelite: "
            + nome
        );

        System.out.println(
            "Status: "
            + status
        );
    }

    public void ativarSistema() {

        propulsao.ativarPropulsao();
    }
}