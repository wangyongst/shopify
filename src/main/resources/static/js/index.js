$(function () {
    $("#makecarturlbutton").click(function () {
        $.get("/makeurl",
            function (result) {
                if (result.status == 1) {
                    $('#carturl').html(result.data.carturl);
                    $('#bypassurl').html(result.data.bypassurl);
                }
            });
    });
})
