public class Calculator {
  public int evaluate(String expression) {
    //hello yiting
    int sum = 0;
    for (String summand: expression.split("\\+"))
      sum += Integer.valueOf(summand);
    return sum;
  }
}
