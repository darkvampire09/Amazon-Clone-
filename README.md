# Amazon-Clone-
The amazon clone using only HTML &amp; CSS
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Amazon Clone </title>
  <style>
    * {
    margin: 0;
    border: border-box;
    font-family: Arial, Helvetica, sans-serif;
    
    background-size: cover;
}

.navbar {
    height: 60px;
    background-color: #0f1111;
    color: white;
    display: flex;
    align-items: center;
    justify-content: space-evenly;
} 

.logo {
    background-image: url("lg.png");
    height: 48px;
    width: 160px;
    background-size: cover;

}

.nav-logo {
    height: 45px;
    width: 160px;
}

.border {
    border: 1.5px solid transparent;
    padding: 2.5px;
}

.border:hover {
    border: 1.5px solid whitesmoke;
}

/*first box*/
.address {
    color: #cccccc;
    font-size: 0.85rem;
    margin-left: 19px;
}

/* second box */
.loc {
    display: flex;
}

/*  third box */
.navsearch {
    display: flex;
    justify-content: space-evenly;
    width: 640px;
    height: 50px;
    background-color: rgb(184, 148, 154);
    border: radius 1px; ;



}
.navsearch:hover{
    border: 2px solid orange;
}

.Search {
    width: 100%;
    font-size: 1rem;
    border: none;

    background-color: #c2bdc2;

}

#select {
    border-top-left-radius: 4px;
    border-bottom-left-radius: 4px;
    border: none;
    background-color: #f3f3f3;
    width: 50px;
    text-align: center;
}

/* search icon*/
.search-icon {
    width: 45px;
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: 1.3rem;
    background-color: #f5a63f;
    border-top-right-radius: 4px;
    border-bottom-right-radius: 4px;
    color: #0f1111;
}
span{
    font-size: 0.7rem;
}

.acc-li{
    font-size: 0.85rem;
    font-weight: 700;
}
/* cart*/
.cart i{
font-size: 28px;
}
.cart {
font-size: 0.85rem;
font-weight: 700;
}
/* second panel*/
.panel
{
    display: flex;
    background-color: #0f1111;
    opacity: .95;
    height: 40px;
    color: white;
    align-items: center;
    justify-content: space-evenly;
}
.panel-ops p{
display: inline;
font-size: .85rem;

margin: 15px;

}
.panel-ops {
display: inline;
width: 70%;

}
.panel-deals{
    font-size: .95rem;
    font-weight: 700;
}
.hero-section{
    background-image: url("bgi.jpg");
    height: 380px;

    background-size: cover;
    display: flex;
     
     justify-content: center;
     align-items: center;
     align-items: end;
}
.hero-msg{
    height: 40px;
    background-color: #ffffff;
    color: #0f1111;
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: .9rem;
    width: 80%;
    margin-bottom: 30px;
}
.hero-msg a{
    color: #007185;
}

.shop{
    display: flex;
     justify-content: space-evenly;
     background-color: #e2e7e6;
     flex-wrap: wrap;
     
}
    
.box{
    height: 310px;
    
    width: 23%;
    background-color: #fff;
    padding: 20px 0px 15px;
    margin-top: 10px;
    background-size: cover;
   
}
 a{
    text-decoration: none;
}
a:hover{
    background-color: rgb(134, 221, 255);
    
}
.game{
    height: 250px;
   
    background-size: cover;
    background-repeat: no-repeat;
    margin-top: 0.75rem;
    margin-bottom: 0.75rem;
    
}
.box-1 p{
    color: #007185;
}

.box-1{
    justify-content: last baseline;
     margin-left: 20px;
    margin-right: 20px;
}

  </style>
</head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/7.0.0/css/all.min.css" />
<link rel="stylesheet" href="amazon.css">

