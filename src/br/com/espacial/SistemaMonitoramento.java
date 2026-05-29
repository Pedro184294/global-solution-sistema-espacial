package br.com.espacial;

public class SistemaMonitoramento {

    public static void main(String[] args) {

        SistemaPropulsao propulsao =
                new PropulsaoQuimica();

        Satelite satelite =
                new Satelite(
                        "Hubble",
                        propulsao
                );

        Sensor sensor1 =
                new SensorTemperatura();

        Sensor sensor2 =
                new SensorPressao();

        DadosMissao dados =
                new DadosMissao(
                        25,
                        1.5
                );

        System.out.println(
            "===== SISTEMA ESPACIAL ====="
        );

        satelite.exibirStatus();

        satelite.ativarSistema();

        sensor1.coletarDados();

        sensor2.coletarDados();

        System.out.println(
            "Temperatura: "
            + dados.getTemperatura()
        );

        System.out.println(
            "Pressão: "
            + dados.getPressao()
        );
    }
}