<%-- 
    Documcent   : edit_user
    Created on : Nov 22, 2016, 9:42:03 PM
    Author     : TutorialPedia.NET
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.UserModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
    </head>
    <body>
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">x</button>
        </div>
         <div class="modal-body">
              <div class="panel panel-default">
        <div class="panel-body">
        <form action="VoteController?data=user&proses=vote-user" method="post">
            <table style="margin:20px auto;">
            <%
                String player_id = request.getParameter("player_id");
                UserModel am = new UserModel();
                am.setId(player_id);
                List<UserModel> datas = new ArrayList<UserModel>();
                datas = am.cariID(); 
               
                if (datas.size() > 0) {

            %>
               <h1>Vote!</h1>
		<tr>
              
                    <td><input type="hidden" name="nama" value="<%=datas.get(0).getNama()%>"></td>
		</tr>
		<tr>
               
          <td><input type="hidden" name="divisi" value="<%=datas.get(0).getDivisi()%>"></td>
		</tr>
                <tr>
                    
                    <td> <input type="hidden" name="vote" value="1"></td>
                     <td> <input type="hidden" name="player_id" value="<%=datas.get(0).getId()%>"></td>
                      <td><input type="hidden" name="email3" value="<%=session.getAttribute("email")%>"></td>
                </tr>
                <tr>
                    <td>Are You Sure You Want to Vote? <%=datas.get(0).getNama()%></td>
                <br>
                    <td> <input type="submit" value="Vote!"></td>
                </tr>
                
                  <%}%>
            </table>
	</form>	
                </div>
              </div>
            </div>
     <div class="modal-footer">
        <div class="panel-footer">


        </div>
      </div>
    </body>
</html>
