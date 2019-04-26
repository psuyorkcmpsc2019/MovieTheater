

<html> 
<head>
    <meta charset="utf-8">
    <title>Web Application</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>    
</head>
  <form action = "ReceiptPage" method = "post">
  <input type ="hidden" name="action" value="default">
    
    <h2>Thank you for choosing Penn Cinema Theater</h2> 
      

    <p>Below summarizes your transaction:</p>

    <label>First Name:</label>
    <span>${movieData.getFirstName()}</span><br>
    <label>Last Name:</label>
    <span>${movieData.getLastName()}</span><br>
    <label>Movie:</label>
    <span>${movieData.getTitle()}</span><br>
    <label>Number of Tickets:</label>
    <span>${movieData.getticketsQuantity()}</span><br>
    
    

    <p>If you would like to choose a different movie click on back button</p>
     <form action="" method="get">
        <input type="hidden" name="action" value="default">
        <input type="submit" value="Return">
    </form>
  </form>
</body>
</html>