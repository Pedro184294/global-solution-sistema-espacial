package br.com.espacial;

public class SensorPressao
        implements Sensor {

    @Override
    public void coletarDados() {

        System.out.println(
            "Coletando dados de pressão..."
        );
    }
}