package ro.uvt.services;

import ro.uvt.models.Context;
import ro.uvt.models.Paragraph;

public class AlignCenter implements AlignStrategy {
    public void render(Paragraph paragraph, Context context){
        System.out.println("Align center" + paragraph);
    }
}
