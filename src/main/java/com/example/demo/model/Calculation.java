package com.example.demo.model;

import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculation {
	public int addNumbers(int i,int j) {
		return (i+j);
	}
	public double calculateResult(double a,double b,double c) {
		 ScriptEngineManager mgr = new ScriptEngineManager();
		    ScriptEngine engine = mgr.getEngineByName("JavaScript");
		    engine.put("a", a);
		    engine.put("b", b);
		    engine.put("c", c);
		    String foo = "((a+b)/c)*100";
		    double res=0;
		    try {
		    	res= (double) engine.eval(foo);
				System.out.println(res);
			} catch (ScriptException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("exception");
			}
		    return res ;
		  }
	
	public double calculateTestResult(List<ParameterResult> paramResults,Equation equation) {
		 ScriptEngineManager mgr = new ScriptEngineManager();
		    ScriptEngine engine = mgr.getEngineByName("JavaScript");
		    paramResults.forEach(paramObj->{
		    	 engine.put(paramObj.getAbbrebiation(),paramObj.getValue());
		    });
		    String foo = equation.getFormula();
		    double res=0;
		    try {
		    	res= (double) engine.eval(foo);
				System.out.println(res);
			} catch (ScriptException e) {
				e.printStackTrace();
				System.out.println("exception");
			}
		    return res ;
		  }
}
