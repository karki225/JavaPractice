import java.io.FileOutputStream;

public class consoletofiledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("to stop reading from console type");
		int k;
		FileOutputStream fos = new FileOutputStream("pqr.txt");
		while(k=System.in.read())!='@'){
			fos.write(k);
		}
		System.out.println("Writtig completed";)
	}

}
