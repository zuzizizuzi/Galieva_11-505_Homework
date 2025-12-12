//отслеживание статуса
public interface Trackable {
    String getTrackingStatus();
    void updateTracking(String status);
}
