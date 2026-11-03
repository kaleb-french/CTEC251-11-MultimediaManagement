public class Main {
    static void main() {
        MediaItem stl = new RealMedia("Somebody To Love", 184.2);
        MediaItem proxy = new MediaProxy(stl);

        System.out.println(proxy.getTitle());
        System.out.println(proxy.getDuration());
        proxy.playItem();
    }
}
