
<%@ taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="author" content="prosper">
        <meta charset="UTF-8">
        <title>Coming Soon - Movie Buff</title>
        <link rel="stylesheet" href="fonts/font-awesome.min.css" />
        <link rel="stylesheet" href="css/tar.css"/>
        <link rel="stylesheet" href="css/linearicons.css">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="css/magnific-popup.css">
        <link rel="stylesheet" href="css/nice-select.css">
        <link rel="stylesheet" href="css/main.css">
    </head>
    <body>

        <!-- Start Header Area -->
        <header class="default-header">
            <nav class="navbar navbar-expand-lg navbar-light">
                <div class="container">
                    <a class="navbar-brand" href="home.jsp">
                        <h3 style="color: white;">Movie Buff Entertainment</h3>
                    </a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="fa fa-bars"></span>
                    </button>

                    <div class="collapse navbar-collapse justify-content-end align-items-center" id="navbarSupportedContent">
                        <ul class="navbar-nav navbar-right">
                            <li><a href="home.jsp">Home</a></li>
                            <li><a href="nowShowing.jsp">In Theaters</a></li>
                            <li><a class="active" href="comingSoon.jsp">Coming Soon</a></li>
                            <li><a href="bookTick.jsp">Book Ticket</a></li>
                            <li><a href="contact.jsp">Contact</a></li>
                            <li><a href="profile.jsp"><i class="fa fa-user-circle fa-2x"></i></a></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>
        <!-- End Header Area -->

        <!-- start banner Area -->
        <section class="home-banner-area relative" id="home" data-parallax="scroll" data-image-src="css/images/mib.jpg">
            <div class="overlay-bg overlay"></div>
            <h1 class="template-name"><marquee behavior="scroll" direction="left">Movie Buff</marquee></h1>
            <div class="container">
                <br><br><br><br><br><br><br>
                <div style="float: right !important;" class="row fullscreen">
                    <div class="banner-content col-lg-12">
                        <p>Feel The Movie</p>
                        <h1>
                            4Dx <br>
                            Cinema
                        </h1>
                        <a href="bookTick.jsp" class="primary-btn">Book Ticket</a>
                    </div>
                </div>
            </div>
            <div class="head-bottom-meta">
                <div class="d-flex meta-left no-padding">
                    <a href="#"><span class="fa fa-facebook-f"></span></a>
                    <a href="#"><span class="fa fa-twitter"></span></a>
                    <a href="#"><span class="fa fa-instagram"></span></a>
                </div>
            </div>
        </section>
        <!-- End banner Area -->

        <!-- Start In Theaters Area -->
        <section class="about-area section-gap">
            <div class="container">
                <center><h1>Coming Soon</h1></center><br><br>
                <div class="row feature_inner">
                    <div class="col-lg-3 col-md-6">
                        <div class="feature-item">
                            <div><img src="css/images/mib.jpg" height="244" width="182"/></div>
                            <br>
                            <h4>Men in Black: International</h4>
                            <p>Release Date: July 19, 2019</p>
                            <br>
                            <button data-toggle="modal" data-target="#myModal" class="btn btn-success">Watch Trailer</button><br><br>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-6">
                        <div class="feature-item">
                            <div><img src="css/images/it.jpeg" height="244" width="182"/></div>
                            <br>
                            <h4>IT: Chapter Two</h4><br>
                            <p>Release Date: May 3, 2019</p><br>
                            <button data-toggle="modal" data-target="#myModal2" class='btn btn-success'>Watch Trailer</button><br><br>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="feature-item">
                            <div><img src="css/images/movie5.jpeg" height="244" width="182"/></div>
                            <br>
                            <h4>John Wick: Chapter 3 - Parabellum</h4>
                            <p>Release Date: May 22, 2019</p>
                            <br>
                            <button data-toggle="modal" data-target="#myModal3" class='btn btn-success'>Watch Trailer</button><br><br>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="feature-item">
                            <div><img src="css/images/spider.jpeg" height="244" width="182"/></div>
                            <br>
                            <h4>Spider-Man: Far From Home</h4>
                            <p>Release Date: November 22, 2019</p>
                            <button data-toggle="modal" data-target="#myModal4" class='btn btn-success'>Watch Trailer</button><br><br>
                        </div>
                    </div>
                </div>
                <br><br>
                 <div class="row feature_inner">
                    <div class="col-lg-3 col-md-6">
                        <div class="feature-item">
                            <div><img src="css/images/lionKing.jpeg" height="244" width="182"/></div>
                            <br>
                            <h4>The Lion King</h4>
                            <p>Release Date: July 19, 2019</p>
                            <br>
                            <button data-toggle="modal" data-target="#myModal5" class="btn btn-success">Watch Trailer</button><br><br>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-6">
                        <div class="feature-item">
                            <div><img src="css/images/movie2.jpeg" height="244" width="182"/></div>
                            <br>
                            <h4>Pokemon: Detective Pikachu</h4>
                            <p>Release Date: May 3, 2019</p>
                            <button data-toggle="modal" data-target="#myModal6" class='btn btn-success'>Watch Trailer</button><br><br>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="feature-item">
                            <div><img src="css/images/aladdin.png" height="244" width="182"/></div>
                            <br>
                            <h4>Aladdin</h4>
                            <p>Release Date: May 22, 2019</p>
                            <br>
                            <button data-toggle="modal" data-target="#myModal7" class='btn btn-success'>Watch Trailer</button><br><br>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="feature-item">
                            <div><img src="css/images/frozen2.jpg" height="244" width="182"/></div>
                            <br>
                            <h4>Frozen 2</h4>
                            <p>Release Date: November 22, 2019</p>
                            <button data-toggle="modal" data-target="#myModal8" class='btn btn-success'>Watch Trailer</button><br><br>
                        </div>
                    </div>
                     <div class="col-lg-3 col-md-6">
                        <div class="feature-item">
                            <div><img src="css/images/joker.jpeg" height="244" width="182"/></div>
                            <br>
                            <h4>Joker</h4>
                            <p>Release Date: November 22, 2019</p>
                            <button data-toggle="modal" data-target="#myModal9" class='btn btn-success'>Watch Trailer</button><br><br>
                        </div>
                    </div>
                     <div class="col-lg-3 col-md-6">
                        <div class="feature-item">
                            <div><img src="css/images/toyStory.jpeg" height="244" width="182"/></div>
                            <br>
                            <h4>Toy Story 4</h4>
                            <p>Release Date: June 22, 2019</p><br>
                            <button data-toggle="modal" data-target="#myModal10" class='btn btn-success'>Watch Trailer</button><br><br>
                        </div>
                    </div>
                     <div class="col-lg-3 col-md-6">
                        <div class="feature-item">
                            <div><img src="css/images/movie1.jpg" height="244" width="182"/></div>
                            <br>
                            <h4>Avengers: End Game</h4>
                            <p>Release Date: April 28, 2019</p><br>
                            <button data-toggle="modal" data-target="#myModal11" class='btn btn-success'>Watch Trailer</button><br><br>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- End In Theaters Area -->

        <!-- start footer Area -->
        <footer class="footer-area section-gap">
            <div class="container">
                <div class="row footer-bottom d-flex justify-content-between">
                    <h4 class="lf">Copyright &copy; 2019 <a href="#">Movie Buff</a> - All Rights Reserved</h4>
                    <div style="clear:both;"></div>
                    <div class="col-lg-4 col-sm-12 footer-social">
                        <a href="#"><i class="fa fa-facebook"></i></a>
                        <a href="#"><i class="fa fa-twitter"></i></a>
                        <a href="#"><i class="fa fa-dribbble"></i></a>
                        <a href="#"><i class="fa fa-linkedin"></i></a>
                    </div>
                </div>
            </div>
        </footer>
        <!-- End footer Area -->

        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/vendor/jquery-2.2.4.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
        crossorigin="anonymous"></script>
        <script src="js/vendor/bootstrap.min.js"></script>
        <script src="js/jquery.ajaxchimp.min.js"></script>
        <script src="js/parallax.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/isotope.pkgd.min.js"></script>
        <script src="js/jquery.nice-select.min.js"></script>
        <script src="js/jquery.magnific-popup.min.js"></script>
        <script src="js/jquery.sticky.js"></script>
        <script src="js/main.js"></script>

        <!-- Modals -->
        <div id="myModal" class="modal fade" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button style="color: #000 !important;" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body">
                        <iframe src="https://www.youtube.com/embed/BV-WEb2oxLk" height="250" width="450"></iframe>
                    </div>
                </div>
            </div>
        </div>
        
        <div id="myModal2" class="modal fade" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button style="color: #000 !important;" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body">
                        <iframe src="https://www.youtube.com/embed/M4_NFYeXVCU" height="250" width="450"></iframe>
                    </div>
                </div>
            </div>
        </div>
        
        <div id="myModal3" class="modal fade" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button style="color: #000 !important;" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body">
                        <iframe src="https://www.youtube.com/embed/pU8-7BX9uxs" height="250" width="450"></iframe>
                    </div>
                </div>
            </div>
        </div>
        
        <div id="myModal4" class="modal fade" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button style="color: #000 !important;" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body">
                        <iframe src="https://www.youtube.com/embed/Bqd4rg-2_EM" height="250" width="450"></iframe>
                    </div>
                </div>
            </div>
        </div>
        
        <div id="myModal5" class="modal fade" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button style="color: #000 !important;" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body">
                        <iframe src="https://www.youtube.com/embed/7TavVZMewpY" height="250" width="450"></iframe>
                    </div>
                </div>
            </div>
        </div>
        
        <div id="myModal6" class="modal fade" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button style="color: #000 !important;" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body">
                        <iframe src="https://www.youtube.com/embed/1roy4o4tqQM" height="250" width="450"></iframe>
                    </div>
                </div>
            </div>
        </div>
        
        <div id="myModal7" class="modal fade" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button style="color: #000 !important;" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body">
                        <iframe src="https://www.youtube.com/embed/foyufD52aog" height="250" width="450"></iframe>
                    </div>
                </div>
            </div>
        </div>
        
        <div id="myModal8" class="modal fade" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button style="color: #000 !important;" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body">
                        <iframe src="https://www.youtube.com/embed/eSLe4HuKuK0" height="250" width="450"></iframe>
                    </div>
                </div>
            </div>
        </div>
        
        <div id="myModal9" class="modal fade" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button style="color: #000 !important;" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body">
                        <iframe src="https://www.youtube.com/embed/t433PEQGErc" height="250" width="450"></iframe>
                    </div>
                </div>
            </div>
        </div>
        
        <div id="myModal10" class="modal fade" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button style="color: #000 !important;" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body">
                        <iframe src="https://www.youtube.com/embed/wmiIUN-7qhE" height="250" width="450"></iframe>
                    </div>
                </div>
            </div>
        </div>
        
        <div id="myModal11" class="modal fade" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button style="color: #000 !important;" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body">
                        <iframe src="https://www.youtube.com/embed/0jNvJU52LvU" height="250" width="450"></iframe>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>