<body>
  <header>
    <div class="navbar">
      <div class="nav-logo border">
        <div class="logo"></div>
      </div>
      <div class="navadd border">
        <p class="address">Deliver To</p>
        <div class="loc">
          <i class="fa solid fa-location-dot"></i>
          <p class="country">INDIA</p>
        </div>
      </div>
      <div class="navsearch">
        <select name="" id="select">
          <option value="">all</option>
        </select>
        <input placeholder="Search Amazon" class="Search" />
        <div class="search-icon">
          <i class="fa solid fa-magnifying-glass"></i>
        </div>
      </div>
      <div class="sign-in border">
        <p><span>Hello Sign in</span></p>
        <p class="acc-li">Accounts & Lists</p>
      </div>
      <div class="sign-in border">
        <p><span>Return</span></p>
        <p class="acc-li">Returns & Orders</p>
      </div>
      <div class="cart border"><i class="fa-solid fa-cart-shopping "></i>
        Cart</div>





    </div>
    <div class="panel ">



      <div class="all-panels border ">
        <i class="fa-solid fa-bars"></i>

        ALL
      </div>
      <div class="panel-ops ">
        <p>Todays deals</p>
        <p>Customer Service</p>
        <p>Registery</p>
        <p>Gifts & Cards</p>
        <p>SALE</p>
      </div>
      <div class="panel-deals border">
        Shop deals in Electronics
      </div>
    </div>

  </header>


  <div class="hero-section">
    <div class="hero-msg">
      <p>you are on amazon. com you can also shop on Amazon India with milions of products with fast local delivery
        <a  href="#">click here to go on amazzon.in</a>
      </p>
    </div>
  </div>
  <div class="shop">
    <div class="box1 box">
      <div class="box-1">
        <h2>Get your Game on</h2>
        <div class="game" style="background-image: url('gm.jpg');"></div>

        <a href="#">See more</a>
      </div>
    </div>
    <!--  next box  starts here -->
    <div class="box1 box">
      <div class="box-1">
        <h2>Monitors</h2>
        <div class="game" style="background-image: url('monitor.jpg');"></div>
        <a href="#">See more</a>
      </div>
    </div>
    <!--  next box  starts here -->
    <div class="box1 box">
      <div class="box-1">
        <h2>Lamps & More</h2>
        <div class="game" style="background-image: url('ls.jpg');"></div>
        <a href="#">See more</a>
      </div>
    </div>
    <!--  next box  starts here -->
    <div class="box1 box">
      <div class="box-1">
        <h2>Keybords & more</h2>
        <div class="game" style="background-image: url('computer\ ace.jpg');"></div>
        <a href="#">See more</a>
      </div>
    </div>
    <!--  next box  starts here -->
    <div class="box1 box">
      <div class="box-1">
        <h2>Perfumes & more</h2>
        <div class="game" style="background-image: url('perfume.png');"></div>
        <a href="#">See more</a>
      </div>
    </div>
    <!--  next box  starts here -->
    <div class="box1 box">
      <div class="box-1">
        <h2>Earbuds </h2>
        <div class="game" style="background-image: url('buds.jpg');"></div>
        <a href="#">See more</a>
      </div>
    </div>
    <!--  next box  starts here -->
    <div class="box1 box">
      <div class="box-1">
        <h2>Pens </h2>
        <div class="game" style="background-image: url('pens.png');"></div>
        <a href="#">See more</a>
      </div>
    </div>
    <!--  next box  starts here -->
    <div class="box1 box">
      <div class="box-1">
        <h2>Bags & more</h2>
        <div class="game" style="background-image: url('bags.png');"></div>
        <a href="#">See more</a>
      </div>
    </div>
    <!--  next box  starts here -->
    <div class="box1 box">
      <div class="box-1">
        <h2>Furniture</h2>
        <div class="game" style="background-image: url('furniture.png');"></div>
        <a href="#">See more</a>
      </div>
    </div>
    <!--  next box  starts here -->
    <div class="box1 box">
      <div class="box-1">
        <h2>Headphones</h2>
        <div class="game" style="background-image: url('headset.jpeg');"></div>
        <a href="#">See more</a>
      </div>
    </div>
    <!--  next box  starts here -->
    <div class="box1 box">
      <div class="box-1">
        <h2>Ac & more</h2>
        <div class="game" style="background-image: url('Ac.jpg');"></div>
        <a href="#">See more</a>
      </div>
    </div>
    <!--  next box  starts here -->
    <div class="box1 box">
      <div class="box-1">
        <h2>helmet</h2>
        <div class="game" style="background-image: url('helmet.jpg');"></div>
        <a href="#">See more</a>
      </div>
    </div>
    <!--  next box  starts here -->
    <div class="box1 box">
      <div class="box-1">
        <h2>Smart Tablet</h2>
        <div class="game" style="background-image: url('smart\ tablet.jpeg');"></div>
        <a href="#">See more</a>
      </div>
    </div>
    <!--  next box  starts here -->
    <div class="box1 box">
      <div class="box-1">
        <h2>Decorationn Items & more</h2>
        <div class="game" style="background-image: url('fv.jpg');"></div>
        <a href="#">See more</a>
      </div>
    </div>
    <!--  next box  starts here -->
    <div class="box1 box">
      <div class="box-1">
        <h2>Smartband</h2>
        <div class="game" style="background-image: url('band.jpeg');"></div>
        <a href="#">See more</a>
      </div>
    </div>
    <!--  next box  starts here -->
    <div class="box1 box">
      <div class="box-1">
        <h2> Alexa</h2>
        <div class="game" style="background-image: url('amazon\ mini.jpeg');"></div>
        <a href="#">See more</a>
      </div>
    </div>
    <!--  next box  starts here -->
    <div class="box1 box">
      <div class="box-1">
        <h2>coutions & covers</h2>
        <div class="game" style="background-image: url('cc.jpg');"></div>
        <a href="#">See more</a>
      </div>
    </div>
    <!--  next box  starts here -->
    <div class="box1 box">
      <div class="box-1">
        <h2>House Decorationn</h2>
        <div class="game" style="background-image: url('hs.jpg');"></div>
        <a href="#">See more</a>
      </div>
    </div>
    <!--  next box  starts here -->

    <!--  next box  starts here -->
    <div class="box1 box">
      <div class="box-1">
        <h2>Prime Set</h2>
        <div class="game" style="background-image: url('amazon_tv.jpeg');"></div>
        <a href="#">See more</a>
      </div>
    </div> <!--  next box  starts here -->
    <div class="box1 box">
      <div class="box-1">
        <h2>Water Purifier</h2>
        <div class="game" style="background-image: url('purify.jpeg');"></div>
        <a href="#">See more</a>
      </div>
    </div>
  </div>
  <script src="amazon.js"></script>
</body>

</html>
