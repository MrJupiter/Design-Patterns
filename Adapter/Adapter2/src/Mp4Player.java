public class Mp4Player implements AdvancedMediaAdapter{

    @Override
    public void playMP4(String filename) {
        System.out.println("Playing MP4 file. Name: " + filename);
    }

    @Override
    public void playVlc(String filename) {

    }
}
