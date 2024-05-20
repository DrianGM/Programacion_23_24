package org.velazquez.U8_xml_json.Practica.Entregable_1920;

import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

public class RecorridoSax {
    public static void main(String[] args) throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        DefaultHandler handler = new DefaultHandler() {
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                System.out.println("Etiqueta: " + qName);
                if (attributes.getLength() > 0) {
                    System.out.println("Atributos: " + attributes.getValue(0));
                }
            }
            public void characters(char ch[], int start, int length) throws SAXException {
                System.out.println("Contenido: " + new String(ch, start, length));
            }
        };
        saxParser.parse("ejemplo.xml", handler);
    }
}

