package devices.configuration.remote.iot20;

public class IoT20MessagesFixture {

    public BootNotificationRequest bootNotification() {
        return new BootNotificationRequest(
                new BootNotificationRequest.Device(
                        "820394A93203",
                        "CPF25 Family",
                        new BootNotificationRequest.Modem(
                                "1122 3344 5566 7788 99 C 1",
                                "082931213347973812"
                        ),
                        "EVB",
                        "1.0"
                ),
                BootNotificationRequest.Reason.PowerUp
        );
    }
}
