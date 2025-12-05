package lesson19.Enum;

public enum OperationEnum implements ICalculate {
    PLUS{
        @Override
        public double calculate(double a, double b) {
            return a + b;
        }
    },
    MINUS{
        @Override
        public double calculate(double a, double b) {
            return a - b;
        }
    },
    MULTIPLY{
        @Override
        public double calculate(double a, double b) {
            return a * b;
        }
    },
    DIVIDE{
        @Override
        public double calculate(double a, double b) {
            return a / b;
        }
    };


    @Override
    public double calculate(double a, double b) {
        return 0;
    }
}
