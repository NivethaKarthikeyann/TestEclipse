import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class cfdr {
	 JFrame f;    
	    cfdr() throws IOException{    
	    f=new JFrame();    
        String line = null;
        DefaultTableModel model = new DefaultTableModel();
        JTable jt=new JTable(model);    
Vector v=new Vector();
        model.addColumn("Statename");
        model.addColumn("Key");
        model.addColumn("Value");
        
	    String filePath = "E:\\Json\\Filecheck\\VA_jvmn_GCFPARRRPMNIORPOIUSUEIUPB55511.cfd";
	    File file = new File(filePath);
	    try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            while ((line = br.readLine()) != null) 
            {
                StringTokenizer st1 = new StringTokenizer(line, "=");
                String[] dataRow1=line.split("=");
                model.addRow(dataRow1);


                while (st1.hasMoreTokens()) 
                {
                    String nextToken = st1.nextToken();
                
                     String p=nextToken;
                     System.out.println(p);
                    StringTokenizer st2 = new StringTokenizer(p, "|");

                    if(p.contains("|"))
                    {    while (st2.hasMoreTokens()) 
                        {
                    	String nextToken1 = st2.nextToken();
                
                        System.out.println("pp"+nextToken1);
                        v.add(nextToken1);
                     
                     
                        
                         }
                    }
                    


                }
                model.addRow(v);

                System.out.println(".................................");
            }

            br.close();
            jt.setBounds(30,40,200,300);          
            JScrollPane sp=new JScrollPane(jt);    
            f.add(sp);          
            f.setSize(300,400);    
            f.setVisible(true);    

        } catch (Exception e) {
            e.printStackTrace();
        }   
	       
	}     
	public static void main(String[] args) throws IOException {    
	    new cfdr();    
	}    
	}  