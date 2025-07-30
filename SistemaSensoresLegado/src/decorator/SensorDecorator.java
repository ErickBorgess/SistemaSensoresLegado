package decorator;

import core.ISensor;

public abstract class SensorDecorator implements ISensor {
    protected ISensor sensorDecorado;

    public SensorDecorator(ISensor sensor) {
        this.sensorDecorado = sensor;
    }

    public String getTipo() {
        return sensorDecorado.getTipo();
    }

    public String exibirDados() {
        return sensorDecorado.exibirDados();
    }

    public double getValorNumerico() {
        return sensorDecorado.getValorNumerico();
    }
}
