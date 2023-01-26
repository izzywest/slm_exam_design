package at.fhtw.slm_exam_design.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @GetMapping("/circle/{num}")
    public String calcCircleArea(@PathVariable double num) {
        double result = (num * num) * 3.14159265359;
        return String.format("%.2f",result);
    }

    @GetMapping("/square/{num}")
    public String calcSquareArea(@PathVariable double num) {
        double result = num * num;
        return String.format("%.2f",result);
    }

}

