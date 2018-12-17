public class MediaAdapter implements MediaPlayer {
    AdvancedMediaAdapter advancedMediaAdapter;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaAdapter = new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaAdapter = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaAdapter.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaAdapter.playMP4(fileName);
        }
    }
}
