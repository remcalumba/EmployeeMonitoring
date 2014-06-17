/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cim.rdc.dev.services;

import cim.rdc.dev.form.LoginForm;
import javax.swing.JFrame;

/**
 *
 * @author fftmpc
 */
public class EMSService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       JFrame login= new LoginForm();
       login.setTitle("Log In");
       login.setVisible(true);
       
    }
    
}
