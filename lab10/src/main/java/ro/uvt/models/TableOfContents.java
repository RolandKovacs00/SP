package ro.uvt.models;

import ro.uvt.services.Visitee;
import ro.uvt.services.Visitor;

public class TableOfContents implements Element, Visitee {
    @Override
    public void add(Element element) {
        //not needed
    }

    @Override
    public void remove(Element element) {
        //not needed
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }
}