public class CDPlayer implements Media {
    @Override
    public void start() {
        System.out.println("Music player started");
    }

    @Override
    public void stop() {
        System.out.println("Music player stopped");
    }
}
