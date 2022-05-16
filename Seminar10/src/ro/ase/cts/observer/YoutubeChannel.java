package ro.ase.cts.observer;

public class YoutubeChannel extends Observable{
    private String channelName;

    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public void publishVideo(String name){
        //...
        notifyObservers(name);
    }
}
