/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheila;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sheila
 */
public class GestorContacto {
    
    private VentanaPrincipal vp = null;
    
    private List<Contacto> contactos = new ArrayList<>();
    
    public void nuevoContacto(Contacto c){
        contactos.add(c);
        
    
    }

    /**
     * @return the vp
     */
    public VentanaPrincipal getVp() {
        return vp;
    }

    /**
     * @param vp the vp to set
     */
    public void setVp(VentanaPrincipal vp) {
        this.vp = vp;
    }
    
    
    
}
