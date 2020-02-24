

function post() {
    var questionId = $("#question_id").val();
    var content = $("#comment_content").val();
    $.ajax({
        type:"POST",
        url:"/comment",
        contentType: 'application/json',
        data: JSON.stringify({
            "parentId": questionId,
            "content":  content,
            "type": 1
        }),
        success:function (responsen) {
           if (responsen.code ==200){
               $("#comment_section").hide();
           }else{
               alert(responsen.message);
           }
           console.log(responsen);
        },
        dataType: "json"
    });
}