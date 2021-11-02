package KioskAll;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JFrame;

public class ListClass extends JFrame {

	ArrayList<String> price_burger = new ArrayList<>();
	ArrayList<String> name_burger = new ArrayList<>();

	ArrayList<String> price_drink = new ArrayList<>();
	ArrayList<String> name_drink = new ArrayList<>();

	ArrayList<String> price_side = new ArrayList<>();
	ArrayList<String> name_side = new ArrayList<>();

	ArrayList<String> price_set = new ArrayList<>();
	ArrayList<String> name_set = new ArrayList<>();

	int sum = 0;

	public ListClass() {

		try {
			Scanner scanner = new Scanner(new FileReader("src/KioskAll/burger.txt"));

			while (scanner.hasNext()) { // hasNext : ������ ��
				String word = scanner.nextLine();

				StringTokenizer st = new StringTokenizer(word, " ");
				name_burger.add(st.nextToken());
				price_burger.add(st.nextToken());

			}
		} catch (IOException e) {
			System.out.println("����� ����");
		}

//---------burger--------------         

		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(new FileInputStream("src/KioskAll/drink.txt"), "utf-8"));
			String line = "";
			while ((line = reader.readLine()) != null) { // hasNext : ������ ��

				StringTokenizer st = new StringTokenizer(line, " ");
				name_drink.add(st.nextToken());
				price_drink.add(st.nextToken());
			}

		} catch (IOException e) {
			System.out.println("����� ����");
		}
//--------------------drink-------------------      
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(new FileInputStream("src/KioskAll/side.txt"), "utf-8"));
			String line = "";
			while ((line = reader.readLine()) != null) { // hasNext : ������ ��

				StringTokenizer st = new StringTokenizer(line, " ");
				name_side.add(st.nextToken());
				price_side.add(st.nextToken());
			}

		} catch (IOException e) {
			System.out.println("����� ����");
		}
//-----------------side-----------------
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(new FileInputStream("src/KioskAll/set.txt"), "utf-8"));
			String line = "";
			while ((line = reader.readLine()) != null) { // hasNext : ������ ��

				StringTokenizer st = new StringTokenizer(line, " ");
				name_set.add(st.nextToken());
				price_set.add(st.nextToken());
			}

		} catch (IOException e) {
			System.out.println("����� ����");
		}
	}
}
