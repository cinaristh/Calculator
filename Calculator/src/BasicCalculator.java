    public class BasicCalculator {

        private double num1;
        private double num2;
        private String operation;

        //constructor
        public BasicCalculator(){
            num1 = 0;
            num2 = 0;
            operation = "";
        }

        public double add(double firstNumber, double secondNumber){
            num1 = firstNumber;
            num2 = secondNumber;
            double result = firstNumber + secondNumber ;
            return result;

        }

        public double subtract(double firstNumber, double secondNumber){
            num1 = firstNumber;
            num2 = secondNumber;
            double result = firstNumber - secondNumber ;
            return result;

        }

        public double times(double firstNumber, double secondNumber){
            num1 = firstNumber;
            num2 = secondNumber;
            double result = firstNumber * secondNumber ;
            return result;

        }

        public double dividedBy(double firstNumber, double secondNumber){
            num1 = firstNumber;
            num2 = secondNumber;
            double result = firstNumber / secondNumber ;
            return result;

        }

    }
