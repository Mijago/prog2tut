import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class DownloadManager {
    private URL url;
    private DownloadJob job;
    public Map<String, DownloadJob> jobs = new HashMap<>();

    // e
    // Abspeichern aller Jobs in einer Datenstruktur (Liste oder Map)
    // Jobs werden in startDownload dort eingefügt
    // Methode zum ausgeben eines jobs DownloadJob jetJob(String jobId)

    // nicht Teil des F l u i d I n t e rf a c e s
    public static byte[] downloadFromURL(URL url) {
        return null; // TODO: Implement
    }

    public static void main(String[] args) throws Exception {

        String jobId = new DownloadManager()
                .configure(4, 4000)
                .specifyDownloadLocation(new URL("http://example.com/resource"))
                .startDownload();
        System.out.println(jobId);
    }

    DownloadManager configure(int maxThreads, long timeout) {
        // TODO: Implement
        return this;
    }

    String startDownload() {
        DownloadJob job = new DownloadJob(this.url);
        Thread thread = new Thread(job);
        thread.start();

        jobs.put(job.getJobId(), job);

        return job.getJobId();
    } // returns the JobId

    DownloadManager cancelDownload(String jobId) {
        // TODO: Implement
        return this;
    }

    DownloadManager specifyDownloadLocation(URL url) {
        this.url = url;
        return this;
    }

}