package tddmicroexercises.textconvertor;

import org.apache.commons.lang3.StringEscapeUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UnicodeFileToHtmlTextConverter
{
    private String fullFilenameWithPath;

    public UnicodeFileToHtmlTextConverter(String fullFilenameWithPath)
    {
        this.fullFilenameWithPath = fullFilenameWithPath;
    }

    public UnicodeFileToHtmlTextConverter() {}

    public String readFromFileAndConvertToHtml() throws IOException{
	    BufferedReader reader = new BufferedReader(new FileReader(fullFilenameWithPath));
        return convertToHtml(reader);
    }

    public String convertToHtml(BufferedReader reader) throws IOException {
	    String line = reader.readLine();
        String html = "";
        while (line != null)
        {
                html += StringEscapeUtils.escapeHtml4(line);
                html += "<br />";
                line = reader.readLine();
        }
        return html;
    }
}
