/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientdatabase.DAL;

/**
 *
 * @author jeppjleemoritzled
 */
public class DALManager
{
    private static DALManager instance = null;
    
    public static DALManager getInstance()
    {
        if(instance == null)
        {
            instance = new DALManager();
        }
        
        return instance;
    }
    
    private DALManager()
    {
    }
}
