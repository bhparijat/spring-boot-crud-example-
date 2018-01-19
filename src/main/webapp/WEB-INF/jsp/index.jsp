
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
 <head><title>Hello world Example</title></head>
 <body>
   <center> <h2>Enter employee details</h2></center>
    <center>
    <form method="post" action="/details" modelAttribute="employee">
    <table>
    <tr>
    <td>Name</td>
    <td><input type='text' path='name' value="${name}"/></td>
    </tr>
    <tr>
    <td>Organization</td>
    <td><input type='text' path='organisation'/></td>
    </tr>
    <tr>
    <td>City</td>
    <td><input type='text' path='city'/></td>
    </tr>
    <tr>
    <td>Country</td>
    <td><input type='text' path='country'></td>
    </tr>
    <tr>
    <td>Designation</td>
    <td><input type='text' path='designation'/></td>
    </tr>
    </table>
    <input type='submit'>
    </form>
   </center>
 </body>
</html> 