package org.velazquez.U8_xml_json.tarea_5;


public class Principal {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8_xml_json\\tarea_5\\personasXML.xml";
        ArbolDOMPersonas adp = new ArbolDOMPersonas(ruta);
        adp.parse();
        Persona persona = new Persona("Pepe",14);
        adp.incrementarEdad(persona);
        adp.guardar();
        System.out.println("-----------------------");
        adp.parse();
    }
}