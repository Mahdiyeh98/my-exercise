package com.mahdiyeh_rezaei.convertxmltohtml.stax;

import org.junit.jupiter.api.Test;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class StaxTransformerUnitTest {

    @Test
    public void givenXml_whenTransform_thenGetHtml() throws IOException, URISyntaxException, XMLStreamException {
        String path = "src/test/resources/templates/LVS-006.xml";
        String expectedHtml = new String(Files.readAllBytes((Paths.get(getClass()
                .getResource("/templates/LVS-006.html")
                .toURI()))));
        StaxTransformer transformer = new StaxTransformer(path);

        String result = transformer.html();

        assertThat(result.trim().toLowerCase()).isEqualTo(expectedHtml.trim().toLowerCase());
    }

}
