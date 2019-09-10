package jp.te4a.spring.boot.reservebooks;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class ReserveBooksForm {
  @NotBlank(message ="タイトルは必ず入力してください")
  @Size(min = 1, max = 20, message ="タイトルは１文字以上２０文字以内で入力してください") 
  private String title;
  
  private String publisher;	
  
  private String writer;
  //@Size(min=1,message="冊数は必ず入力してください")
  private Integer number;
  @NotBlank(message ="名前は必ず入力してください")
  private String name;
  @NotBlank(message ="電話番号は必ず入力してください")
  private String tel;
  private String call;
}