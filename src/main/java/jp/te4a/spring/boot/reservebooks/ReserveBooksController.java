package jp.te4a.spring.boot.reservebooks;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.FieldError;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("books")
public class ReserveBooksController {
	private static final Logger log = LoggerFactory.getLogger(ReserveBooksController.class);
	
	@ModelAttribute
	ReserveBooksForm ReserveBooksForm() {
		return new ReserveBooksForm();
	}
	
	@GetMapping
	String top(/* Model model */) {
		// model.addAttribute("books", bookService.findAll());
		return "books/top";
	}
	
	@RequestMapping(value = "/reserve", method = RequestMethod.GET)
	String list() {
		//model.addAttribute("books", bookService.findAll());
		return "books/reserve";
	}
	
	@RequestMapping(value = "/check", method = RequestMethod.POST)
	String list2(Model model, @Validated ReserveBooksForm form, BindingResult result) {
		ReserveBooksForm bf = new ReserveBooksForm();
		if (result.hasErrors()) {
			for (FieldError err : result.getFieldErrors()) {
				log.debug("error code = [" + err.getCode() + "]");
			}
			return "books/reserve";
		}
		bf.setTitle(form.getTitle());
		bf.setPublisher(form.getPublisher());
		bf.setWriter(form.getWriter());
		bf.setNumber(form.getNumber());
		bf.setName(form.getName());
		bf.setTel(form.getTel());
		bf.setCall(form.getCall());
		model.addAttribute("message", "注文確認");
		model.addAttribute("book", bf);
		return "books/check";
	}
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	String list(Model model) {
		List<ReserveBooksForm> orderlist = new ArrayList<ReserveBooksForm>();
		orderlist.add(new ReserveBooksForm());
		orderlist.add(new ReserveBooksForm());
		orderlist.add(new ReserveBooksForm());

		model.addAttribute("orderlist", orderlist);
		return "books/list";
	}
	@RequestMapping(value="/reserve", method=RequestMethod.POST)
	String back(Model model, ReserveBooksForm form) {
		ReserveBooksForm bf=new ReserveBooksForm();
	    bf.setTitle(form.getTitle());
	    bf.setPublisher(form.getPublisher());
	    bf.setWriter(form.getWriter());
	    bf.setNumber(form.getNumber());
	    bf.setName(form.getName());
	    bf.setTel(form.getTel());
	    bf.setCall(form.getCall());
	    model.addAttribute("message","test");
	    model.addAttribute("book",bf);
	    return "books/reserve";
	}
}