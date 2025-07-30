package factory;

import adapter.SensorUmidadeAdaptado;
import core.ISensor;

public class SensUmidadeFactory extends SensorFactory {
    public ISensor criarRelatorio() {
        return new SensorUmidadeAdaptado();
    }
}
