<form method="get" action="PrakServlet"> 
    NIM: <input type="text" name="nim" /> <br /> 
    Nama: <input type="text" name="nama" /> <br /> 
    <input type="submit" value="Kirim" /> 
</form> 
<% 
 out.print(request.getAttribute("nim")+"<br />"); 
 out.print(request.getAttribute("nama")+"<br />"); 
%>