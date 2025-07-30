package adapter;

import core.ISensor;

public class SensorUmidadeAdaptado implements ISensor {
    public String lerDados() {
        //Simula leitura de umidade
        return "72.3";
    }

    public void exibirDados() {
        System.out.println("Umidade: "+lerDados()+"%");
    }
}
