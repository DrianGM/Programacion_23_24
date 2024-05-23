package org.velazquez.U8_xml_json.Practica.Entregable_2122;

import javax.xml.stream.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecorridoStax {
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        // Cargar el documento XML
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8_xml_json\\Practica\\Entregable_2122\\alumnos.xml"));

        // Contadores
        int contadorAlumnos = 0;
        int contadorDireccion = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la dirección a buscar: ");
        String scannerDireccion = scanner.nextLine();
        String direccion = "";

        // Leer el documento XML
        while (reader.hasNext()) {
            int event = reader.next();
            switch (event) {
                case XMLStreamConstants.START_ELEMENT:
                    if (reader.getLocalName().equals("alumno")) {
                        contadorAlumnos++;
                    } else if (reader.getLocalName().equals("direccion")) {
                        direccion = reader.getElementText();
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    if (reader.getLocalName().equals("alumno")) {
                        if (direccion.equals(scannerDireccion)) {
                            contadorDireccion++;
                        }
                        direccion = "";
                    }
                    break;
            }
        }

        // Mostrar resultados
        System.out.println("Cantidad de alumnos: " + contadorAlumnos);
        System.out.println("Cantidad de alumnos que viven en la dirección solicitada: " + contadorDireccion);
    }
}
