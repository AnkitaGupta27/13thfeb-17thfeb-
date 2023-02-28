<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Happy Valentines Day</title>
</head>
<body bgcolor="lightblue">
	<!-- <div style="text-align: center;"> -->
		 <h1>List of gift</h1>
    
    <form method="post" action="submitGiftList">
    	
    
    	<table>
    		<tr>
    			<td>Date</td>
    			<td><input type="text" id="date" name="date"></td>
    		</tr>
    		
    		<tr>
    			<td>Location</td>
    			<td> <input type="text" id="location" name="location"><br><br></td>		
    		</tr>
    		
    		<tr>
    			<td>Gifts</td>
    			<td>
    			<select id="gifts" name="gifts" multiple>
		            <option value="chocolate">Chocolate</option>
		            <option value="flowers">Flowers</option>
		            <option value="jewelry">Jewellery</option>
        		</select>
        </td>
        </tr>
    		
    	</table>
        <input type="submit" value="Submit">
    </form>
<!-- </div> -->
	
   
    
</body>
</html>
