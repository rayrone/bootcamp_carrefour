package digital.innovation.one.utils;

import digital.innovation.one.utils.internal.DivisionHelper;
import digital.innovation.one.utils.internal.MultiplicationHelper;
import digital.innovation.one.utils.internal.SubtractionHelper;
import digital.innovation.one.utils.internal.SumHelper;

public class Calculadora {

    private final DivisionHelper divisionHelper;
    private final MultiplicationHelper multiplicationHelper;
    private final SubtractionHelper subtractionHelper;
    private final SumHelper sumHelper;

    public Calculadora() {
        divisionHelper = new DivisionHelper();
        multiplicationHelper = new MultiplicationHelper();
        subtractionHelper = new SubtractionHelper();
        sumHelper = new SumHelper();
    }

    public int divide(int a, int b) {
        return divisionHelper.execute(a, b);
    }

    public int multiply(int a, int b) {
        return multiplicationHelper.execute(a, b);
    }

    public int subtraction(int a, int b) {
        return subtractionHelper.execute(a, b);
    }

    public int sum(int a, int b) {
        return sumHelper.execute(a, b);
    }
}
