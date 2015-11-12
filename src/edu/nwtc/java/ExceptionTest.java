package edu.nwtc.java;

import java.io.IOException;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			throw new ExceptionA();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			throw new ExceptionB();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			throw new NullPointerException();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			throw new IOException();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
