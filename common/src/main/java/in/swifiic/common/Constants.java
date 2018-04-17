package in.swifiic.common;

/**
 * Created by abhishek on 19/3/18.
 */

public final class Constants {
    // Vectors Constants
    public static final String VIDEO_PREFIX = "video";
    public static final String BROADCAST_ACTION = "swifiic.vectors.android.BROADCAST";
    public static final String LOG_STATUS = "swifiic.vectors.android.LOG_STATUS";
    public static final String CONNECTION_STATUS = "swifiic.vectors.android.CONNECTION_STATUS";
    public static final String STATUS_ENABLE_BG_SERVICE = "connectionStatus";
    public static final String APP_KEY = "VectorsSharedPrefs";
    public static final String DEVICE_ID = "DEVICE_ID";
    public static final String ANDROID_BOOT_COMPLETION = "android.intent.action.BOOT_COMPLETED";
    public static final int MIN_CONNECTION_GAP_TIME = 60;
    public static final int LOG_BUFFER_SIZE = 200; // number of lines buffered before writing to file
    public static final int LOG_TEXT_VIEW_LINES = 1000;
    public static final String CONNECTION_LOG_FILENAME = "ConnectionLog";
    public static final String LOGGER_FILENAME = "LogFile";
    public static final String USER_EMAIL_ID = "swifiic.vectors.android.USER_EMAIL_ID";
    public static final int DELAY_TIME_MS = 10;
    public static final int RESTART_NEARBY_SECS = 300;
    public static final String ENDPOINT_PREFIX = "Vectors_";
    public static final int FILE_BUFFER_SIZE = 1024*16;
    public static final int ACK_BUFFER_SIZE = 1024*128;
    public static final int ADVERT_DISCOVERY_TIMEOUT_MS = 1000;
    public static final int FILE_SENT_TIMEOUT_MS = 10000;

    // Bridge Constants
    public static final String BURST_COUNT = "BURST_COUNT";
    public static final String FLDR =  "/VectorsData";
    public static final String FOLDER_LOG = "/VectorsLogs";
    public static final String ACK_PREFIX = "ack_";
    public static final String BASE_NAME =  "video_00";
    public static final String ACK_FILENAME = ACK_PREFIX + BASE_NAME;

    public static final int[]  fileSizeArrayL0 = {5, 3, 3, 4, 3, 3, 4};
    public static final int[]  fileSizeArrayL1 = {21, 13, 13, 24, 28, 25, 28};

    // indexing for temporal starts from 1
    public static final int[] CopyCountL0 = {32, 32, 16, 16, 8, 8, 0, 0};
    public static final int[] CopyCountL1 = {6, 6, 6, 6, 6, 6, 0, 0};
    public static final int[] CopyCountL3 = {4, 4, 4, 4, 4, 4, 0, 0};
    public static final int[] CopyCountL4 = {3, 3, 3, 3, 3, 3, 0, 0};
}
