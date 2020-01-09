package com.jbk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class cls =A.class;
		A a =new A();
		
		Method methods[]=cls.getDeclaredMethods();
		
		for(Method meth:methods) {
			System.out.println(meth.getName());
			
			meth.invoke(a, null);
		}
	}

}
