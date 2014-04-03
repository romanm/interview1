package edu.socket1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * @author roman
 * @see http://www.quizful.net/post/java-socket-programming
 */
public class Server {
	public static void main(String[] ar)    {
		int port = 6666; // случайный порт (может быть любое число от 1025 до 65535)
		try {
			// создаем сокет сервера и привязываем его к вышеуказанному порту
			ServerSocket ss = new ServerSocket(port); 
			System.out.println("Waiting for a client...");

			// заставляем сервер ждать подключений и выводим сообщение когда кто-то связался с сервером
			Socket socket = ss.accept(); 
			System.out.println("Got a client :) ... Finally, someone saw me through all the cover!");
			System.out.println();

			// Берем входной и выходной потоки сокета, теперь можем получать и отсылать данные клиенту. 
			InputStream sin = socket.getInputStream();
			OutputStream sout = socket.getOutputStream();

			// Конвертируем потоки в другой тип, чтоб легче обрабатывать текстовые сообщения.
			DataInputStream in = new DataInputStream(sin);
			DataOutputStream out = new DataOutputStream(sout);

			String line = null;
			while(true) {
				// ожидаем пока клиент пришлет строку текста.
				line = in.readUTF(); 
				System.out.println("The dumb client just sent me this line : " + line);
				System.out.println("I'm sending it back...");
				// отсылаем клиенту обратно ту самую строку текста.
				out.writeUTF(line); 
				// заставляем поток закончить передачу данных.
				out.flush(); 
				System.out.println("Waiting for the next line...");
				System.out.println();
			}
		} catch(Exception x) { x.printStackTrace(); }
	}
}