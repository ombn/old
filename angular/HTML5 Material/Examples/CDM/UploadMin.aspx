<%
Request.Files(0).SaveAs(Request.PhysicalApplicationPath & "\CDM\Test.txt")
Response.write("Upload Successful")
%>
