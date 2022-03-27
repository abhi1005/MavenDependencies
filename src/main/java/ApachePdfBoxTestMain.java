import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.IOException;

public class ApachePdfBoxTestMain {
    public static void main(String[] args) throws IOException {
        PDDocument document = new PDDocument();

        //this location needs to be changed according to your local directory structures
        document.save("/Users/a13220730/Documents/workpace_4.0/MavenDependencies/src/main/resources/WeiZhang.pdf");

        document.close();
    }
}
