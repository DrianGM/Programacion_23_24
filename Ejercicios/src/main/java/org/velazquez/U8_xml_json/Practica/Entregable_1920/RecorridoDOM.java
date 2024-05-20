package org.velazquez.U8_xml_json.Practica.Entregable_1920;

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class RecorridoDOM {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse("ejemplo.xml");

        numNodosHijos(document);
        mostrarXMLDom(document);
        mostrarContenidoEtiqueta(document, "nieta");
    }

    public static void numNodosHijos(Document document) {
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        System.out.println("Número de nodos hijos: " + nodeList.getLength());
        for (int i = 0; i < nodeList.getLength(); i++) {
            System.out.println("Tipo de nodo: " + nodeList.item(i).getNodeType());
        }
    }

    public static void mostrarXMLDom(Document document) {
        Element root = document.getDocumentElement();
        System.out.println("Contenido del primer nivel: " + root.getNodeName());
    }

    public static void mostrarContenidoEtiqueta(Document document, String s) {
        NodeList nodeList = document.getElementsByTagName(s);
        if (nodeList.getLength() == 0) {
            System.out.println("No hay ninguna ocurrencia de la etiqueta " + s);
        } else {
            for (int i = 0; i < nodeList.getLength(); i++) {
                System.out.println("Contenido de " + s + ": " + nodeList.item(i).getTextContent());
            }
        }
    }
}

