package factory;

import adapter.SensorLuminosidadeAdapter;
import core.ISensor;

public class SensLuminosidadeFactory extends SensorFactory {
    public ISensor criarRelatorio() {
        return new SensorLuminosidadeAdapter();
    }
}
