package decorator;

import core.ISensor;

public class SensorComLog extends SensorDecorator {
    public SensorComLog (ISensor sensorOriginal) {
        super(sensorOriginal);
    }

    public String exibirDados() {
        String valor = sensorDecorado.exibirDados();
        String log = "[LOG - Leitura]: "+valor;
        return log;
    }
}
