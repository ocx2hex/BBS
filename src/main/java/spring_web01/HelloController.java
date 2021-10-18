package spring_web01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		//interface, abstract class는 자신의 이름으로 객체생성 불가.
		//상속받는 자식의 이름으로 객체를 만든다. 다형성	
		//객체지향의 3대요소 : 은닉, 상속, 다형성
		//Person, student, teacher, employee, 
		//Person p = new Person(), Person p = new Student();
		mav.addObject("msg", "안녕하세요.."); //msg = 안녕하세요 
		mav.setViewName("hello"); //jsp파일 지정.
		return mav;
	}

}