package com.example.demo.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.example.demo.model.Calculation;
import com.example.demo.model.Equation;
import com.example.demo.model.ParameterResult;

public class TestMaterial {
	Calculation calculate = new Calculation();
	@Test
	public void test75MicronTestTrial1() {
		ParameterResult paremeterResult1 =new ParameterResult(1L,"Weight of the oven dried sample with pan before washing (g)", "C", 744.0);
		ParameterResult paremeterResult2 =new ParameterResult(2L,"Weight of the Pan (g)", "D", 244.0);
		ParameterResult paremeterResult3 =new ParameterResult(3L,"Weight of the oven dried sample before washing  (g)", "A", 500.0);
		ParameterResult paremeterResult4 =new ParameterResult(4L,"Weight of the oven dried sample with pan After washing (g)", "E", 713.2);
		ParameterResult paremeterResult5 =new ParameterResult(5L,"Weight of the oven dried sample  After washing    (g)", "B", 469.2);
		List<ParameterResult> resultList = new ArrayList<ParameterResult>();
		
		resultList.add(paremeterResult1);
		resultList.add(paremeterResult2);
		resultList.add(paremeterResult3);
		resultList.add(paremeterResult4);
		resultList.add(paremeterResult5);
		Equation eqution1 =new Equation("(A-B)*100/A");
		Equation eqution2 =new Equation("((C-D)-(E-D))*100/(C-D)");
		assertEquals(6.2, calculate.calculateTestResult(resultList, eqution1),0.1);
		assertEquals(6.2, calculate.calculateTestResult(resultList, eqution2),0.1);
	}
	@Test
	public void test75MicronTestTrial2() {
		ParameterResult paremeterResult1 =new ParameterResult(1L,"Weight of the oven dried sample with pan before washing (g)", "C", 744.0);
		ParameterResult paremeterResult2 =new ParameterResult(2L,"Weight of the Pan (g)", "D", 244.0);
		ParameterResult paremeterResult3 =new ParameterResult(3L,"Weight of the oven dried sample before washing  (g)", "A", 500.0);
		ParameterResult paremeterResult4 =new ParameterResult(4L,"Weight of the oven dried sample with pan After washing (g)", "E", 708.8);
		ParameterResult paremeterResult5 =new ParameterResult(5L,"Weight of the oven dried sample  After washing    (g)", "B", 464.8);
		List<ParameterResult> resultList = new ArrayList<ParameterResult>();
		resultList.add(paremeterResult1);
		resultList.add(paremeterResult2);
		resultList.add(paremeterResult3);
		resultList.add(paremeterResult4);
		resultList.add(paremeterResult5);
		Equation eqution1 =new Equation("(A-B)*100/A");
		Equation eqution2 =new Equation("((C-D)-(E-D))*100/(C-D)");
		assertEquals(7.0, calculate.calculateTestResult(resultList, eqution1),0.1);
		assertEquals(7.0, calculate.calculateTestResult(resultList, eqution2),0.1);
	}
	@Test
	public void test75MicronTestTrial3() {
		ParameterResult paremeterResult1 =new ParameterResult(1L,"Weight of the oven dried sample with pan before washing (g)", "C", 744.0);
		ParameterResult paremeterResult2 =new ParameterResult(2L,"Weight of the Pan (g)", "D", 244.0);
		ParameterResult paremeterResult3 =new ParameterResult(3L,"Weight of the oven dried sample before washing  (g)", "A", 500.0);
		ParameterResult paremeterResult4 =new ParameterResult(4L,"Weight of the oven dried sample with pan After washing (g)", "E", 710.3);
		ParameterResult paremeterResult5 =new ParameterResult(5L,"Weight of the oven dried sample  After washing    (g)", "B", 466.3);
		List<ParameterResult> resultList = new ArrayList<ParameterResult>();
		resultList.add(paremeterResult1);
		resultList.add(paremeterResult2);
		resultList.add(paremeterResult3);
		resultList.add(paremeterResult4);
		resultList.add(paremeterResult5);
		Equation eqution1 =new Equation("(A-B)*100/A");
		Equation eqution2 =new Equation("((C-D)-(E-D))*100/(C-D)");
		assertEquals(6.7, calculate.calculateTestResult(resultList, eqution1),0.1);
		assertEquals(6.7, calculate.calculateTestResult(resultList, eqution2),0.1);
	}
}
