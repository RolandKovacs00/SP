import java.util.ArrayList;

public class Book {
    String name;
    ArrayList<String> paragraph = new ArrayList<String>();
    ArrayList<String> image = new ArrayList<String>();
    ArrayList<String> table = new ArrayList<String>();

    public Book(String name) {
        this.name = name;
    }


    public void createNewParagraph(String para){
        paragraph.add(para);
    }

    public void createNewImage(String img){
        paragraph.add(img);
    }

    public void createNewTable(String tab){
        paragraph.add(tab);
    }

    public void print(){
        for (int i = 0; i < paragraph.size(); i++) {
            System.out.print(paragraph.get(i) + " ");
        }
        for (int i = 0; i < image.size(); i++) {
            System.out.print(image.get(i) + " ");
        }
        for (int i = 0; i < table.size(); i++) {
            System.out.print(table.get(i) + " ");
        }
    }
}
