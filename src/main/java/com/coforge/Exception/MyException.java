package com.coforge.Exception;

public class MyException extends Exception {
public MyException(String s) {
	// TODO Auto-generated constructor stub
System.out.println(s);
}

@Override
public String toString() {
	return "UserDefineException []";
}

}
