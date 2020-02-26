<%-- 
    Document   : edit_user
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
        <title>Latihan Java Web | TutorialPedia.NET</title>
    </head>
    <body>
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">x</button>
        </div>
         <div class="modal-body">
              <div class="panel panel-default">
        <div class="panel-body">
        <form action="UserController?data=user&proses=update-user" method="post">
            <table style="margin:20px auto;">
            <%
                String player_id = request.getParameter("player_id");
                UserModel am = new UserModel();
                am.setId(player_id);
                List<UserModel> datas = new ArrayList<UserModel>();
                datas = am.cariID(); 
                if (datas.size() > 0) {

            %>
               <h1>Edit Players</h1>
		<tr>
                    <td>Name : </td>
                    <td><input type="text" name="nama" value="<%=datas.get(0).getNama()%>"></td>
		</tr>
		<tr>
                <td>Division : </td>
                <td> <select name="divisi">
  <option value="CSGO">CSGO</option>
  <option value="RaibowSix">RainbowSix</option>
  <option value="Fortnite">Fortnite</option>
  <option value="CallOfDuty">CallOfDuty</option>
   <option value="Fifa">Fifa</option>
    <option value="PUBG">PUBG</option>
                    </select></td>
		</tr>
                <tr>
                    <td> <input type="hidden" name="vote" value="<%=datas.get(0).getVote()%>"></td>
                     <td> <input type="hidden" name="player_id" value="<%=datas.get(0).getId()%>"></td>
                </tr>
                <tr>
                    <td> <input type="submit" value="Update"></td>
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
