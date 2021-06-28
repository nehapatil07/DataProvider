package DataProvider;
import java.io.FileOutputStream;
import java.util.Properties;
public class CreateXmlFile {
public static void main(String[] args) {
	Properties prop=new Properties();
	prop.put("browser", "Chrome");
	prop.put("username", "kiran@gmail.com");
	prop.put("password", "123456");
	
	try {
		FileOutputStream fos=new FileOutputStream("E:\\workspace3\\DataProvider\\LogIndata.xml");
		prop.storeToXML(fos, "Key-value pair of log in data");
	} catch ( Exception e) {
		e.printStackTrace();
	}
}
}
