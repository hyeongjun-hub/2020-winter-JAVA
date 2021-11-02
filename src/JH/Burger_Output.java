package JH;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Burger_Output {
	static ArrayList<String> name_burger = new ArrayList<String>();
	static ArrayList<Integer> price_burger = new ArrayList<Integer>(); // 00, 01, 02, ...
	static ArrayList<String> burger_List = new ArrayList<String>();

	public static void outputText() {

		try {
			// 파일 객체 생성
			File file = new File("C:\\Users\\조형준\\OneDrive\\바탕 화면\\이주희\\burger.txt");
			// 입력 스트림 생성
			FileReader filereader = new FileReader(file);
			// 입력 버퍼 생성
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = ""; // line 초기화
			int k = 0;

			while ((line = bufReader.readLine()) != null) {
				burger_List.add(line); // burger 배열에 text 줄 별로 추가 -> 끝에 추가됨
				System.out.print(burger_List.toString()); // 배열 형태로 burger print
				System.out.print("\n");
				k++;

				StringTokenizer st = new StringTokenizer(line, " ");

			}
			// .reaLine()은 긑에 개행문자를 읽지 않는다.
			bufReader.close();

		} catch (FileNotFoundException e) {

		} catch (IOException e) {
			System.out.print(e);
		}
	}

	public static void main(String[] args) {

		outputText();

	}
}
