package school.hei.demo.endpoint.rest.controller.health.arith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import school.hei.demo.service.ArithService;

@ExtendWith(MockitoExtension.class)
class ArithServiceTest {

  @InjectMocks private ArithService arithService;

  @Test
  void shouldAddPositiveNumbers() {
    int a = 5;
    int b = 3;

    int result = arithService.add(a, b);

    assertEquals(8, result);
  }

  @Test
  void shouldAddNegativeNumbers() {
    assertEquals(-2, arithService.add(-5, 3));
    assertEquals(-8, arithService.add(-5, -3));
  }

  @Test
  void shouldSubtractTwoNumbers() {
    assertEquals(7, arithService.sub(10, 3));
    assertEquals(-8, arithService.sub(2, 10));
  }

  @Test
  void shouldMultiplyTwoNumbers() {
    assertEquals(20, arithService.mul(4, 5));
    assertEquals(0, arithService.mul(10, 0));
    assertEquals(-12, arithService.mul(-3, 4));
  }

  @Test
  void shouldDividePositiveNumbers() {
    assertEquals(5, arithService.div(20, 4));
    assertEquals(4, arithService.div(20, 5));
  }

  @Test
  void shouldReturnZeroWhenNumeratorIsZero() {
    assertEquals(0, arithService.div(0, 5));
    assertEquals(0, arithService.div(0, -7));
  }

  @Test
  void shouldThrowExceptionWhenDivideByZero() {
    assertThrows(ArithmeticException.class, () -> arithService.div(10, 0));
    assertThrows(ArithmeticException.class, () -> arithService.div(-5, 0));
    assertThrows(ArithmeticException.class, () -> arithService.div(0, 0));
  }
}
