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
			// ���� ��ü ����
			File file = new File("C:\\Users\\������\\OneDrive\\���� ȭ��\\������\\burger.txt");
			// �Է� ��Ʈ�� ����
			FileReader filereader = new FileReader(file);
			// �Է� ���� ����
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = ""; // line �ʱ�ȭ
			int k = 0;

			while ((line = bufReader.readLine()) != null) {
				burger_List.add(line); // burger �迭�� text �� ���� �߰� -> ���� �߰���
				System.out.print(burger_List.toString()); // �迭 ���·� burger print
				System.out.print("\n");
				k++;

				StringTokenizer st = new StringTokenizer(line, " ");

			}
			// .reaLine()�� �P�� ���๮�ڸ� ���� �ʴ´�.
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
