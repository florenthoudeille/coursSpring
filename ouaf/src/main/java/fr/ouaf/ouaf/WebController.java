package fr.ouaf.ouaf;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class WebController {

	@GetMapping(value = "/index")
	public String index(HttpSession session) {
		Timestamp stamp = new Timestamp(System.currentTimeMillis());
		Date date = new Date(stamp.getTime());
		String t = date.toString();

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYY HH:mm:ss");
		String formatDate = dateFormat.format(date);
		session.setAttribute("date", date);
		session.setAttribute("time", t);
		session.setAttribute("formatDate", formatDate);
		return "index";
	}

	public String TimeStampToDate() {
		Timestamp stamp = new Timestamp(System.currentTimeMillis());
		Date date = new Date(stamp.getTime());
		String t = date.toString();

		return "t";
	}
}
