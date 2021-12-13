package echo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {

		// 서버 생성
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.56.1", 10001));

		System.out.println("서버시작");
		System.out.println("============================================");

		///////////////////////////////////////////////////////////////////
		System.out.println("[연결을 기다리고 있습니다.]");

		while (true) {
			Socket socket = serverSocket.accept();

			Thread thread = new ServerThread(socket);
			thread.start();// 전화번호 전달 출장코드 회선강화3단 메시지 주고받기, 종료코드
			/*
			 * if() { break; }
			*/
		}

	}
	/*
	 * System.out.println("========================="); System.out.println("서버종료");
	 * System.out.println("========================="); serverSocket.close();
	 */

}
