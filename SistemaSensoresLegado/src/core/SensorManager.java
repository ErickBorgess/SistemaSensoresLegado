package core;

import java.util.ArrayList;
import java.util.List;
import display.DisplayConsole;
import display.IDisplay;
import factory.SensLuminosidadeFactory;
import factory.SensTemperaturaFactory;
import factory.SensUmidadeFactory;
import factory.SensorFactory;

public class SensorManager {
    private static SensorManager instancia;
    private IDisplay display;
    private List<ISensor> sensores = new ArrayList<>();

    private SensorManager() {
        this.display = new DisplayConsole();
        sensores.add(new SensTemperaturaFactory().criarRelatorio());
        sensores.add(new SensUmidadeFactory().criarRelatorio());
        sensores.add(new SensLuminosidadeFactory().criarRelatorio());
    }

    public static SensorManager getInstancia() {
        if(instancia == null) {
            instancia = new SensorManager();
        }
        return instancia;
    }

    public void exibirDadosSensores() {
        for(ISensor sensor : sensores) {
            display.mostrarDados(sensor.getTipo(), sensor.exibirDados());
        }
    }


    //Codigo fonte
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

}
