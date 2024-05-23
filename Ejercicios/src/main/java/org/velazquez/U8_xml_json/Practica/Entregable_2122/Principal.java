package org.velazquez.U8_xml_json.Practica.Entregable_2122;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try {
            File fichero = new File("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8_xml_json\\Practica\\Entregable_2122\\alumnos.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(fichero);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("alumno");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String nombre = element.getElementsByTagName("nombre").item(0).getTextContent();
                    String apellido = element.getElementsByTagName("apellido").item(0).getTextContent();
                    String direccion = element.getElementsByTagName("direccion").item(0).getTextContent();
                    String dni = element.getAttribute("dni");
//                    int id = Integer.parseInt(element.getAttribute("id"));
//                    int edad = Integer.parseInt(element.getElementsByTagName("edad").item(0).getTextContent());
                    Alumno alumno = new Alumno(nombre, apellido, direccion, dni);
                    alumnos.add(alumno);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        Collections.sort(alumnos, (a1, a2) -> a1.getDni().compareTo(a2.getDni()));
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre() + ", " + alumno.getApellido() + ", " + alumno.getDireccion() + ", " + alumno.getDni());
        }
    }
}
