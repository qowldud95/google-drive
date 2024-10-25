package googledrive.domain;

import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String fileId;
    private Long fileSize;
    private String fileName;
    private Date UploadDt;
}
