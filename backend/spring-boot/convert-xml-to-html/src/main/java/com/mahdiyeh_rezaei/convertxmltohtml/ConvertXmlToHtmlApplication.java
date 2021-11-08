package com.mahdiyeh_rezaei.convertxmltohtml;

import com.mahdiyeh_rezaei.convertxmltohtml.stax.StaxTransformer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@SpringBootApplication
public class ConvertXmlToHtmlApplication {

    public static void main(String[] args) throws IOException, XMLStreamException {
        SpringApplication.run(ConvertXmlToHtmlApplication.class, args);



        String path = "src/main/resources/templates/LVS-006.xml";
        StaxTransformer transformer = new StaxTransformer(path);
        String pathForCreateFile = "src/main/resources/templates/";
        String fileName = "LVS-006.html";
        transformer.createFile(pathForCreateFile,fileName,transformer.html());
    }

}
