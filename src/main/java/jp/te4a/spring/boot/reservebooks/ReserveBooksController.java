package jp.te4a.spring.boot.reservebooks;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("books")
public class ReserveBooksController {
//  @Autowired
//  ReserveBooksService bookService;//
//  @ModelAttribute 
//  ReserveBooksForm setUpForm() {
//    return new ReserveBooksForm();
//  }
	/**
	 * モデルを初期化する
	 * 
	 * @return ScoreForm モデルにセットするScoreForm
	 */
	@ModelAttribute
	ReserveBooksForm ReserveBooksForm() {
			return new ReserveBooksForm();
	}
		
	@GetMapping
	String list(/*Model model*/) {
		//model.addAttribute("books", bookService.findAll());
		return "books/reserve";
	}
  
  @RequestMapping(value="/check", method=RequestMethod.POST)
  String list2(Model model) {
	  ReserveBooksForm bf=new ReserveBooksForm();
	  bf.setTitle("あいまいみー");
	  bf.setPublisher("竹書房");
	  bf.setWritter("ちょぼらうにょぽみ");
	  bf.setTel(0120222222);
	model.addAttribute("messagg","test");
	  model.addAttribute("book",bf);
	  return "books/check";
  }
}