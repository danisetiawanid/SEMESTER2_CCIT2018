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
    </head>
    <body>
        <div class="modal-header">
         
            <button type="button" class="close" data-dismiss="modal">x</button>
        </div>
         <div class="modal-body">
              <div class="panel panel-default">
        <div class="panel-body">
        <form action="ScheduleController?data=user&proses=update-user" method="post">
            <table style="margin:20px auto;">
            <%
                String schedule_id = request.getParameter("schedule_id");
                UserModel am = new UserModel();
                am.setSchedule_id(schedule_id);
                List<UserModel> datas = new ArrayList<UserModel>();
                datas = am.ScheduleId(); 
                if (datas.size() > 0) {

            %>
                        <h1>Edit Schedule</h1>
		<tr>
                    <td>Date : </td>
                    <td><input type="date" name="date_evt" value="<%=datas.get(0).getDate_evt()%>"></td>
		</tr>
		<tr>
                <td>Event : </td>
                <td><input type="text" name="event" value="<%=datas.get(0).getEvent()%>"></td>
		</tr>
                <tr>
                     <td>Location : </td>
                    <td><input type="text" name="location" value="<%=datas.get(0).getLocation()%>"></td>
                     <td> <input type="hidden" name="schedule_id" value="<%=datas.get(0).getSchedule_id()%>"></td>
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
