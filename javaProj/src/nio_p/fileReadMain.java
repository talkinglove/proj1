package nio_p;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class fileReadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Path path = Paths.get("fff/nio.txt");
		
		FileChannel fcw = FileChannel.open(
				path,
				StandardOpenOption.READ
				);				
				
		String data = "�ɷ��ɷ�";
		
		Charset charset = Charset.defaultCharset();
		ByteBuffer buf = charset.encode(data);
		
		System.out.println("�����ͷ�:"+fcw.write(buf));
		
		fcw.close();
		
		
	}

}
