package org.velazquez.U8_xml_json.tarea_5;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;

public class ArbolDOMPersonas {
    private Document doc;

    public ArbolDOMPersonas(String nombreFichero) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            doc = builder.parse(nombreFichero);
            doc.getDocumentElement().normalize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void parse() {
        parseNode(doc.getDocumentElement(), "");
    }

    private void parseNode(Node node, String indent) {
        String nodeName = node.getNodeName();
        String nodeValue = node.getTextContent().trim();
        if (!nodeValue.isEmpty() && !nodeName.equals("persona") && !nodeName.equals("personas")) {
            System.out.println(indent + nodeName + ": " + nodeValue);
        } else {
            System.out.println(indent + nodeName);
        }
        NodeList nodeList = node.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node currentNode = nodeList.item(i);
            if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
                parseNode(currentNode, indent + "  ");
            }
        }
    }


    public void incrementarEdad(Persona persona) {
        NodeList nodeList = doc.getElementsByTagName("nombre");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getTextContent().equals(persona.getNombre())) {
                Node edadNode = ((Element) node.getParentNode()).getElementsByTagName("edad").item(0);
                int edad = Integer.parseInt(edadNode.getTextContent());
                edadNode.setTextContent(String.valueOf(edad + 1));
                break;
            }
        }
    }

    public void guardar() {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8_xml_json\\tarea_5\\personasXML.xml"));
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Document getDoc() {
        return doc;
    }
}