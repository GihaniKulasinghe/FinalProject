/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectnew;

/**
 *
 * @author Gihani Kulasinghe
 */
public class LoadingClass {
    
    public static void main(String[] args)

    {
        LoadingForm ld = new LoadingForm();
        ld.setVisible(true);
        
        try
        {
            for(int x = 0; x<=100; x++ )
                
            {
                Thread.sleep(200);
                LoadingForm.lblperc.setText(Integer.toString(x)+"%");
                LoadingForm.ProgressBar.setValue(x);
            }
            ld.dispose();
            PasswordForm ls= new PasswordForm(); 
            ls.setVisible(true);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
