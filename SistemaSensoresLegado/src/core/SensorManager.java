package core;

import java.util.ArrayList;
import java.util.List;
import adapter.SensorTemperaturaAdapter;
import decorator.SensorComAlerta;
import decorator.SensorComLog;
import display.DisplayConsole;
import display.IDisplay;
import factory.SensLuminosidadeFactory;
import factory.SensUmidadeFactory;

public class SensorManager {
    private static SensorManager instancia;
    private IDisplay display;
    private List<ISensor> sensores = new ArrayList<>();

    private SensorManager() {
        this.display = new DisplayConsole();
        ISensor temperatura = new SensorTemperaturaAdapter();
        sensores.add(new SensUmidadeFactory().criarRelatorio());
        sensores.add(new SensLuminosidadeFactory().criarRelatorio());
        sensores.add(new SensorComAlerta(temperatura, 50));
        sensores.add(new SensorComLog(temperatura));
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
}
