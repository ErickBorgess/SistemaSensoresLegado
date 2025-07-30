package factory;

import adapter.SensorLuminosidadeAdaptado;
import core.ISensor;

public class SensLuminosidadeFactory extends SensorFactory {
    public ISensor criarRelatorio() {
        return new SensorLuminosidadeAdaptado();
    }
}
