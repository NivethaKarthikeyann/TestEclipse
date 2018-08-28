import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Properties;

public class pro {
  public static void main(String[] args) {

    Properties prop = new Properties();
    String input;
	FileOutputStream out = null;
    try {

        input = "E:/properties/log1.properties";

        // load a properties file
        prop.load(new FileInputStream(input));
prop.list(System.out);
        // get the property value and print it out
       
		
		out = new FileOutputStream(input);
		//FileOutputStream f=new FileOutputStream("E:/properties/log1.properties");
		prop.put("log.file.path.directory", "directory");
		prop.put("log2.file.path.directory", "directory");
prop.store(out,"hi");

	//	writer.store(out, "filepath at " + new Date());

		/*writer.put("log.file.name.prefix", log.getLogFilePrefix());
		writer.put("log.file.count", log.getLogFileCount());
		writer.put("log.file.size", log.getLogFileSize());*/
		//writer.put("log.file.level", log.getLogLevel());

    } catch (IOException ex) {
        ex.printStackTrace();
    } 

  }
}
