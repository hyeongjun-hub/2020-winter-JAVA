package KioskAll;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

import javax.swing.JFrame;

public class MemberJoinList extends JFrame {

	ArrayList<MemberSet> members = new ArrayList<>();
	int accumpoint = 0;

	public MemberJoinList() {
		try {
			File file = new File("src/KioskAll/example.txt");
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			while ((line = bufReader.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) {
					members.add(new MemberSet(st.nextToken(), st.nextToken(), st.nextToken()));
				}

			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}

	}

	public int getSum() {
		try {
			File file = new File("src/KioskAll/point.txt");
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			while ((line = bufReader.readLine()) != null) {
				accumpoint = Integer.parseInt(line);
			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
		return accumpoint;
	}

	public void SelectMember() {
		Iterator<MemberSet> ite = members.iterator();

		while (ite.hasNext()) {
			System.out.println(ite.next() + " ");
		}

	}

	public boolean idCheck(String id) {
		boolean check = true;
		MemberSet member = FindById(id);
		if (member == null)
			check = false;
		return check;
	}

	public MemberSet FindById(String id) {
		for (MemberSet memberSet : members) {
			if (memberSet.getID().equals(id)) {
				return memberSet;
			}
		}
		return null;
	}

}
