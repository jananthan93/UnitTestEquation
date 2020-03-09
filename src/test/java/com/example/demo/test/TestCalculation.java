package com.example.demo.test;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import com.example.demo.model.Calculation;
import com.example.demo.model.Equation;
import com.example.demo.model.ParameterResult;

public class TestCalculation {
	Calculation calculate = new Calculation();

	@Test
	public void testAddNumbers() {
		assertEquals(13, calculate.addNumbers(8, 5));
	}

	@Test
	public void testcalculateEquation() {
		assertEquals(921.19, calculate.calculateResult(205.2, 25.1,25),0.01);
	}
	@Test
	public void testcalculateTestResult() {
		ParameterResult paremeterResult1 =new ParameterResult(1L, "A", 80.5);
		ParameterResult paremeterResult2 =new ParameterResult(2L, "B", 25.2);
		ParameterResult paremeterResult3 =new ParameterResult(3L, "C", 40.4);
		ParameterResult paremeterResult4 =new ParameterResult(4L, "D", 5.2);
		List<ParameterResult> resultList = new ArrayList<ParameterResult>();
		resultList.add(paremeterResult1);
		resultList.add(paremeterResult2);
		resultList.add(paremeterResult3);
		resultList.add(paremeterResult4);
		Equation eqution =new Equation("(A+B)/(C+D)");
		assertEquals(2.317982, calculate.calculateTestResult(resultList, eqution),0.000001);
	}
	
}
