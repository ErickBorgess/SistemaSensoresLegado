package core;

import factory.SensLuminosidadeFactory;
import factory.SensTemperaturaFactory;
import factory.SensUmidadeFactory;
import factory.SensorFactory;

public class SensorManager {
    /*private SensorTemperatura sensorTemp = new SensorTemperatura();
    private SensorUmidade sensorUmidade = new SensorUmidade();
    private SensorLuminosidade sensorLuminosidade = new SensorLuminosidade();
    private DisplayConsole display = new DisplayConsole();
    private 

    public void exibirDadosSensores() {
        double temp = sensorTemp.lerTemperatura();
        double umidade = sensorUmidade.lerUmidade();
        int luminosidade = sensorLuminosidade.lerLuminosidade();

        display.mostrarDados("Temperatura", temp+"°C");
       display.mostrarDados("Umidade", umidade+"%");
        display.mostrarDados("Luminosidade", luminosidade+" lux");
    }*/

    SensorFactory umidadeSensorFactory = new SensUmidadeFactory();
    ISensor umidade = umidadeSensorFactory.criarRelatorio();
    SensorFactory luxFactory = new SensLuminosidadeFactory();
    ISensor lux = luxFactory.criarRelatorio();
    SensorFactory tempFactory = new SensTemperaturaFactory();
    ISensor temp = tempFactory.criarRelatorio();
    
    public void exibirDadosSensores() {
        umidade.exibirDados();
        lux.exibirDados();
        temp.exibirDados();
    }

}
