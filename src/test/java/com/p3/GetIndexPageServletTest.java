package com.p3;

import org.junit.Test;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class GetIndexPageServletTest {
    private final static String path = "/WEB-INF/view/index.jsp";

    @Test
    public void whenCall() throws ServletException, IOException {
        GetIndexPageServlet servlet = new GetIndexPageServlet();

        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        RequestDispatcher dispatcher = mock(RequestDispatcher.class);

        when(request.getRequestDispatcher(path)).thenReturn(dispatcher) ;
        servlet.doGet(request,response);

        verify(request,times(1)).getRequestDispatcher(path);

    }

}