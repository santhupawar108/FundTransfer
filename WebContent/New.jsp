<html>
<head>
 <script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.1.1.min.js"></script>


</head>
<body>
<form id="validationform" name="validationform" method="get" action="BG_Form">

<table class="order-list" style="margin-left: 228px;">
    <thead>
        <tr><td>Product</td><td>Price</td><td>Qty</td><td>Total</td></tr>
    </thead>

    <tbody>
        <tr>
            <td><input type="text" name="product"></td>
            <td><input type="text" name="price">
            </td><td><input type="text" name="qty"></td>
            <td><input type="text" readonly="readonly" name="linetotal"></td>
            <td><a class="deleteRow"> x </a></td>
        </tr>
    </tbody>

    <tfoot>
        <tr>
            <td style="text-align: center;" colspan="5">
                <input type="button" value="Add Product" name="addrow" id="addrow">

            </td>
        </tr>

        <tr>
            <td colspan="5">
                Grand Total: Rs<span id="grandtotal"></span>
            </td>
        </tr>
        <tr>
        <td>
        In Words <span id="inworDs" ></span>

        </tr>
        <tr>
                <td>
                <input type="submit"/>

        </tr>
    </tfoot>
</table>

<form>



<script>
    $("#addrow").click(function(){
      var newRow = $("<tr>");
              var cols = "";
              cols += '<td><input type="text" name="product"/></td>';
              cols += '<td><input type="text" name="price"/></td>';
              cols += '<td><input type="text" name="qty"/></td>';
              cols += '<td><input type="text" name="linetotal" readonly="readonly"/></td>';
              cols += '<td><a class="deleteRow"> x </a></td>';
              newRow.append(cols);
        $("table.order-list").append(newRow);
    });

</script>
</body>
</html>