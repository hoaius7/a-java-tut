package chapter04.threadexecutors02return;

import java.util.concurrent.Callable;

/**
 * This class calculates the factorial of a number. It can be executed in an executor because it
 * implements de Callable interface. The call method() will return an Interger
 */
public class FactorialCalculator implements Callable<Integer> {

  private final Integer number;

  public FactorialCalculator(Integer number) {
    this.number = number;
  }

  @Override
  public Integer call() throws Exception {
    int num, result;

    num = number.intValue();
    result = 1;

    if (num == 0 || num == 1) {
      result = 1;
    } else {
      for (int i = 2; i <= number; i++) {
        result *= i;
        Thread.sleep(20);
      }
    }
    
    System.out.printf("%s: %d\n", Thread.currentThread().getName(), result);
    
    return result;
  }
}
