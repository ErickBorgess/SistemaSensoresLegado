package app;

import core.SensorManager;

public class Main {
    public static void main(String[] args) throws Exception {
        /*SensorManager manager = new SensorManager();
        manager.exibirDadosSensores();*/
        /*SensorFactory umidadeSensorFactory = new SensUmidadeFactory();
        ISensor umidade = umidadeSensorFactory.criarRelatorio();
        umidade.exibirDados();*/
        SensorManager manager = new SensorManager();
        manager.exibirDadosSensores();
    }
}
