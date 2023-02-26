package org.example.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ConcurrentHashMap;

import org.example.model.Audio;

import com.google.gson.Gson;
import com.google.gson.JsonElement;



@WebServlet(name = "audio", value = "audio")
public class AudioServlet extends HttpServlet {
	
	ConcurrentHashMap<String, Audio> audiofm = new ConcurrentHashMap<>();
	
	@Override
	 public void init() throws ServletException {
		Audio audio1 = new Audio("artist_01","title_track_01","album_title_01",07,2107,107,170);
		Audio audio2 = new Audio("artist_02","title_track_02","album_title_02",14,2114,114,240);
		Audio audio3 = new Audio("artist_03","title_track_03","album_title_03",21,2121,121,310);
		Audio audio4 = new Audio("artist_04","title_track_04","album_title_04",28,2128,128,380);
		Audio audio5 = new Audio("artist_05","title_track_05","album_title_05",35,2135,135,450);
		Audio audio6 = new Audio("artist_06","title_track_06","album_title_06",42,2142,142,520);
		 
		audiofm.put("artist_01", audio1);
		audiofm.put("artist_02", audio2);
		audiofm.put("artist_03", audio3);
		audiofm.put("artist_04", audio4);
		audiofm.put("artist_05", audio5);
		audiofm.put("artist_06", audio6);
		 
	 }
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		String nameoftheArtist = request.getParameter("nameoftheArtist");
		Audio audio = audiofm.get(nameoftheArtist);
		
	
	   Gson gson = new Gson();
	   JsonElement element = gson.toJsonTree(audiofm);
	    
		PrintWriter out = response.getWriter();
	    response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    out.println("GET RESPONSE IN JSON - single element: " + gson.toJson(audio));
	    
	   out.println("GET RESPONSE IN JSON - all elements " + element.toString());
	        
	   out.flush();
	
	}
	 @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       
		  
		    String nameoftheArtist = request.getParameter("nameoftheArtist");
		    String titleTrack = request.getParameter("titleTrack");
		    String albumTitle = request.getParameter("albumTitle");
		    String trackNumber = request.getParameter("trackNumber");
		    int intTrackNumber = Integer.parseInt(trackNumber);
		    String year = request.getParameter("year");
		    int intYear = Integer.parseInt(year);
		    String totalnumberOfReviews = request.getParameter("totalnumberOfReviews");
		    int intTotalnumberOfReviews = Integer.parseInt(totalnumberOfReviews);
		    String totalnumberofcopiesSold = request.getParameter("totalnumberofcopiesSold");
		    int intTotalnumberofcopiesSold = Integer.parseInt(totalnumberofcopiesSold);
		        
		    Audio stan = new Audio();
		    stan.setNameoftheArtist(nameoftheArtist);
		    stan.setTitleTrack(titleTrack);
		    stan.setAlbumTitle(albumTitle);
		    stan.setTrackNumber(intTrackNumber);
		    stan.setYear(intYear);
		    stan.setTotalnumberOfReviews(intTotalnumberOfReviews);
		    stan.setTotalnumberofcopiesSold(intTotalnumberofcopiesSold);
		    
		   
		    
	        

		    audiofm.put(nameoftheArtist, stan);
	        response.setStatus(200);
	    	
	    	response.getOutputStream().println("POST RESPONSE: Audio file of the " + nameoftheArtist + " is added to the database.");
	    }

}