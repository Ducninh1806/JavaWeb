public class Calculator {
    public static float calculate(float firstOperand, float secondOperand,char operator){
        switch (operator){
            case '+':
                return firstOperand+secondOperand;
            case '-':
                return firstOperand-secondOperand;
            case '*':
                return firstOperand*secondOperand;
            case '/':
                if (secondOperand!=0){
                    return firstOperand/secondOperand;
                }
                else {
                    throw new RuntimeException("Can't divide by rezo");
                }
            default:
                throw  new RuntimeException("invalid operator");


        }
    }


}
