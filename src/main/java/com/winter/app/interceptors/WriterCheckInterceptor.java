package com.winter.app.interceptors;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.winter.app.board.BoardDTO;
import com.winter.app.member.MemberDTO;

public class WriterCheckInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		String method = request.get
		
		Map<String, Object> map = modelAndView.getModel();
/*		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String k = it.next();
			System.out.println(k);
			System.out.println(map.get(k));*/
			
		}
		BoardDTO boardDTO = (BoardDTO)map.get("boardDTO");
		
		//로그인 정보
		MemberDTO memberDTO = (MemberDTO)request.getsession().get
				
		//비교
				if(!boardDTO.get)
		
		System.out.println(modelAndView.getViewName()); 
	
	}

}
