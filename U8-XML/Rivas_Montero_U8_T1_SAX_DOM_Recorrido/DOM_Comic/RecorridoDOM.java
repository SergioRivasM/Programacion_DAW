package DOM_Comic;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class RecorridoDOM {

    public static void main(String[] args) {
        System.out.println("-----Método numNodosHijos-----");
        numNodosHijos();

        System.out.println("-----Método mostrarXLMDom-----");
        mostrarXMLDom();

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("comicsXML.xml"));

            NodeList nl = doc.getElementsByTagName("comic");

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void numNodosHijos() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("comicsXML.xml"));

            System.out.println("Nodos hijos de todo el documento: " + doc.getChildNodes().getLength());

            Element root = doc.getDocumentElement();

            System.out.println("Nodos hijos del elemento raíz: " + root.getChildNodes().getLength());

            NodeList nl = root.getChildNodes();

            System.out.println("Información de los nodos");
            for (int i = 0; i < nl.getLength(); i++) {
                System.out.println("Tipo del nodo: " + nl.item(i).getNodeType());
                System.out.println("Contenido del nodo: " + nl.item(i).getTextContent());
                System.out.println("-------------------------------------------------");
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getStackTrace());
        }
    }


    public static void mostrarXMLDom() {
        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("comicsXML.xml"));

            NodeList nl = doc.getElementsByTagName("comic");

            System.out.println("En este fichero tengo " + nl.getLength() + " etiquetas comic");

            for (int i = 0; i < nl.getLength(); i++) {
                Node nodo = nl.item(i);

                Element e = (Element) nl.item(i);
                System.out.println("Estoy en una etiqueta: " + e.getTagName());

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    if (nodo.hasChildNodes()) {
                        System.out.println("Y esta etiqueta tiene a su vez " + nodo.getChildNodes().getLength() + " nodos hijos");
                        NodeList listaInterior = nodo.getChildNodes();

                        for (int j = 0; j < listaInterior.getLength(); j++) {
                            if (listaInterior.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                Element eHijo = (Element) listaInterior.item(j);
                                System.out.println("Uno de los nodos hijos es la etiqueta " + eHijo.getTagName());
                                System.out.println("Cuyo contenido es: " + eHijo.getTextContent());
                            }
                        }
                    }
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}