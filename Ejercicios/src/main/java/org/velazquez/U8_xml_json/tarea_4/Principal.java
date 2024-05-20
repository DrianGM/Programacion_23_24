package org.velazquez.U8_xml_json.tarea_4;


//import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

public class Principal {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8_xml_json\\tarea_4\\FichPersona.dat";
        Persona p1 = new Persona("Pepe", 23);
        Persona p2 = new Persona("Juan", 37);
        Persona p3 = new Persona("Carlos", 13);
        try {
            FileOutputStream fos = new FileOutputStream(ruta);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.writeObject(p3);
            oos.close();
            fos.close();
            FileInputStream fis = new FileInputStream(ruta);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Persona persona;
            while (fis.available() > 0) {
                persona = (Persona) ois.readObject();
                System.out.println(persona.toString());
            }
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        try {
            // Crear una nueva instancia de DocumentBuilderFactory
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            // Crear el elemento raíz
            Element rootElement = doc.createElement("Personas");
            doc.appendChild(rootElement);

            // Leer el archivo binario
            FileInputStream fis = new FileInputStream(ruta);
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Leer los objetos de la clase Persona y agregarlos al documento XML
            while (fis.available() > 0) {
                Persona persona = (Persona) ois.readObject();

                // Crear un nuevo elemento Persona
                Element newPersona = doc.createElement("Persona");

                // Crear y añadir el elemento nombre a Persona
                Element nombre = doc.createElement("nombre");
                nombre.appendChild(doc.createTextNode(persona.getNombre()));
                newPersona.appendChild(nombre);

                // Crear y añadir el elemento edad a Persona
                Element edad = doc.createElement("edad");
                edad.appendChild(doc.createTextNode(Integer.toString(persona.getEdad())));
                newPersona.appendChild(edad);

                // Añadir el nuevo elemento Persona al elemento raíz
                rootElement.appendChild(newPersona);
            }

//             Agregar los datos como atributos :
//            while (fis.available() > 0) {
//                Persona persona = (Persona) ois.readObject();
//
//                // Crear un nuevo elemento Persona
//                Element newPersona = doc.createElement("Persona");
//
//                // Añadir los atributos de la Persona
//                Attr nombre = doc.createAttribute("nombre");
//                nombre.setValue(persona.getNombre());
//                newPersona.setAttributeNode(nombre);
//
//                Attr edad = doc.createAttribute("edad");
//                edad.setValue(Integer.toString(persona.getEdad()));
//                newPersona.setAttributeNode(edad);
//
//                // Añadir el nuevo elemento Persona al elemento raíz
//                rootElement.appendChild(newPersona);
//            }

            // Cerrar el archivo binario
            ois.close();
            fis.close();

            // Guardar el documento XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:\\Users\\Adria\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8_xml_json\\tarea_4\\Personas.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
