package model;

import include.TipoUsuario;

import java.sql.PreparedStatement;

public class modeloTipoUsuario extends conexion {
    public boolean insertTipoUsuario (TipoUsuario tipousuario){
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta ="INSERT INTO tipousuario (idtipoUsuario, nombre, no_empresas)VALUES (?,?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1,tipousuario.getIdtipoUsuario());
            pst.setString(2,tipousuario.getNombre());
            pst.setInt(3,tipousuario.getNo_empresas());

            if (pst.executeUpdate()== 1){
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
