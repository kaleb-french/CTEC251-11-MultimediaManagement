public class MediaProxy implements MediaItem{
    //f
    private Boolean connected;
    private MediaItem target;
    //c
    MediaProxy(MediaItem target){
        connected = false;
        this.target = target;
    }
    //m
	@Override
	public String getTitle() {
		if(connected == false){
		    System.out.println("Connection Established!");
			connected = true;
			return target.getTitle();
		} else{
		    return target.getTitle();
		}
	}

	@Override
	public double getDuration() {
	    if(connected == false){
	        System.out.println("Connection Established!");
			connected = true;
			return target.getDuration();
		} else{
	        return target.getDuration();
	    }
	}

	@Override
	public void playItem() {
         if(connected == false){
             System.out.println("Connection Established!");
             connected = true;
             target.playItem();
        } else{
             target.playItem();
         }
	}


}
