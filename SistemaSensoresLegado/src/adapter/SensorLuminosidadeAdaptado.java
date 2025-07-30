package adapter;

import core.ISensor;

public class SensorLuminosidadeAdaptado implements ISensor {
    public String lerDados() {
        //Simula leitura de luminosidade
        return "850";
    }

    public void exibirDados() {
        System.out.println("Luminosidade: "+lerDados()+" Lux");
    }
}
