package factory;

import adapter.SensorUmidadeAdapter;
import core.ISensor;

public class SensUmidadeFactory extends SensorFactory {
    public ISensor criarRelatorio() {
        return new SensorUmidadeAdapter();
    }
}
