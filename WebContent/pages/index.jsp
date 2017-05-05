<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="en">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>BoxMex</title>
    
    <link rel="shortcut icon" href="<s:url value="/img/boxMexIcon.png"/>">  

    <!-- Bootstrap Core CSS -->
	<link rel="stylesheet" type="text/css" href="<s:url value="/vendor/bootstrap/css/bootstrap.min.css"/>">
    <!-- Custom Fonts -->
    <link rel="stylesheet" type="text/css" href="<s:url value="/vendor/font-awesome/css/font-awesome.min.css"/>">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Plugin CSS -->
    <link rel="stylesheet" type="text/css" href="<s:url value="/vendor/magnific-popup/magnific-popup.css"/>">

    <!-- Theme CSS -->
    <link rel="stylesheet" type="text/css" href="<s:url value="/css/creative.min.css"/>">


</head>

<body id="page-top">

    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand page-scroll" href="#page-top">BoxMex</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a class="page-scroll" href="#about">Zer da hau?</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#services">Zerbitzuak</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#portfolio">Iduriak</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#contact">Kontaktua</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <header>
        <div class="header-content">
            <div class="header-content-inner">
                <h1 id="homeHeading">Ongi etorri BoxMex biltegi kudeatzailera</h1>
                <hr>
                <p>
                	Mondragon Unibertsitatearen eskuz sortutako online biltegi gestioa
                </p>
                <form action="goToLogin">
                	<s:submit value="Saioa hasi" method="execute" class="btn btn-primary btn-xl page-scroll"></s:submit>                
                </form>
            </div>
        </div>
    </header>

    <section class="bg-primary" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">Behar duzuna daukagu!</h2>
                    <hr class="light">
                    <p class="text-faded">
                    	Biltegi bat duzu, baiña ez zara hau kudeatzeko gauza? Ezin duzu barne logistika zuzen bat garatu?
                    	BoxMex biltegi kudeatzaileari esker arazo hauei aurre egiteko gauza izango zara!
                    		
                    </p>
                    <p class="text-faded">Jar zaitez gurekin kontaktuan</p>
                    <a href="#contact" class="page-scroll btn btn-default btn-xl sr-button">Goazen ba!</a>
                </div>
            </div>
        </div>
    </section>

    <section id="services">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Gure enpresan</h2>
                    <hr class="primary">
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-hand-peace-o text-primary sr-icons"></i>
                        <h3>Erraza</h3>
                        <p class="text-muted">Ulertzeko eta erabiltzeko produktu errazak.</p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-language text-primary sr-icons"></i>
                        <h3>Internazionala</h3>
                        <p class="text-muted">Euskera, Ingelesez, Erderaz... Ez dago arazorik!</p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-newspaper-o text-primary sr-icons"></i>
                        <h3>Eguneratua</h3>
                        <p class="text-muted">Dependentzia guztiak eguneratzen ditugu, eguneratuta mantentzeko.</p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-clock-o text-primary sr-icons"></i>
                        <h3>Erantzun denbora</h3>
                        <p class="text-muted">Arazorenbat baduzu bereala gaude bertan!</p>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section class="no-padding" id="portfolio">
        <div class="container-fluid">
            <div class="row no-gutter popup-gallery">
                <div class="col-lg-4 col-sm-6">
                    <a href="<s:url value="/img/portfolio/fullsize/1.jpg"/>" class="portfolio-box">
                        <img src="<s:url value="/img/portfolio/thumbnails/1.jpg"/>" class="img-responsive" alt="">                        
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Kokalekua
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="<s:url value="img/portfolio/fullsize/2.jpg"/>" class="portfolio-box">
                        <img src="<s:url value="/img/portfolio/thumbnails/2.jpg"/>" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Biltegia
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="img/portfolio/fullsize/3.jpg" class="portfolio-box">
                        <img src="<s:url value="/img/portfolio/thumbnails/3.jpg"/>" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Robota
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="img/portfolio/fullsize/4.jpg" class="portfolio-box">
                        <img src="<s:url value="/img/portfolio/thumbnails/4.jpg"/>" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Sistema
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="<s:url value="img/portfolio/fullsize/5.jpg"/>" class="portfolio-box">
                        <img src="<s:url value="/img/portfolio/thumbnails/5.jpg"/>" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Bulegoak
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="<s:url value="img/portfolio/fullsize/6.jpg"/>" class="portfolio-box">
                        <img src="<s:url value="/img/portfolio/thumbnails/6.jpg"/>" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Produktuak
                                </div>                              
                            </div>
                        </div>
                    </a>
                </div>
            </div>
        </div>
    </section>
    
     <aside class="bg-dark">
        <div class="container text-center">
            <div class="call-to-action">
                <h2>Gutaz gehiago jakin nahi?!</h2>
                <a href="http://www.mondragon.edu/es/es" class="btn btn-default btn-xl sr-button">Ikusi hemen!</a>
            </div>
        </div>
    </aside>

    <section id="contact">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">Jar gaitezen harremanetan!</h2>
                    <hr class="primary">
                    <p>Hurrengo proiektua gurekin hasteko prest? Ongi! Deitu edo bidali mezu bat, ahalik eta azkarren erantzuten ahaleginduko gara!</p>
                </div>
                <div class="col-lg-4 col-lg-offset-2 text-center">
                    <i class="fa fa-phone fa-3x sr-contact"></i>
                    <p>123-456-6789</p>
                </div>
                <div class="col-lg-4 text-center">
                    <i class="fa fa-envelope-o fa-3x sr-contact"></i>
                    <p><a href="mailto:contact@boxmex.com">contact@boxmex.com</a></p>
                </div>
            </div>
        </div>
    </section>

    <!-- jQuery -->
    <script src="<s:url value="/vendor/jquery/jquery.min.js"/>"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<s:url value="/vendor/bootstrap/js/bootstrap.min.js"/>"></script>

    <!-- Plugin JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    <script src="<s:url value="/vendor/scrollreveal/scrollreveal.min.js"/>"></script>
    
    <script src="<s:url value="/vendor/magnific-popup/jquery.magnific-popup.min.js"/>"></script>

    <!-- Theme JavaScript -->
    <script src="<s:url value="/js/creative.min.js"/>"></script>

</body>

</html>