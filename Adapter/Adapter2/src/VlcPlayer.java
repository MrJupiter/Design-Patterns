public class VlcPlayer implements AdvancedMediaAdapter{
    @Override
    public void playMP4(String filename) {

    }

    @Override
    public void playVlc(String filename) {
        System.out.println("Playing VLC file. Name: "+filename);
    }
}
