package projetos.cad_user_notification.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UtilData {
    public static String agoraFormatado() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }
}
