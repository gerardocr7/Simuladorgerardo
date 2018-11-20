package controller;

import include.TipoUsuario;
import model.modeloTipoUsuario;

public class controladorTipoUsuario {
    public boolean insertTipoUsuario(TipoUsuario tipousuario){
        modeloTipoUsuario tipousuario1 = new modeloTipoUsuario();
        return tipousuario1.insertTipoUsuario(tipousuario);
    }
    public static void  main(String[] args){
        controladorTipoUsuario cc = new controladorTipoUsuario();
        System.out.println(cc.insertTipoUsuario(new TipoUsuario(001, "Gerardito", 001)));
    }
}

