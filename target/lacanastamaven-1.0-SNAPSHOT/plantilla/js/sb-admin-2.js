(function($) {
  "use strict"; // Start of use strict

  // Toggle the side navigation
  $("#sidebarToggle, #sidebarToggleTop").on('click', function(e) {
    $("body").toggleClass("sidebar-toggled");
    $(".sidebar").toggleClass("toggled");
    if ($(".sidebar").hasClass("toggled")) {
      $('.sidebar .collapse').collapse('hide');
    };
  });

  // Close any open menu accordions when window is resized below 768px
  $(window).resize(function() {
    if ($(window).width() < 768) {
      $('.sidebar .collapse').collapse('hide');
    };
    
    // Toggle the side navigation when window is resized below 480px
    if ($(window).width() < 480 && !$(".sidebar").hasClass("toggled")) {
      $("body").addClass("sidebar-toggled");
      $(".sidebar").addClass("toggled");
      $('.sidebar .collapse').collapse('hide');
    };
  });

  // Prevent the content wrapper from scrolling when the fixed side navigation hovered over
  $('body.fixed-nav .sidebar').on('mousewheel DOMMouseScroll wheel', function(e) {
    if ($(window).width() > 768) {
      var e0 = e.originalEvent,
        delta = e0.wheelDelta || -e0.detail;
      this.scrollTop += (delta < 0 ? 1 : -1) * 30;
      e.preventDefault();
    }
  });

  // Scroll to top button appear
  $(document).on('scroll', function() {
    var scrollDistance = $(this).scrollTop();
    if (scrollDistance > 100) {
      $('.scroll-to-top').fadeIn();
    } else {
      $('.scroll-to-top').fadeOut();
    }
  });

  // Smooth scrolling using jQuery easing
  $(document).on('click', 'a.scroll-to-top', function(e) {
    var $anchor = $(this);
    $('html, body').stop().animate({
      scrollTop: ($($anchor.attr('href')).offset().top)
    }, 1000, 'easeInOutExpo');
    e.preventDefault();
  });




})(jQuery); // End of use strict
function salir(){
    localStorage.removeItem("token_id");
    var url = 'index.jsp';
    window.location.href = url;   
}


$.fn.serializeFormJSON = function () {
    arrayinputs = [];
    $('input:checkbox:checked, input:radio:checked, \
select option:selected, textarea, input:text,input[type=email],input[type=number],input[type=hidden],input[type=password]', $(this))
        .each(function (i, e) {
            obj = {};
            var elemento = e;
            //  obj.type=$(elemento).attr("type");
            obj.name = $(elemento).attr("name");
            obj.value = $(elemento).val();
            //obj.nodeName=$(elemento)[0].nodeName
            if ($(elemento)[0].nodeName == "OPTION") {
                obj.name = $(elemento).closest("select").attr("name")
                obj.value_text = $(elemento).text();
                obj.type = "select";
            }
            // dir(obj)
            arrayinputs.push(obj);
            if (obj.type == "select") {
                objselecttxt = {}
                objselecttxt.name = obj.name + "_text";
                objselecttxt.value = $(elemento).text()
                arrayinputs.push(objselecttxt)
            }
        })
    objetofinal = {}
    $(arrayinputs).each(function (i, e) {
        objetofinal[(e.name).trim()] = e.value;
    });
    return objetofinal;
}