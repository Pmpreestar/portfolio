

function bigImg(x) {
    x.style.height = "400px";
    x.style.width = "400px";
}

function normalImg(x) {
    x.style.height = "300px";
    x.style.width = "300px";
}

function openNav() {
    document.getElementById("mySidenav").style.width = "200px";
    document.getElementById("main").style.marginLeft = "200px";
    document.body.style.backgroundColor = "rgb(102, 163, 255)";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
    document.getElementById("main").style.marginLeft = "0";
    document.body.style.backgroundColor = "white";
}

$(document).ready(function() {
    openNav()

    var myIndex = 0;

    function carousel() {
        var i;
        var x = document.getElementsByClassName("mySlides2");
        for (i = 0; i < x.length; i++) {
            x[i].style.display = "none";
        }
        myIndex++;
        if (myIndex > x.length) {
            myIndex = 1
        }
        x[myIndex - 1].style.display = "block";
        setTimeout(carousel, 2000); 
    }


    carousel();


});

$(document).ready(function() {
    openNav()

    var myIndex2 = 0;

     function carousel2() {
        var i;
        var x = document.getElementsByClassName("mySlides");
        for (i = 0; i < x.length; i++) {
            x[i].style.display = "none";
        }
        myIndex2++;
        if (myIndex2 > x.length) {
            myIndex2 = 1
        }
        x[myIndex2 - 1].style.display = "block";
        setTimeout(carousel2, 2000); 
    }


    carousel2();
});


$(document).ready(function() {
    openNav()

    var myIndex3 = 0;

     function carousel3() {
        var i;
        var x = document.getElementsByClassName("mySlides3");
        for (i = 0; i < x.length; i++) {
            x[i].style.display = "none";
        }
        myIndex3++;
        if (myIndex3 > x.length) {
            myIndex3 = 1
        }
        x[myIndex3 - 1].style.display = "block";
        setTimeout(carousel3, 2000); 
    }


    carousel3();
});


