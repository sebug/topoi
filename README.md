# Topoi - Docx template to docx to PDF
Trying out the [POI Library](https://poi.apache.org/components/document/quick-guide-xwpf.html) specifically XWPDF to see what can be generated. As a first
step we'll also see whether we can generate the docx from some data.

    cd topoi
    mvn clean compile assembly:single
    java -jar target/topoi-1.0-SNAPSHOT-jar-with-dependencies.jar ../no_tags.docx ../no_tags.pdf
