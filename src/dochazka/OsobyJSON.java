/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dochazka;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ml
 */
public class OsobyJSON {

    private static final String filePath = "src/dochazka/osoba.json";
    private Osoba[] osoby;

    public OsobyJSON() {
        try {
            // read the json file
            FileReader reader = new FileReader(filePath);
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(Osoba.class, new OsobaDeserializer());
            gsonBuilder.registerTypeAdapter(Udalost.class, new UdalostDeserializer());
            Gson gson = gsonBuilder.create();
            //Gson gson = new Gson();
            osoby = gson.fromJson(reader, Osoba[].class);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Soubor nebyl načten!", "Chyba", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Osoba getOsoba(int index) {
        return this.osoby[index];
    }

    public Osoba seekPrijmeni(String prijmeni) {
        int i = 0;
        while ((!this.osoby[i].getPrijmeni().equals(prijmeni.toString())) && (i < this.osoby.length - 1)) {
            i++;
        }
        if (i < this.osoby.length) {
            return this.osoby[i];
        } else {
            return null;
        }
    }

    private class OsobaDeserializer implements JsonDeserializer<Osoba> {

        @Override
        public Osoba deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
                throws JsonParseException {
            final JsonObject jsonObject = json.getAsJsonObject();
            final String prijmeni = jsonObject.get("prijmeni").getAsString();
            final String jmeno = jsonObject.get("jmeno").getAsString();
            RodneCislo rc = context.deserialize(jsonObject.get("rodnecislo"), RodneCislo.class);
            Udalost[] udalosti = context.deserialize(jsonObject.get("udalost"), Udalost[].class); 
            Osoba o = new Osoba(jmeno, prijmeni, rc.getRC());
            o.setUdalosti(udalosti);
            return o;
        }
    }

    private class UdalostDeserializer implements JsonDeserializer {

        @Override
        public Udalost deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context)
                throws JsonParseException {
            final JsonObject jsonObject = json.getAsJsonObject();

            final Udalost udalost = new Udalost();
            try {
                udalost.setCas(jsonObject.get("cas").getAsString());
            } catch (ParseException ex) {
                Logger.getLogger(OsobyJSON.class.getName()).log(Level.SEVERE, null, ex);
            }
            udalost.setTyp(jsonObject.get("typ").getAsString());
            return udalost;
        }
    }
}
