<%@page import="bean.ChefDeProjet"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${ empty sessionScope.chefDeProjet}">
		<jsp:forward page="/acceuilClient.jsp"/>
</c:if>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page import="java.sql.*"%>
<%@ page import="java.util.ArrayList"%>
<jsp:useBean id="cpr" class="bean.ChefDeProjet"/>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Session CdP</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">
    <!-- Bootstrap CSS-->
    <link rel="stylesheet" href="vendor2/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome CSS-->
    <link rel="stylesheet" href="vendor2/font-awesome/css/font-awesome.min.css">
    <!-- Fontastic Custom icon font-->
    <link rel="stylesheet" href="css2/fontastic.css">
    <!-- Google fonts - Roboto -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700">
    <!-- jQuery Circle-->
    <link rel="stylesheet" href="css2/grasp_mobile_progress_circle-1.0.0.min.css">
    <!-- Custom Scrollbar-->
    <link rel="stylesheet" href="vendor2/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.css">
    <!-- theme stylesheet-->
    <link rel="stylesheet" href="css2/style.default.css" id="theme-stylesheet">
    <!-- Custom stylesheet - for your changes-->
    <link rel="stylesheet" href="css2/custom.css">
	<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <!-- Favicon-->
    <link rel="shortcut icon" href="img1/Ecommerce Plateform.png">
    <!-- Tweaks for older IEs--><!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
  </head>
  <body>
    <!-- Side Navbar -->
    <nav class="side-navbar">
      <div class="side-navbar-wrapper">
        <!-- Sidebar Header    -->
        <div class="sidenav-header d-flex align-items-center justify-content-center">
          <!-- User Info-->
          <div class="sidenav-header-inner text-center"><!-- <img src="img2/avatar-7.jpg" alt="person" class="img-fluid rounded-circle"> -->
            <h6 class="h6">Chef de Projet : <%= session.getAttribute("id") %></h6><span></span>
          </div>
          <!-- Small Brand information, appears on minimized sidebar-->
          <div class="sidenav-header-logo"><a href="index.html" class="brand-small text-center"> <strong>B</strong><strong class="text-primary">D</strong></a></div>
        </div>
        <!-- Sidebar Navigation Menus-->
       <div class="main-menu">
          <h5 class="sidenav-heading">Main</h5>
          <ul id="side-main-menu" class="side-menu list-unstyled">
          	<li><a href="acceuilChefProjet.jsp" aria-expanded="false"> <i class="icon-interface-windows"></i>Home  </a>
            </li>
          	<li><a href="#exampledropdownDropdown" aria-expanded="false" data-toggle="collapse"> <i class="icon-interface-windows"></i>Demandes  </a>
              <ul id="exampledropdownDropdown" class="collapse list-unstyled ">
                <li><a href="TraiterDemandeAdaptee">Demande Adaptee</a></li>
                <li><a href="TraiterDemandeMaintenance">Demande de Maintenance</a></li>
              </ul>
            </li>  
            <li><a href="ModifierInfoChefProjet" aria-expanded="false" > <i class="icon-interface-windows"></i>Modifier mon compte  </a>
            </li>                
          </ul>
        </div>
      </div>
    </nav>
    <div class="page">
      <!-- navbar-->
      <header class="header">
        <nav class="navbar">
          <div class="container-fluid">
            <div class="navbar-holder d-flex align-items-center justify-content-between">
              <div class="navbar-header"><a id="toggle-btn" href="#" class="menu-btn"><i class="icon-bars"> </i></a><a href="index.html" class="navbar-brand">
                  <div class="brand-text d-none d-md-inline-block"><img src="img1/Ecommerce Plateform.png"
						style="border-radius: 16px; margin-top: 5px;" alt="" width="100"
						height="60"></div></a></div>
                  
              <ul class="nav-menu list-unstyled d-flex flex-md-row align-items-md-center">
                <!-- Log out-->
                <li class="nav-item"><a href="Logout" class="nav-link logout"> <span class="d-none d-sm-inline-block">Logout</span><i class="fa fa-sign-out"></i></a></li>
              </ul>
            </div>
          </div>
        </nav>
      </header>
      <!-- Breadcrumb-->
      <div class="breadcrumb-holder">
        <div class="container-fluid">
          <ul class="breadcrumb">
            <li class="breadcrumb-item"><a href="index.html">Acceuil</a></li>
            <li class="breadcrumb-item active">Demandes       </li>
          </ul>
        </div>
      </div>
      <section>
        <div class="container-fluid">
          <!-- Page Header-->
          <header> 
            <h1 class="h3 display">Demandes adaptèes          </h1>
          </header>
          <div class="row">
            <div class="col-lg-12">
              <div class="card">
                <div class="card-header">
                  <h4>La liste des demandes adaptèes</h4>
                </div>
                <div class="card-body">
                  <div class="table-responsive">
                    <table class="table">
                      <thead>
                        <tr>
                          <th style="text-align:center;">ID</th>
                          <th style="text-align:center;">Sujet</th>
                          <th style="text-align:center;">Action</th>
                          <th style="text-align:center;">Etat de la demande</th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <c:forEach items="${demandesAdaptee}" var="row" >
								  <tr style="text-align:center;">
								  			<td><c:out value="${row.getId_demande_adaptee()}"/></td>
								  			<td><c:out value="${row.getSujet()}"/></td>
								            
                          					<td>
												<!-- Button trigger modal -->
												<button style="margin-left:5px;" type="button" class="btn btn-primary" data-toggle="modal" data-target="#i<c:out value="${row.getId_demande_adaptee()}"/>">
												<i class="fa fa-id-card"></i></button>
												
												<!-- Modal -->
												<div class="modal fade" id="i<c:out value="${row.getId_demande_adaptee()}"/>" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
												  aria-hidden="true">
												  <div class="modal-dialog" role="document">
												  
												    <form action="TraiterDemandeAdaptee" method="post" >
												    <div class="modal-content">
												    
												      <div class="modal-header">
												        <h5 class="modal-title" id="exampleModalLabel">Informations de la demande</h5>
												        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
												          <span aria-hidden="true">&times;</span>
												        </button>
												      </div>
												      <div class="modal-body">
												      			<div class="col-sm-12">
																	<div class="form-group">
																		<input type="text" name="id3" value=<c:out value="${row.getId_demande_adaptee()}"/> class="form-control" hidden>
																	</div>
																</div> 
												      		
																<div class="col-sm-12">
																	<div class="form-group">
																		ID du client : <input type="text"  name="id" value=<c:out value="${row.getClient().getId_client()}"/> class="form-control" disabled>
																	</div>
																</div> 
																
																<div class="col-sm-12">
																	<div class="form-group">
																		Nom du client : <input type="text" name="nom" value=<c:out value="${row.getClient().getNomCLT()}"/> class="form-control" disabled><br>
																	</div>
																</div> 
													      		
													      		<div class="col-sm-12">
																	<div class="form-group">
																		Prénom du client : <input type="text"  name="prenom" value=<c:out value="${row.getClient().getPrenomCLT()}"/> class="form-control" disabled><br>
																	</div>
																</div> 
																
																<div class="col-sm-12">
																	<div class="form-group">
																		<label for="description">Description du problème</label>
																		<textarea id="description" style="width: 440px;height: 150px;" type="text" name="description" class="form-control"><c:out value="${row.getDescription()}"/></textarea>
																	</div>
																</div>
																
																
																
																<div class="col-sm-12">
																	<div class="form-group">
																	Capacité de financement : <input type="text" name="capaciteFinancement" value=<c:out value="${row.getCapaciteFinancement()}"/> class="form-control" disabled><br>
																	</div>
																</div>
													      		
													      		<div class="col-sm-12">
																	<div class="form-group">
																		Consulter le document : <a type="file" name="file" class="form-control" href="downloadAttachment1?id=${row.getId_demande_adaptee()}">Cliquer ici pour télecharger le cahier des charges</a><br>
																	</div>		 
																</div>

																 
																
																<div class="modal-footer">
																	<c:choose>
											   							<c:when test="${row.getEtat()==0}">
																        <a class="form-control" style="color:green" href="AccepterRefuserDemandeAdaptee?id=${row.getId_demande_adaptee()}&type=a">Accepter la demande</a>
																        <a class="form-control" style="color:red" href="AccepterRefuserDemandeAdaptee?id=${row.getId_demande_adaptee()}&type=r">Refuser la demande</a>
																       </c:when>
																       </c:choose>
																        <button type="button" class="btn btn-secondary" data-dismiss="modal">Sortir</button>
													           </div>
												      	
												      		<!-- <c:out value="${row.getDocument_joindre()}"/><br> -->	          
												      </div>
												      
												    </div>
												    </form>
												  </div>
												  
												</div>
					                    </td>
					                    <td style="text-align:center;">
					                        <c:choose>
											   <c:when test="${row.getEtat()==0}">
											   		<div class="alert alert-primary" role="alert">
  														Demande en cours de traitement
  														
													</div>
												</c:when>
											   <c:when test="${row.getEtat()==1}"><div class="alert alert-success" role="alert">
  														Demande acceptée
												</div>
												</c:when> 
											   <c:otherwise><div class="alert alert-danger" role="alert">
 													Demande refusée
												</div>
												</c:otherwise>
											</c:choose>
										</td>
					    	  </tr>   
						  </c:forEach>

                      </tr>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
      <footer class="main-footer">
        <div class="container-fluid">
          <div class="row">
            <div class="col-sm-6">
              <p>E-SOFT &copy; 2019</p>
            </div>
            <div class="col-sm-6 text-right">
              <!-- <p>Design by <a href="https://bootstrapious.com/p/bootstrap-4-dashboard" class="external">Bootstrapious</a></p> -->
              <!-- Please do not remove the backlink to us unless you support further theme's development at https://bootstrapious.com/donate. It is part of the license conditions and it helps me to run Bootstrapious. Thank you for understanding :)-->
            </div>
          </div>
        </div>
      </footer>
    </div>
    <!-- JavaScript files-->
    <script src="vendor2/jquery/jquery.min.js"></script>
    <script src="vendor2/popper.js/umd/popper.min.js"> </script>
    <script src="vendor2/bootstrap/js/bootstrap.min.js"></script>
    <script src="js2/grasp_mobile_progress_circle-1.0.0.min.js"></script>
    <script src="vendor2/jquery.cookie/jquery.cookie.js"> </script>
    <script src="vendor2/chart.js/Chart.min.js"></script>
    <script src="vendor2/jquery-validation/jquery.validate.min.js"></script>
    <script src="vendor2/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js"></script>
    <!-- Main File-->
    <script src="js2/front.js"></script>

  </body>
</html>