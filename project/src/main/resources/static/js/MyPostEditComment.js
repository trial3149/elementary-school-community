$(document).ready(function () {
	$(".edit-comment").on('click',function () {
       	$('.reply-input').remove();
       	$('.edit-input').remove();
       	console.log($(this).attr('id').substr(16));
       	console.log(document.querySelector(".content-311").innerHTML);
       	const idTag = $('.comment_'+$(this).attr('id').substr(16)).attr("value");
       	const HTML = `<form class="edit-input" action="./MyPostEditCmt" method="post">
													<input type="hidden" name="postId" id="postIdInput" value="`+document.querySelector(".postId-input").value+ `">
       												<input type="hidden" name="commentId" id="commentId" value="`+ $(this).attr('id').substr(16) +`">
													<input type="hidden" name="memberId" id="memberId" value="`+idTag+ `">
													<textarea name="comment" rows="3" cols="100%">${document.querySelector(".content-"+$(this).attr('id').substr(16)).innerHTML}</textarea>
													<button type="submit" class="common_input_btn reply btn btn-outline-primary" tabindex="0" id="customButton">등록</button>
													<!-- <a href="javascript:void(0);" class="common_input_btn" tabindex="0" id="customButton">등록</a>
												 -->
												</form>`;
       	document.querySelector("#replyBtn"+$(this).attr('id').substr(16)).insertAdjacentHTML("afterend", HTML);
       	
       	
    });
});