import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DataSearchRequest {

  String id;
  Date updatedBefore;
  int length;

}
