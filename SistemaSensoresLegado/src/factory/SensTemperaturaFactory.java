package factory;

import adapter.SensorTemperaturaAdaptado;
import core.ISensor;

public class SensTemperaturaFactory extends SensorFactory {
    public ISensor criarRelatorio() {
        return new SensorTemperaturaAdaptado();
    }
}
