
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;

public class PropConnect
{
	
    public static void main(String[] args)throws Exception
    {
    	//File myFile = new File("/root1/user/bin/cxiETL/log/CXi-Admin-log", "cxiadmin.log").getAbsoluteFile();
        //System.out.println(myFile);
        /*myFile = new File(File.separator + File.separator + "192.168.1.108" + "/C$"+File.separator + "root"
            + File.separator + "user" + File.separator + "bin" + File.separator + "cxiETL"
            + File.separator + "properties" + File.separator + "/databaseinfo.properties").getAbsoluteFile();
        */
       File myFile=new File("//192.168.1.108/c$/root/user/bin/cxiETL/properties/log.properties");
       // System.out.println("TO URL"+myFile.toURL());
        System.out.println("FILE"+myFile);
        System.out.print(File.pathSeparatorChar);
        Process p = Runtime.getRuntime().exec("explorer.exe "+myFile);
     
    }
}