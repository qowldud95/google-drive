package googledrive.domain;

import googledrive.NotificationApplication;
import googledrive.domain.Notied;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Notification_table")
@Data
//<<< DDD / Aggregate Root
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String sendMsg;

    @PostPersist
    public void onPostPersist() {
        Notied notied = new Notied(this);
        notied.publishAfterCommit();
    }

    public static NotificationRepository repository() {
        NotificationRepository notificationRepository = NotificationApplication.applicationContext.getBean(
            NotificationRepository.class
        );
        return notificationRepository;
    }

    //<<< Clean Arch / Port Method
    public static void notifyToUser(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        Notification notification = new Notification();
        repository().save(notification);

        Notied notied = new Notied(notification);
        notied.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(notification->{
            
            notification // do something
            repository().save(notification);

            Notied notied = new Notied(notification);
            notied.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void notifyToUser(StreamProcessed streamProcessed) {
        //implement business logic here:

        /** Example 1:  new item 
        Notification notification = new Notification();
        repository().save(notification);

        Notied notied = new Notied(notification);
        notied.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(streamProcessed.get???()).ifPresent(notification->{
            
            notification // do something
            repository().save(notification);

            Notied notied = new Notied(notification);
            notied.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
