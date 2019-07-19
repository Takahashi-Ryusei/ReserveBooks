package jp.te4a.spring.boot.reservebooks;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
  @GetMapping
  String list(/*Model model*/) {
    //model.addAttribute("books", bookService.findAll());
    return "books/reserve";
  }
  
  @PostMapping(path="check")
  String list2() {
	  return "books/check";
  }
}