package com.ltts.controller;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ltts.Member;
import com.ltts.Movie;
import com.ltts.PractiseProgramsApplication;
import com.ltts.repository.LoginRepository;
import com.ltts.repository.MovieRepository;

@Controller
public class HomeController {
	
	@Autowired
	MovieRepository movieRepository;

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/addMember")
	public String addMember() {
		return "addMember";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/addMovie")
	public String addMovie() {
		return "addMovie";
	}
	
	@RequestMapping(value = "insertmovie", method = RequestMethod.POST)
	public String insertMovie(HttpServletRequest session) {
		

		Movie movie = new Movie();
		movie.setMovieId(Integer.parseInt(session.getParameter("movieId")));
		movie.setMovieName(session.getParameter("movieName"));
		movie.setDirectorName(session.getParameter("director"));
		movie.setHeroName(session.getParameter("hero"));
		movie.setHeroienName(session.getParameter("heroien"));
		movie.setLangauage(session.getParameter("language"));
		movie.setDate(LocalDate.parse(session.getParameter("date")));
		
		movieRepository.save(movie);
		
		return "insertmovie";
	}
	
	@RequestMapping(value = "memberinsert", method = RequestMethod.POST)
	public String memberinsert(HttpServletRequest session) {
		
		Member member = new Member();
		
		member.setEmail(session.getParameter("email"));
		member.setName(session.getParameter("name"));
		member.setMobNo(session.getParameter("mobNo"));
		member.setGender(session.getParameter("gender"));
		member.setAge(Integer.parseInt(session.getParameter("age")));
		
		PractiseProgramsApplication.insertMemberToDatabase(member);
		
		return "memberinsert";
	}
	
	@RequestMapping(value = "index1", method = RequestMethod.POST)
	public String index1() {
		return "index";
	}
	
	@RequestMapping(value = "tryToLogin", method = RequestMethod.POST)
	public String tryToLogin(HttpServletRequest session) {
		
		LoginRepository.findUser(session.getParameter("userId"), session.getParameter("password"));
		
		return "index";
		
	}
	
}
