package adapter;

import core.ISensor;
import legacy.SensorLuminosidade;

public class SensorLuminosidadeAdapter implements ISensor {
    private SensorLuminosidade sensor = new SensorLuminosidade();

    public String exibirDados() {
        return sensor.lerLuminosidade()+" Lux";
    }

    public String getTipo() {
        return "Luminosidade";
    }
}
