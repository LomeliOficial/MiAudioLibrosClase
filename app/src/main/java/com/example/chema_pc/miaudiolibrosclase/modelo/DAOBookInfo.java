package com.example.chema_pc.miaudiolibrosclase.modelo;

import com.example.chema_pc.miaudiolibrosclase.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chema-pc on 15/09/2016.
 */
public class DAOBookInfo {
    //Regresa una lista de objectos BookInfo
    public static List<BookInfo> getAllBooks(){
        List<BookInfo> resul = new ArrayList<BookInfo>();

        BookInfo item = new BookInfo
                ("Kappa","Akutagawa",R.drawable.kappa,"http://www.leemp3.com/leemp3/1/Kappa_akutagawa.mp3");
        resul.add(item);

        item = new BookInfo("Avecilla","Alas Clarín, Leopoldo",R.drawable.avecilla,"http://www.leemp3.com/leemp3/Avecilla_alas.mp3");
        resul.add(item);

        item = new BookInfo("Divina Comedia","Dante",R.drawable.divinacomedia, "http://www.leemp3.com/leemp3/8/Divina%20Comedia_alighier.mp3");
        resul.add(item);

        item = new BookInfo("Viejo Pancho, El","Alonso y Trelles, josé",R.drawable.viejo_pancho, "http://www.leemp3.com/leemp3/1/viejo_pancho_trelles.mp3");
        resul.add(item);

        item = new BookInfo("Cancion de Rolando","Anonimo",R.drawable.cancion_rolando,"http://www.leemp3.com/leemp3/1/Cancion%20de%20Rolando_anonimomp3");
        resul.add(item);

        item = new BookInfo("Cancion de Rolando","Anonimo",R.drawable.cancion_rolando,"http://www.leemp3.com/leemp3/1/Cancion%20de%20Rolando_anonimomp3");
        resul.add(item);

        item = new BookInfo("La iliada","Homero",R.drawable.iliada, "http://www.dcomg.upv.es/~jtomas/android/audiolibros/la-iliada-homero184950.mp3");
        resul.add(item);

        return resul;
    }
}
