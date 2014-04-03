package edu.io.p1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;

class WriteReversedThread extends Thread {
	PrintStream ps;
	DataInputStream dis;

	WriteReversedThread(PrintStream ps, DataInputStream dis) {
		this.ps = ps;
		this.dis = dis;
	}

	public void run() {
		if (ps != null && dis != null) {
			try {
				String input;
				while ((input = dis.readLine()) != null) {
					ps.println(reverseIt(input));
					ps.flush();
				}
				ps.close();
			} catch (IOException e) {
				System.out.println("WriteReversedThread run: " + e);
			}
		}
	}

	protected void finalize() {
		try {
			if (ps != null) {
				ps.close();
				ps = null;
			}
			if (dis != null) {
				dis.close();
				dis = null;
			}
		} catch (IOException e) {
			System.out.println("WriteReversedThread finalize: " + e);
		}
	}

	private String reverseIt(String source) {
		int i, len = source.length();
		StringBuffer dest = new StringBuffer(len);

		for (i = (len - 1); i >= 0; i--) {
			dest.append(source.charAt(i));
		}
		return dest.toString();
	}
}