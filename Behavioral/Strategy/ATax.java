// Esta classe abstrata implementa imposto a fim de generalizar os métodos de cálculo de impostos.
public abstract class ATax implements Tax{

    protected double value;

    @Override
    public abstract double calculate();
    
}