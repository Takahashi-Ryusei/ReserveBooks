package jp.te4a.spring.boot.reservebooks;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class ReserveBooksForm {
  private String title;
  private String publisher;
  private String writter;
  private Integer number;
  private Integer tel;
  private boolean call;
}