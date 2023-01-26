package at.fhtw.slm_exam_design;

import at.fhtw.slm_exam_design.Controller.CalcController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SlmExamDesignApplicationTests {

	@Test
	void calcSquareArea() {

		// Given
		CalcController controller = new CalcController();

		// When
		double result = Double.parseDouble(String.valueOf(controller.calcSquareArea(3)));

		// Then
		assertEquals(result, 9);

	}

	@Test
	void calcCircleArea() {

		// Given
		CalcController controller = new CalcController();

		// When
		String result = String.valueOf(Double.parseDouble(String.valueOf(controller.calcCircleArea(3))));

		// Then
		assertEquals(result, "28.27");

	}

}
