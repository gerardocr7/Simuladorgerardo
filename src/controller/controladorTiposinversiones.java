package controller;

import include.Tiposinversiones;
import model.modeloTiposinversiones;



public class controladorTiposinversiones {
    public boolean insertTiposinversiones(Tiposinversiones tiposinversiones){
        modeloTiposinversiones tiposinversiones1 = new modeloTiposinversiones();
        return tiposinversiones1.insertTiposinversiones(tiposinversiones);

    }
    public static void main(String[] args){
        controladorTiposinversiones cc = new controladorTiposinversiones();
        System.out.println(cc.insertTiposinversiones(new Tiposinversiones(001, "trabajador administrativo")));

    }
}
