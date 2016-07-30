SimpleServlet:
this servlet just uses printWriter to print a simple message- "Hello"
@webServlet uses url-pattern nthat can be either mapped to xml or to the annotation, here it is mapped into annotation;

SessionServlet:
this servlet shows how to use a session in the servlet. either it is taking the username for the URL by "?userName= Sumit"
or from the page- simple.html

InitServlet:
@webServlet tag instantiate a parameter named defaultUser and set to to "Sumit Sagar"
@WebServlet(urlPatterns="/InitServlet", initParams={@WebInitParam(name="defaultUser", value="Sumit Sagar")}) 
then we can print it using
println(this.getServletConfig().getInitParameter("defaultUser"));
when there is no parameter then it will print defaultUser


DispatcherServlet:
This servlet passes the Name parameter to next servlet
give the url of the servlet the request should be sent
response.sendRedirect("http://localhost:8085/SimpleServlet/SessionServlet?userName="+name);
the page used is indy.html


RequestDispatcher:
read the comments in the class.
this is used to send request from one servlet to another. we start with the index.html.


<servlet> tag is the root element
<servlet-name> give the name of the servlet
<servlet-class> give the package name + the servletName
</servlet> close the tag


<servlet-mapping> tag is to map the url
<servlet-name>Login</servlet-name> give the servlet name
<url-pattern>/login</url-pattern> give the url pattern to be mapped
</servlet-mapping> close the tag


<filter> the tag for defining filters
<filter-name>  give the filter class name 
<filter-class> give the full package+filter Class name
</filter> close the tag
<filter-mapping> for mapping the filter to the servlet
<filter-name> name of the filter
<url-pattern> mapping the servlet url to filter
</filter-mapping> close the tag