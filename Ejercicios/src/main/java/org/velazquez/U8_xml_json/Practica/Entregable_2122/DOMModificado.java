package org.velazquez.U8_xml_json.Practica.Entregable_2122;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class DOMModificado {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        // Cargar el documento XML
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8_xml_json\\Practica\\Entregable_2122\\alumnos.xml");

        // Agregar instituto a todos los alumnos
        NodeList alumnos = document.getElementsByTagName("alumno");
        for (int i = 0; i < alumnos.getLength(); i++) {
            Element alumno = (Element) alumnos.item(i);
            Element instituto = document.createElement("instituto");
            instituto.setTextContent("IES VELAZQUEZ");
            alumno.appendChild(instituto);
        }

        // Agregar nuevo alumno
        Element nuevoAlumno = document.createElement("alumno");
        nuevoAlumno.setAttribute("dni", "8888888X");
        Element nombre = document.createElement("nombre");
        nombre.setTextContent("Luis");
        nuevoAlumno.appendChild(nombre);
        Element apellido = document.createElement("apellido");
        apellido.setTextContent("Ruiz");
        nuevoAlumno.appendChild(apellido);
        Element direccion = document.createElement("direccion");
        direccion.setTextContent("Allí");
        nuevoAlumno.appendChild(direccion);
        Element institutoNuevo = document.createElement("instituto");
        institutoNuevo.setTextContent("IES VELAZQUEZ");
        nuevoAlumno.appendChild(institutoNuevo);
        document.getDocumentElement().insertBefore(nuevoAlumno, document.getDocumentElement().getFirstChild());

        // Escribir el documento modificado en un nuevo archivo
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8_xml_json\\Practica\\Entregable_2122\\alumnos_modificado.xml"));
        transformer.transform(source, result);
    }
}
