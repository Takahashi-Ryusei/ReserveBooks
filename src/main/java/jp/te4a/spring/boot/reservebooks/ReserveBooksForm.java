package jp.te4a.spring.boot.reservebooks;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class ReserveBooksForm {
  private String title;
  private String publisher;
  private String writer;
  private Integer number;
  private String name;
  private String tel;
  private Integer call;
}