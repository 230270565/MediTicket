// repository/INotificationRepository.java
package za.ac.cput.repository;

import za.ac.cput.domain.NotificationService;
import java.util.List;

public interface INotificationRepository extends IRepository<NotificationService, Integer> {
    List<NotificationService> getAll();
}