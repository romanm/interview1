package edu.io.p3;

import java.io.Console;

public class SysConsole {
	public static void main(String[] args) {
		System.out.println("---");
		Console cons;
		char[] passwd;
		if ((cons = System.console()) != null &&
				(passwd = cons.readPassword("[%s]", "Password:")) != null) {
//			java.util.Arrays.fill(passwd, ' ');
			System.out.println(passwd);
		}
	}
}
