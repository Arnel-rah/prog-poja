package school.hei.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ArithService {
  public int add(int a, int b) {
    return a + b;
  }

  public int sub(int a, int b) {
    return a - b;
  }

  public int mul(int a, int b) {
    return a * b;
  }

  public int div(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException();
    }

    if (a == 0) {
      return 0;
    }

    return a / b;
  }
}
