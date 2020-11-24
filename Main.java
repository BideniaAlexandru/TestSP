public class Main {
    public static void main(String[] args) throws Exception {
        Director dir = new Director("Foldere");
        txt txtp = new txt("Skills");
        txt txtf = new txt("Counters");
        txt txtl = new txt("Champion.gg");
        mp3 muzica = new mp3("Theme");
        svg svg = new svg("Ce-i ala svg?");

        dir.add(txtp);
        dir.add(txtf);
        dir.add(txtl);
        dir.add(muzica);
        dir.add(svg);

        txtp.setAlignStratagy(new AlignLeft());
        txtf.setAlignStratagy(new AlignRight());
        txtl.setAlignStratagy(new AlignCenter());

        dir.print();

        SpatiuStatistics status = new SpatiuStatistics();
        dir.accept(status);
        status.printStatistics();
    }
}
