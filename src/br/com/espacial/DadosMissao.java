package br.com.espacial;

public class DadosMissao {

    private double temperatura;
    private double pressao;

    public DadosMissao(
            double temperatura,
            double pressao) {

        this.temperatura = temperatura;
        this.pressao = pressao;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {

        if (temperatura < -200) {

            System.out.println(
                "Temperatura inválida!"
            );

            return;
        }

        this.temperatura = temperatura;
    }

    public double getPressao() {
        return pressao;
    }

    public void setPressao(double pressao) {

        if (pressao < 0) {

            System.out.println(
                "Pressão inválida!"
            );

            return;
        }

        this.pressao = pressao;
    }
}