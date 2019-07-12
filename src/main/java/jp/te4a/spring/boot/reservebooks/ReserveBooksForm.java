package jp.te4a.spring.boot.reservebooks;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class ReserveBooksForm {
  private Integer id ;
  private String title;
  private String writter;
  private String publisher;
  private Integer price;
}