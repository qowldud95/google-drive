package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Notied extends AbstractEvent {

    private Long id;

    public Notied(Notification aggregate) {
        super(aggregate);
    }

    public Notied() {
        super();
    }
}
//>>> DDD / Domain Event
