package org.velazquez.U8_xml_json.U8_Entregable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProcessPosts {

    private static Document doc;

    public static void main(String[] args) throws TransformerException {
        String ruta = "C:\\Users\\DAW_M\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8_xml_json\\U8_Entregable\\posts.xml";
        Post p1 = new Post("Covid-19", "google.com", "El Covid-19 volvio en 2024.", "24/05/2024", "google.es_2");
        parseDOM(ruta);
        addPost(p1);
        List<Post> listaPosts = getPosts();
        System.out.println("------------------------------------");
        System.out.println("Todos los 'posts' del archivo xml");
        System.out.println(listaPosts);
        System.out.println("------------------------------------");
        System.out.println("Posts en formato JSON :");
        String json = convertToJSON();
        System.out.println(json);
    }

    public static void parseDOM(String filename) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(filename);
            doc.getDocumentElement().normalize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addPost(Post post) throws TransformerException {
        Node root = doc.getDocumentElement();
        Element nuevoPost = doc.createElement("post");
        Element titulo = doc.createElement("title");
        titulo.setTextContent(post.getTitle());
        nuevoPost.appendChild(titulo);
        Element link = doc.createElement("link");
        link.setTextContent(post.getLink());
        nuevoPost.appendChild(link);
        Element descripcion = doc.createElement("description");
        descripcion.setTextContent(post.getDescription());
        nuevoPost.appendChild(descripcion);
        Element fechaPub = doc.createElement("pubdate");
        fechaPub.setTextContent(post.getPubdate());
        nuevoPost.appendChild(fechaPub);
        Element guid = doc.createElement("guid");
        guid.setTextContent(post.getGuid());
        nuevoPost.appendChild(guid);
        root.appendChild(nuevoPost);
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");
        DOMSource source = new DOMSource(doc);
        File postArchivo = new File("C:\\Users\\DAW_M\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8_xml_json\\U8_Entregable\\posts.xml");
        StreamResult result = new StreamResult(postArchivo);
        transformer.transform(source, result);
    }

    public static List<Post> getPosts() {
        List<Post> listaPosts = new ArrayList<>();
        Element raiz = doc.getDocumentElement();
        NodeList nodeListHijos = raiz.getChildNodes();
        String title = "";
        String link = "";
        String description = "";
        String pubdate = "";
        String guid = "";

        for (int j = 0; j < nodeListHijos.getLength(); j++) {
            Node nodeHijo = nodeListHijos.item(j);
            if (nodeHijo.getNodeType() == Node.ELEMENT_NODE) {
                Element hijo = (Element) nodeHijo;
                NodeList nodeListNietos = hijo.getChildNodes();
                for (int i = 0; i < nodeListNietos.getLength(); i++) {
                    Node node = nodeListNietos.item(i);
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element element = (Element) node;
                        switch (element.getTagName()) {
                            case "title":
                                title = element.getTextContent();
                            case "link":
                                link = element.getTextContent();
                            case "description":
                                description = element.getTextContent();
                            case "pubdate":
                                pubdate = element.getTextContent();
                            case "guid":
                                guid = element.getTextContent();
                        }
                    }
                }
                Post p = new Post(title, link, description, pubdate, guid);
                listaPosts.add(p);
            }
        }
        return listaPosts;
    }

    public static String convertToJSON() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(getPosts());
        try {
            File archivoJson = new File("C:\\Users\\DAW_M\\Programacion_23_24\\Ejercicios\\src\\main\\java\\org\\velazquez\\U8_xml_json\\U8_Entregable\\posts.json");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoJson));
            oos.writeObject(json);
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return json;
    }
}