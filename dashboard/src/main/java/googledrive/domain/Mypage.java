package googledrive.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "Mypage_table")
@Data
public class Mypage {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Double fileSize;
    private String fileId;
    private String fileName;
    private String indexingYn;
    private String uploadYn;
    private String videoUrl;
    private Date uploadDt;
    private String userId;
}
