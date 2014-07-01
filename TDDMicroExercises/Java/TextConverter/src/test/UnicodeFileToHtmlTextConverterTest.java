import org.junit.Test;
import tddmicroexercises.textconvertor.UnicodeFileToHtmlTextConverter;

import java.io.BufferedReader;
import java.io.StringReader;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UnicodeFileToHtmlTextConverterTest {

    @Test
    public void shouldConvertAGivenStringToHtml() throws Exception {
        BufferedReader reader = new BufferedReader(new StringReader("blah\nblue"));
        UnicodeFileToHtmlTextConverter unicodeFileToHtmlTextConverter = new UnicodeFileToHtmlTextConverter();
        assertThat(unicodeFileToHtmlTextConverter.convertToHtml(reader), is("blah<br />blue<br />"));
    }
}