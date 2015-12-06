$ ->
  $.get "/products/read", (products) ->
    $.each products, (index, product) ->
      $("#products").append $("<li>").text product.name