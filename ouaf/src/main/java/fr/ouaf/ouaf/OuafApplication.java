package fr.ouaf.ouaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.Date;

@Controller
@SpringBootApplication
public class OuafApplication {

	public static void main(String[] args) {
		SpringApplication.run(OuafApplication.class, args);
	}

}
