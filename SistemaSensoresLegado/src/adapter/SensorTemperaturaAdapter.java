package adapter;

import core.ISensor;
import legacy.SensorTemperatura;

public class SensorTemperaturaAdapter implements ISensor {
    private SensorTemperatura sensor = new SensorTemperatura();

    public String exibirDados() {
        return sensor.lerTemperatura()+"°C";
    }

    public String getTipo() {
        return "Temperatura";
    }

    public double getValorNumerico() {
        return sensor.lerTemperatura();
    }
}
