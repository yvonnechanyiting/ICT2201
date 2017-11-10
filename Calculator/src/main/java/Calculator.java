public class Calculator {
  public int evaluate(String expression) {
    //Your dear was here <3
    int sum = 0;
    for (String summand: expression.split("\\+"))
      sum += Integer.valueOf(summand);
    return sum;
  }
}
