import java.net.URL;
import java.util.UUID;

public class DownloadJob implements Runnable {
    private String jobId = UUID.randomUUID().toString();
    private URL url;
    private byte[] data = null;

    public DownloadJob(URL url) {
        this.url = url;
    }

    public String getJobId() {
        return jobId;
    }

    public byte[] getData() {
        return data;
    }

    @Override
    public void run() {
        this.data = DownloadManager.downloadFromURL(url);
    }
}
