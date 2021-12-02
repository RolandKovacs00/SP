package ro.uvt.models;

import ro.uvt.services.Visitee;
import ro.uvt.services.Visitor;
import ro.uvt.services.AlignStrategy;

public class Paragraph implements Element, Visitee {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }

    public Paragraph(Paragraph paragraph) {
        this.text = paragraph.text;
    }

    public String getText() {
        return text;
    }

    public AlignStrategy getAlignStrategy() {
        return alignStrategy;
    }

    @Override
    public void add(Element element) {
        //not needed
    }

    @Override
    public void remove(Element element) {
        //not needed
    }

    public void setAlign(AlignStrategy align) {
        this.alignStrategy = align;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}