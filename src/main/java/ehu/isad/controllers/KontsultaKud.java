package ehu.isad.controllers;


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

}
