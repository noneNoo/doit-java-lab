package stream.others;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	// ���� Ŭ����: ���� ���� �� ���� ��ü�� ���, ������ �� �� ����
	public static void main(String[] args) throws IOException {
		
		File file = new File("./newFile.txt");
		file.createNewFile();
		
		try(FileWriter fw = new FileWriter(file)){
			
			fw.write("���̵������ͻ��̴��÷���");
			System.out.println("������ �����߽��ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileReader fr = new FileReader(file)) {
			System.out.println("������ �н��ϴ�.");
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			System.out.println();
		}catch (IOException e) {
			e.printStackTrace();
		}
		

		System.out.println();
		
		System.out.println("���� ����: " + file.isFile());
		System.out.println("������ ���丮�ΰ�? " + file.isDirectory());
		System.out.println("���ϸ�:" + file.getName());
		System.out.println("���� ������:" + file.getAbsolutePath());
		System.out.println("���� �����:" + file.getPath());
		System.out.println("������ ���� �� �ִ°�? " + file.canRead());
		System.out.println("���Ͽ� �Է��� �� �ִ°�? " + file.canWrite());
		
		file.delete();
		System.out.println("�����Ǿ����ϴ�.");
		System.out.println("���� ����: " + file.isFile());
	}

}
