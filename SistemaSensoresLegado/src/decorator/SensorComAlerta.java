package decorator;

import core.ISensor;

public class SensorComAlerta extends SensorDecorator{
    private double limite;

    public SensorComAlerta(ISensor sensorOriginal, double limite) {
        super(sensorOriginal);
        this.limite = limite;
    }

    public String exibirDados() {
        double valor = getValorNumerico();
        if(valor > limite) {
            return sensorDecorado.exibirDados()+" ALERTA! TEMPERATURA ACIMA DO LIMITE!";
        }
        return sensorDecorado.exibirDados();
    }
}
