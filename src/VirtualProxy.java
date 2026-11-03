public class VirtualProxy implements MediaItem{
    //f
    private MediaItem target = null;
    //c
    //m
	@Override
	public String getTitle() {
		if(target == null){
		    target = new RealMedia("Intergalatic", 284.5);
			System.out.println("Loading Heavy Assets Into Memory....");
			return target.getTitle();
		}
		return target.getTitle();
	}

	@Override
	public double getDuration() {
    	if(target == null){
    	    target = new RealMedia("Intergalatic", 284.5);
    		System.out.println("Loading Heavy Assets Into Memory....");
    		return target.getDuration();
    	}
    	return target.getDuration();
	}

	@Override
	public void playItem() {
    	if(target == null){
        	    target = new RealMedia("Intergalatic", 284.5);
        		System.out.println("Loading Heavy Assets Into Memory....");
                target.playItem();
        	}
        	target.playItem();
	}
}
