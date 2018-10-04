package jp.bctech.common.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

public class SimpleAccessDeniedHandler implements AccessDeniedHandler {
	public SimpleAccessDeniedHandler() {

	}

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException exception)
			throws IOException, ServletException {
		if (response.isCommitted()) {
			return;
		}
		
		System.out.println(exception.getMessage());
		response.sendError(HttpStatus.FORBIDDEN.value(), HttpStatus.FORBIDDEN.getReasonPhrase());
	}
}
