/**
 * 
 */
$(document).ready(function () {
    allHide();
    $('.bulkMail').hide();
	$('.sendBulkSMS').hide();
});

let getDropdown  = () => fetch('https://raw.githubusercontent.com/xworkzodc/newsfeed/master/mailSender.json').then(data => data.json());

async function getDropdownDetails(stringValue){
	var data=await getDropdown();
	if(stringValue == "NewsFeed"){
		$("#imgURL").attr("value",data.News_Feed);
		$("#newsImg").attr("src",data.News_Feed).load(function(){
		    this.width; 
		});

// $('#imgURL').val(data.News_Feed);
		}
	if(stringValue == "Birthday"){
		$("#imgURL1").attr("value",data.Birthday);
		$("#newsImg1").attr("src",data.Birthday).load(function(){
		    this.width; 
		});

// $('#imgURL').val(data.Birthday);
	}
}

function changeMsgType()
{
	$('#msgTypeChng').val($('#mailType').val());
}

function getMessageType() {
	
    if ($('#messageDetail').val() == '0') {
        allHide();
    }
    if ($('#messageDetail').val() == '1') {
        allHide();
        getDropdownDetails("NewsFeed");
        $('.newsFeed').show();
    }
    if ($('#messageDetail').val() == '2') {
        allHide();
        $('.newJoiner').show();
    }
    if ($('#messageDetail').val() == '3') {
        allHide();
        $('.feesPayment').show();
    }
    if ($('#messageDetail').val() == '4') {
        allHide();
        getDropdownDetails("Birthday");
        $('.birthday').show();
    }
    if ($('#messageDetail').val() == '5') {
        allHide();
        $('.courseContent').show();
    }
}

function getListDetails() {
    $.ajax({
        type: "get",
        url: "getListDetails.do?msgType="+$('#mailType').val(),
        dataType: 'json',
        success: function (response) {
            var htmlTable = "";
            for (i = 0; i < response.lists.length; i++) {
                htmlTable = htmlTable + "<tr><td>" + (i + 1) +
                    "</td><td>" + response.lists[i].name +
                    "</td><td>" +
                    response.lists[i].stats.member_count +
                    "</td><td>" +
                    response.lists[i].permission_reminder +
                    "</td></tr>"
            }
            $('.listBody').empty();
            $('.listBody').append(htmlTable);
        }
    });
}

function allHide() {
    $('.newsFeed').hide();
    $('.newJoiner').hide();
    $('.feesPayment').hide();
    $('.birthday').hide();
    $('.courseContent').hide();
    
}


$(".newsFeed").ready(function () {
    $('input[type]').focusout(function (event) {
        $(this).valid();
    });
    $(".newsFeed").validate({
        rules: {
            subName: {
                required: true,
            },
            listName: {
                required: true
            },
            imageURL: {
                required: true
            },
            dynamicNews: {
                required: true
            }
        },
        messages: {
            subName: "Please Enter Subject Name",
            listName: "Please Enter List Name",
            imageURL: "Please Enter Image URL",
            dynamicNews: "Please Enter Dynamic News",
        }
    });
});

$(".newJoiner").ready(function () {
    $('input[type]').focusout(function (event) {
        $(this).valid();
    });
    $(".newJoiner").validate({
        rules: {
            subName: {
                required: true,
            },
            listName: {
                required: true
            },
            courseName: {
                required: true
            },
            
        },
        messages: {
            subName: "Please Enter Subject Name",
            listName: "Please Enter List Name",
            courseName: "Please Enter Course Name", 
        }
    });
});

$(".feesPayment").ready(function () {
    $('input[type]').focusout(function (event) {
        $(this).valid();
    });
    $(".feesPayment").validate({
        rules: {
            subName: {
                required: true,
            },
            listName: {
                required: true
            },
            courseName: {
                required: true
            },
            batchCode: {
                required: true
            },
            dateYear: {
                required: true
            },
            
        },
        messages: {
            subName: "Please Enter Subject Name",
            listName: "Please Enter List Name",
            courseName: "Please Enter Course Name", 
            batchCode:"Please Enter Batch Code",
            dateYear:"Please Enter Date With Year"
        }
    });
});

$(".birthday").ready(function () {
    $('input[type]').focusout(function (event) {
        $(this).valid();
    });
    $('#bithdayQt').focusout(function (event) {
    	$(this).valid();
    });
    $(".birthday").validate({
        rules: {
            subName: {
                required: true,
            },
            listName: {
                required: true
            },
            imageURL: {
                required: true
            },
            birthdayQuotes: {
                required: true,
                
            }
        },
        messages: {
            subName: "Please Enter Subject Name",
            listName: "Please Enter List Name",
            imageURL: "Please Enter Image URL", 
            birthdayQuotes:"Please Enter Birthday Quotes",
        }
    });
});

$(".courseContent").ready(function () {
    $('input[type]').focusout(function (event) {
        $(this).valid();
    });
    $(".courseContent").validate({
        rules: {
            subName: {
                required: true,
            },
            listName: {
                required: true
            },
             courseName: {
                required: true
            },
            startDate: {
                required: true
            },
            time: {
                required: true
            },
            trainerName:{
                required:true
            },
            fees:{
                required:true
            }
        },
        messages: {
            subName: "Please Enter Subject Name",
            listName: "Please Enter List Name",
            courseName: "Please Enter Course Name", 
            startDate: "Please Enter Course Starting Date", 
            time:"Please Enter Time of Class",
            trainerName:"please Enter The Trainer's Name",
            fees:"Please Enter the course Fee"
        }
    });
});

function hideMainTab(){
	$('.bulkMail').hide();
	$('.sendBulkSMS').hide();
}

function clickFunc(className){
	hideMainTab();
	$('.'+className).show();
}