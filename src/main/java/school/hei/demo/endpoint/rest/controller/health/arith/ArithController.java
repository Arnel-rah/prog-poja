package school.hei.demo.endpoint.rest.controller.health.arith;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import school.hei.demo.service.ArithService;

@RestController
public class ArithController {
  private final ArithService arithService;

  public ArithController(ArithService arithService) {
    this.arithService = arithService;
  }

  @GetMapping("/add")
  public int add(@RequestParam int a, @RequestParam int b) {
    return arithService.add(a, b);
  }

  @GetMapping("/multi")
  public int multi(@RequestParam int a, @RequestParam int b) {
    return arithService.mul(a, b);
  }

  @GetMapping("/sub")
  public int sub(@RequestParam int a, @RequestParam int b) {
    return arithService.sub(a, b);
  }

  @GetMapping("/divide")
  public int divide(@RequestParam int a, @RequestParam int b) {
    return arithService.div(a, b);
  }
}
