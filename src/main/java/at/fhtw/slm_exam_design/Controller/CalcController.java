package at.fhtw.slm_exam_design.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @GetMapping("/circle/{num}")
    double calcCircleArea(@PathVariable double num) {
        return (num * num) * 3.14159265359;
    }

}
