package adapter;

import core.ISensor;

public class SensorTemperaturaAdaptado implements ISensor {
    public String lerDados() {
        //Simula leitura
        return "36.5";
    }

    public void exibirDados() {
        System.out.println("Temperatura: "+lerDados()+"°C");
    }
}
