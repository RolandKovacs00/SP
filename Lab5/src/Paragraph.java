public class Paragraph implements Element {
    private String text;
    private AlignStrategy align;

    public Paragraph(String text) {
        this.text = text;
    }


    @Override
    public void add(Element element) {
        //not needed
    }

    public void setAlignStrategy(AlignStrategy align){
        this.align = align;
    }

    @Override
    public void remove(Element element) {
        //not needed
    }

    @Override
    public boolean find(Element element) {
        if (!(element instanceof Paragraph))
            return false;
        else {
            return ((Paragraph) element).text.equals(this.text);
        }
    }

    public void print(){
        if(this.align!=null){
            this.align.render(this,null);
        }
        System.out.println("Paragraph" + this.text);
    }
}