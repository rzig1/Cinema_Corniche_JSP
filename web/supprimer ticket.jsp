<%-- 
    Document   : supprimer ticket
    Created on : 15 déc. 2023, 16:12:48
    Author     : MSI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="icon" href="logobg.jpg" type="image/x-icon">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  
  <style>
    @import url('https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&display=swap');


*{
  color: #3C3C3E;
}
body{
    background-color: #D9D9D9;
    font-family: 'Montserrat', sans-serif;
    width: 100%;
    height: 100vh;
    
    
}
ul{
    color: aliceblue;
}
li{
    color: aliceblue;
}
.grid-container{
    display: grid;
    grid-template-columns: auto auto auto auto auto auto;
    gap: 10px;
}
.item-1{
    grid-column: 1;
    justify-content: center;
    text-align: center;
    margin: 0px;
  
}
.item-22{
  grid-column: span  2/5;
}

.item-3{
  grid-column: 5 /6 ;
  
}
.item-4{
    grid-column:  6;
    
    
    
}
.item-2{
  grid-column: span 2/ 6;
 
  
}
.item-5{
  grid-column: 6;
}
.navbar {
    overflow: hidden;
   
}

.navbar a {
    
    display: block;
    color: #3C3C3E;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover {
    font-size: 10px;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
  
}


.card {
    width: 130px;
    height: 130px;
    background: #D9D9D9;
    position: relative;
    display: flex;
    place-content: center;
    place-items: center;
    overflow: hidden;
    border-radius: 20px;
  }
  
  .card h2 {
    z-index: 1;
    color: #3C3C3E;
    font-size: 1em;
  }
  
  .card::before {
    content: '';
    position: absolute;
    width: 100px;
    background-image: linear-gradient(180deg, #3C3C3E, rgb(60, 60, 62));
    height: 130%;
    animation: rotBGimg 3s linear infinite;
    transition: all 0.2s linear;
  }
  
  @keyframes rotBGimg {
    from {
      transform: rotate(0deg);
    }
  
    to {
      transform: rotate(360deg);
    }
  }
  
  .card::after {
    content: '';
    position: absolute;
    background: #D9D9D9;
    ;
    inset: 5px;
    border-radius: 15px;
  }  
  /* .card:hover:before {
    background-image: linear-gradient(180deg, rgb(81, 255, 0), purple);
    animation: rotBGimg 3.5s linear infinite;
  } */
section{
  margin: 10px;
  

}
img{
  max-width: 100%;
  height: auto;
}
  
.pc{
  padding: 19px;
  
}
.study{
  padding: 19px;
  grid-column: 2/8;
}
.item-11{

  grid-column: 1/4;
    justify-content: center;
    text-align: left;
    margin: 0px;
}
.containerf {
  max-width: 1200px;
  margin: 0 auto;
  padding: 20px;
}
.circle-img {
  display: inline-block;
  border-radius: 50%;
  padding: 5px;
  background: #D9D9D9;
  box-shadow: 0 3px 10px rgb(0 0 0 / 0.2);
}
.circle-img img {
  width: 100px;
  height: 100px;
}
.footer-desc {
  display: inline-block;
  vertical-align: top;
  margin-left: 20px;
}

section {
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
    }
    .grid-containerS {
      width: 100%;
    }

    .button-container {
      display: flex;
      flex-direction: column;
      align-items: center;
      padding: 60px;
      overflow: hidden;
      border-radius: 20px;
      box-shadow: 0 3px 10px rgb(0 0 0 / 0.2);
      padding: 14px;
      background-color: #D9D9D9;
    }

    .button-container button {
      margin-bottom: 10px;
      background-color: #D9D9D9;
      border: none;
      border-radius: 5px;
      padding: 10px;
      cursor: pointer;
    }
    .button-container button:hover {
      background-color: #A9A9A9; /* Couleur différente au survol */
    }
    .button-container button:focus {
      outline: none; /* Supprime la bordure de focus par défaut */
      background-color: #A9A9A9; /* Couleur différente pour le focus */
    }
    form {
      max-width: 400px;
      margin: 20px auto;
    }

    label {
      display: block;
      margin-bottom: 8px;
    }

    input {
      width: 100%;
      padding: 8px;
      margin-bottom: 16px;
      box-sizing: border-box;
    }

    .buttonForm {
      background-color: #A9A9A9;
      color: #3C3C3E;
      padding: 10px 15px;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }



  </style>
  <title>Supprimer Ticket</title>
</head>
<body>
  
  <nav class="container-fluid" style="box-shadow: 0 3px 10px rgb(0 0 0 / 0.2);padding: 4px;">
    <div class="grid-container">
      <div class="item-1" style="color: aliceblue;">
      <div class="card">
        <a target="_self" href="index.html">
          <div class="card">
            <img src="logo.png" alt="logo" style="width: auto; z-index: 1; height: auto;">
          </div>
        </a>
      </div>
    </div>
      <div class="item-22 navbar" style="justify-self:baseline;">
        <ul  style="list-style-type: none; text-decoration: none; align-items: center;">
            <li style="display: inline-block; ;"><a href="espace ticket.html">Espace Ticket</a></li>
            <li style="display: inline-block;"><a href="espace client.html">Esapce Client</a></li>
            <li style="display: inline-block;"><a href="espace film.html">Espace Film</a></li>
        </ul>
      </div>
      <div class="item-3 navbar ">
        <ul style=" text-decoration: none; list-style-type: none; ">
          <li style="display: inline-block;">
            <a target="_self" href="#contact">
              Contact
            </a>
          </li>
         
        </ul>
      </div>
      <div class="item-4 navbar " style="justify-self: baseline;">
        <ul style=" text-decoration: none; list-style-type: none; ">
          <li style="display: inline-block;">
            <a target="_blank" class="" href="https://www.facebook.com">
              <img src="Facebook.svg" alt="facebook-icon">
            </a>
          </li>
          <li style="display: inline-block;">
            <a target="_blank" href="https://instagram.com/">
              <img src="Instagram.svg" alt="instagram-icon">
            </a>
          </li>
         
        </ul>
      </div>
    </div>
</nav> 
<section style="width: 100%;">
    <div class="grid-containerS container p-2">
        <div class="button-container">
            <h4>Ticket Supprimé avec Succées  </h4>
            <form action="supprimer ticket.jsp" method="post">
                
                <label for="idticket">Donner ID Ticket:</label>
                <input type="text" id="idticket" name="idticket" required>
    
                <button  type="submit">Supprimer Ticket</button>
              </form>
        </div>
      </div>
</section>
    <%
    String idticket = request.getParameter("idticket");
  
    String requette="delete from ticket where idticket="+idticket;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion?useSSL=false", "root", "admin");
        Statement St = connection.createStatement();
        St.executeUpdate(requette);
    } catch (Exception e) {
        System.out.println(e.toString());
    }
 %>
<footer>
  <div class="container-fluid" id="contact"  style="box-shadow: 0 3px 10px rgb(0 0 0 / 0.2);padding: 4px;">
    <div style="margin: 0px auto; padding: 13px; display: flex; width: 30%;">
      <div class="circle-img">
        <img src="logo.png" alt="Contact" style="width: 100%;">
      </div>
      <div class="footer-desc">
        <h3>Contactez-nous</h3>
        <p>+216 99535357</p>
        <p>cinemaelcorniche@gmail.com</p>
      </div>
        </div>
    </div>
</footer>
</body>
</html>