    import java.util.Locale;  
    import java.util.ResourceBundle;  
    public class res {  
     public static void main(String[] args) {  
      
      ResourceBundle bundle = ResourceBundle.getBundle("message", Locale.KOREAN);  
      System.out.println("Message in "+Locale.US +":"+bundle.getString("how_are_you"));  
      
      //changing the default locale to indonasian   
      Locale.setDefault(new Locale("en", "IN"));  
      bundle = ResourceBundle.getBundle("message");  
      System.out.println("Message in "+Locale.getDefault()+":"+bundle.getString("how_are_you"));  
      
     }  
    }  