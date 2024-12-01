<%@page import="classes.JDBC"%>

<% 
    JDBC db = new JDBC(); 
    if (db.isConnected) { 
    out.print(db.message + "<br />"); 
    } else { 
    out.print(db.message + "<br />"); 
    } 

    db.runQuery("insert into mahasiswa (nama, jurusan, angkatan, ipk) VALUES ('Faried', 'Teknik Nuklir', 2022, 3.75)"); 
    out.print(db.message + "<br />"); 
    db.disconnect(); 
    out.print(db.message + "<br />");
%>

