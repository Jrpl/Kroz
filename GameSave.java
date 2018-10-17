import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GameSave extends MainGame
{
    public static Properties prop = new Properties();
    public void SaveGame(String point)
    {
        try
        {
            prop.setProperty("Save_Point", point);
            prop.store(new FileOutputStream("nonfig.prop"), null);
        }
        
        catch(IOException e)
        {
            
        }
    }
    
    public String LoadGame()
    {
        String line = "";
        try
        {
            prop.load(new FileInputStream ("nonfig.prop"));
            line = prop.getProperty("Save_Point");
        }
        
        catch(IOException e)
        {
           try
           {
              prop.setProperty("Save_Point", "0");
              prop.store(new FileOutputStream("nonfig.prop"), null);
             
              try
              {
                 prop.load(new FileInputStream ("nonfig.prop"));
                 line = prop.getProperty("Save_Point");
              }
              catch (Exception ex)
              {
                  
              }
           }
        
           catch(IOException ex)
           {
            
           }
        }
        return line;
    }
}