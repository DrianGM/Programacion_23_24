package org.velazquez.U8_xml_json.tarea_3;

public class Principal {
    public static void main(String[] args) {
        ParseadorDOMPersonas pdp = new ParseadorDOMPersonas();
        String nomFile = "C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8_xml_json\\tarea_3\\personasXML.xml";
        pdp.parse(nomFile);
    }
}