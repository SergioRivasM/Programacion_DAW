package SAX_Comic;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class SaxMain {
    public static void main(String[] args) {
        try {
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser saxParser = spf.newSAXParser();

            DefaultHandler comicSax = new RecorridoSAX();

            saxParser.parse(new File("comicsXML.xml"),comicSax);

        } catch (ParserConfigurationException | IOException | SAXException e) {
            System.out.println(e.getStackTrace());
        }
    }
}