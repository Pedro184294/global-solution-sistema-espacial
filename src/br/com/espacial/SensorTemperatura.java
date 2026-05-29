package br.com.espacial;

public class SensorTemperatura
        implements Sensor {

    @Override
    public void coletarDados() {

        System.out.println(
            "Coletando dados de temperatura..."
        );
    }
}