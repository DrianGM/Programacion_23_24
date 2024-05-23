package org.velazquez.U8_xml_json.Practica.Entregable_1920;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class RecorridoSax {
    public static void main(String[] args) {
        try {
            // Crea una instancia del SAXParser
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser saxParser = spf.newSAXParser();

            // Define el handler de SAX
            DefaultHandler handler = new DefaultHandler() {
                boolean inLibro = false;
                boolean inCapitulo = false;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    if (qName.equalsIgnoreCase("libro")) {
                        inLibro = true;
                        System.out.println("Precio: " + attributes.getValue("precio"));
                    } else if (qName.equalsIgnoreCase("capitulo")) {
                        inCapitulo = true;
                    }
                }

                @Override
                public void endElement(String uri, String localName, String qName) throws SAXException {
                    if (qName.equalsIgnoreCase("libro")) {
                        inLibro = false;
                    } else if (qName.equalsIgnoreCase("capitulo")) {
                        inCapitulo = false;
                    }
                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    if (inCapitulo) {
                        System.out.println("Capítulo: " + new String(ch, start, length));
                    }
                }
            };

            // Parsea el archivo XML
//            File xmlFile = new File("ruta/al/archivo.xml");
//            saxParser.parse(xmlFile, handler);
            saxParser.parse(new File("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8_xml_json\\Practica\\Entregable_1920\\ejemplo.xml"),handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


