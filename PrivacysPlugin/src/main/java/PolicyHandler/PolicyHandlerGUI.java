package PolicyHandler;

import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class PolicyHandlerGUI extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        NotificationGroup ng = new NotificationGroup("myplugin", NotificationDisplayType.BALLOON, true);
        ng.createNotification("hallo", "world", NotificationType.INFORMATION, null).notify(e.getProject());
    }
}
