public class RealMedia implements MediaItem{
    //f
    private String title;
    private double duration;
    //c
    RealMedia(String title, double duration){
        this.title = title;
        this.duration = duration;
    }
    //m
	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public double getDuration() {
		return duration;
	}

	@Override
	public void playItem() {
	    System.out.println("Playing Song: " + title + " .");
	}


}
