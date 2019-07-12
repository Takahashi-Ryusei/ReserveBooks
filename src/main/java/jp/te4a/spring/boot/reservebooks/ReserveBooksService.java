package jp.te4a.spring.boot.reservebooks;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ReserveBooksService {
//  @Autowired
//  BookRepository bookRepository;
//  public ReserveBooksForm create(ReserveBooksForm bookForm) {
//    bookForm.setId(bookRepository.getBookId());
//    BookBean bookBean = new BookBean();
//    BeanUtils.copyProperties(bookForm, bookBean);
//    bookRepository.create(bookBean);
//    return bookForm;
//  }
//  public ReserveBooksForm update(ReserveBooksForm bookForm) {
//	    BookBean bookBean = new BookBean();
//	    BeanUtils.copyProperties(bookForm, bookBean);
//	    bookRepository.update(bookBean);
//	    return bookForm;
//	  }
//	  public void delete(Integer id) {  bookRepository.delete(id); }
//	  public List<ReserveBooksForm> findAll() {
//	    List<BookBean> beanList = bookRepository.findAll();
//	    List<ReserveBooksForm> formList = new ArrayList<ReserveBooksForm>();
//	    for(BookBean bookBean: beanList) {
//	      ReserveBooksForm bookForm = new ReserveBooksForm();
//	      BeanUtils.copyProperties(bookBean, bookForm);
//	      formList.add(bookForm);
//	    }
//	    return formList;
//	    }
//	  public ReserveBooksForm findOne(Integer id) {
//	    BookBean bookBean = bookRepository.findOne(id);
//	    ReserveBooksForm bookForm = new ReserveBooksForm();
//	    BeanUtils.copyProperties(bookBean, bookForm);
//	    return bookForm;
//	  }
//	}
}