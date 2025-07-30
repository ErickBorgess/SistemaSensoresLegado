package adapter;

import core.ISensor;
import legacy.SensorUmidade;

public class SensorUmidadeAdapter implements ISensor {
    private SensorUmidade sensor = new SensorUmidade();

    public String exibirDados() {
        return sensor.lerUmidade()+"%";
    }

    public String getTipo() {
        return "Umidade";
    }
}
