package factory;

import adapter.SensorTemperaturaAdapter;
import core.ISensor;

public class SensTemperaturaFactory extends SensorFactory {
    public ISensor criarRelatorio() {
        return new SensorTemperaturaAdapter();
    }
}
