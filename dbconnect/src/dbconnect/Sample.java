package dbconnect;
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
import javax.swing.table.*; 
public class Sample extends JApplet 
{ 
    Object[] Dt= new Object[5]; 
    DefaultTableModel DfltTblModl = new DefaultTableModel(); 
    JTable Tbl = new JTable(DfltTblModl); 
    public void init() 
      { 
        for(int Clmn = 0; Clmn < 5; Clmn++) 
           { 
              DfltTblModl.addColumn("Column " +Clmn); 
           } 
              for(int row = 0; row < 5; row++) 
             { 
                     for(int Clmn = 0; Clmn < 5; Clmn++) 
                     { 
                              Dt[Clmn] = "Cell " + row + "," + Clmn; 
                         } 
                              DfltTblModl.addRow(Dt); 
                 } 
                      //jtable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS); 
                       getContentPane().add(new JScrollPane(Tbl), BorderLayout.CENTER); 
                       getContentPane().add(new jpanel(), BorderLayout.SOUTH); 
         } 
                       class jpanel extends JPanel implements ActionListener 
                         { 
                              private JButton BtnCrtRow = new JButton("Create new row"), 
                              BtnCrtClmn = new JButton("Create new column"); 
                             public jpanel() 
                               { 
                                  add(BtnCrtRow); 
                                  add(BtnCrtClmn); 
                                   BtnCrtRow.addActionListener(this); 
                                  BtnCrtClmn.addActionListener(this); 
                              } 
                                  public void actionPerformed(ActionEvent e1) 
                                  { 
                                       if(e1.getSource() == BtnCrtRow) 
                                { 
                                                int NmbrRows = DfltTblModl.getRowCount(); 
                                                int NmbrClmn = DfltTblModl.getColumnCount(); 
                                               Object[] data = new Object[NmbrClmn]; 
                                               for(int Clmn = 0; Clmn < NmbrClmn; Clmn++) 
                                     { 
                                                      Dt[Clmn] = "Cell " + NmbrRows + "," + Clmn; 
                                                 } 
                                                      DfltTblModl.addRow(Dt); 
                                        } 
                                          else if(e1.getSource() == BtnCrtClmn) 
                                               { 
                                                               int NmbrRows = DfltTblModl.getRowCount(); 
                                                               int NmbrClmn = DfltTblModl.getColumnCount(); 
                                                               DfltTblModl.addColumn("Column " + NmbrClmn);
                                                               for(int row = 0; row < NmbrRows; row++) 
                                                  { 
                                                                      DfltTblModl.setValueAt("Cell " + row + "," +NmbrClmn, row,NmbrRows); 
                                                                  } 
                                                                      Tbl.sizeColumnsToFit(0); 
                                                           } 
                                 } 
                        } 
  } 