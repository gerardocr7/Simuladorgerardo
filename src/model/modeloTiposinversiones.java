package model;

import include.Tiposinversiones;

import java.sql.PreparedStatement;

public class modeloTiposinversiones extends conexion {
     public boolean insertTiposinversiones (Tiposinversiones tiposinversiones){
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta ="INSERT INTO tiposinversiones (idtiposInversiones, concepto)VALUES (?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1,tiposinversiones.getIdtiposInversiones());
            pst.setString(2,tiposinversiones.getConcepto());

            if (pst.executeUpdate()== 1) {
                flag = true;

            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            try {
                if (getConection() !=null) getConection().close();
                if (pst !=null) pst.close();
            }catch (Exception e){


            }
            return flag;
        }
    }


}
