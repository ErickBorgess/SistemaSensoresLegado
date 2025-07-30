package app;

import core.SensorManager;

public class Main {
    public static void main(String[] args) throws Exception {
        SensorManager manager = SensorManager.getInstancia();
        manager.exibirDadosSensores();
    }
}
