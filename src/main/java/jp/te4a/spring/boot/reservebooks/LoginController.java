package jp.te4a.spring.boot.reservebooks;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ログイン用コントローラクラス
 * 
 * @author ryusei
 */
@Controller
@RequestMapping("/")
//@RequestMapping("login")
public class LoginController {

	/***
	 * TOP画面ができるまでの間
	 * 
	 * @return
	 */
	@GetMapping
	String loginTmp() {
		return "redirect:/login";
	}
	
	/**
	 * ログイン画面に遷移する
	 * 
	 * @return 遷移先ビュー名
	 */
	@GetMapping(path = "login")
	String loginForm(Model model) {
		return "login";
	}
	
	 @PostMapping(value = "login/postrank")
	 String loginAction(@RequestParam String id, @RequestParam String password) {
		 System.out.println(id + " : " + password);
		 if(id.equals("admin") && password.equals("password")) {
			 return "redirect:/books";
		 }
		 
		 return "redirect:/login";
	 }
}
