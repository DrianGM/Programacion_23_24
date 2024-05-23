package org.velazquez.U8_xml_json.Practica.Entregable_1920;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class RecorridoDOM {
    public static void main(String[] args) {
        try {
            // Carga el archivo XML
            File archivoXML = new File("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8_xml_json\\Practica\\Entregable_1920\\ejemplo.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(archivoXML);
            doc.getDocumentElement().normalize();

            // Invoca los métodos requeridos
            numNodosHijos(doc);
            mostrarXMLDom(doc);
            mostrarContenidoEtiqueta(doc, "capitulo");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para mostrar el número de nodos hijos y su tipo
    private static void numNodosHijos(Document doc) {
        NodeList nodeList = doc.getDocumentElement().getChildNodes();
        System.out.println("Número de nodos hijos: " + nodeList.getLength());
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                System.out.println("Tipo: Etiqueta - " + node.getNodeName());
            } else if (node.getNodeType() == Node.TEXT_NODE) {
                System.out.println("Tipo: Texto - " + node.getNodeValue().trim());
            } else if (node.getNodeType() == Node.COMMENT_NODE) {
                System.out.println("Tipo: Comentario - " + node.getNodeValue().trim());
            }
        }
    }

    // Método para mostrar el contenido del primer nivel del archivo XML
    private static void mostrarXMLDom(Document doc) {
        NodeList nodeList = doc.getDocumentElement().getChildNodes();
        System.out.println("Contenido del primer nivel:");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                System.out.println(node.getNodeName());
            }
        }
    }

    // Método para mostrar el contenido de una etiqueta específica
    private static void mostrarContenidoEtiqueta(Document doc, String etiqueta) {
        NodeList nodeList = doc.getElementsByTagName(etiqueta);
        if (nodeList.getLength() == 0) {
            System.out.println("No se encontraron ocurrencias de la etiqueta '" + etiqueta + "'.");
        } else {
            System.out.println("Contenido de la etiqueta '" + etiqueta + "':");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println(node.getTextContent().trim());
            }
        }
    }
}