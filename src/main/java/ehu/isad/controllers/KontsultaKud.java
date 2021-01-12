package ehu.isad.controllers;


import ehu.isad.model.Webgunea;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KontsultaKud {

    private static KontsultaKud nireKontsultaKud=null;

    private KontsultaKud(){
    }

    public static KontsultaKud getNireKontsultaKud() {
        if (nireKontsultaKud==null){
            nireKontsultaKud=new KontsultaKud();
        }
        return nireKontsultaKud;
    }

        public List<Webgunea> getWebguneak() throws SQLException {
            List<Webgunea> emaitza = new ArrayList<>();
            String query= "select * from checksums";
            ResultSet rs = DBKudeatzaile.getInstantzia().execSQL(query);
            while (rs.next()){
                String version = rs.getString("version");
                String md5 = rs.getString("md5");

                Webgunea lag = new Webgunea(version,md5);
                emaitza.add(lag);
            }
            return emaitza;
        }

    }


