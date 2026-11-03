public class Main {
    static void main() {
        MediaItem stl = new RealMedia("Somebody To Love", 184.2);
        MediaItem proxy = new MediaProxy(stl);
        MediaItem vp = new VirtualProxy();

        System.out.println(proxy.getTitle());
        System.out.println(proxy.getDuration());
        proxy.playItem();

        System.out.println(vp.getTitle());
        System.out.println(vp.getDuration());
        vp.playItem();
    }
}
