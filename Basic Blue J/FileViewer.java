import javax.swing.*;
/**
 * Write a description of class FileViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileViewer extends JFrame
{
    // instance variables - replace the example below with your own
    private JTextField txtIsiFile = new JTextField();
    private FileReader fl1 = new FileReader();

    /**
     * Constructor for objects of class FileViewer
     */
    public FileViewer()
    {
      super("File Viewer OKEH");
        setSize(500,300);
        getContentPane().add(txtIsiFile);
        try{
        txtIsiFile.setText(fl1.bF("README.TXT"));
    }catch(Exception e){e.printStackTrace();}
        setVisible(true);
        
    }
}
