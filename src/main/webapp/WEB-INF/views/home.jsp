<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Hotel - ${title}</title>

<!-- Bootstrap Core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- Custom CSS -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>
<div class="search-background">
        <img src="${images}/hotel1.jpg">
    </div>
    <div class="well-searchbox">
        <form action="${pageContext.request.contextPath}/" method="POST" class="form-horizontal" role="form">
            <div class="form-group">
                <label class="col-md-4 control-label">Region ID</label>
                <div class="col-md-8">
                    <input name="regionID" type="text" class="form-control" placeholder="United States of America">
                </div>
            </div>

            <div class="form-group">
                <label class="col-md-4 control-label">City</label>
                <div class="col-md-8">
                    <input name="destinationCity" type="text" class="form-control" placeholder="Miami">
                </div>
            </div>


            <div class="form-group">
                <label class="col-md-4 control-label">Start date</label>
                <div class="col-md-8">
                    <input name="minTripStartDate" type="text" class="form-control" placeholder="format: :2017-05-03">
                </div>
            </div>

            <div class="form-group">
                <label class="col-md-4 control-label">length Of Stay</label>
                <div class="col-md-8">
                    <input name="lengthOfStay" type="text" class="form-control" placeholder="10">
                </div>
            </div>
            
            <div class="form-group">
                <label class="col-md-4 control-label">Rating</label>
                <div class="col-md-8">
                    <input name="maxStarRating" type="text" class="form-control" placeholder="3.5">
                </div>
            </div>

            <div class="col-sm-offset-4 col-sm-5">
                <button type="submit" class="btn btn-success">Search</button>
            </div>
        </form>
    </div>
    <br>
    <div class="container-fluid">
        <ul class="list-group">
        <c:forEach items="${hotels}" var="hotel">
            <li class="list-group-item">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4>${hotel.destination.longName}</h4>
                    </div>
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-md-1">
                                <img src="${hotel.hotelInfo.hotelImageUrl}" alt="" class="img-rounded img-responsive" />
                            </div>
                            <div class="col-md-11">
                                <h4>${hotel.hotelInfo.hotelName} <small><cite title="San Francisco, USA"> ${hotel.hotelInfo.hotelLongDestination} <i class="glyphicon glyphicon-map-marker"></i></cite></small></h4>
                                
                                <p>
                                    <i class="glyphicon glyphicon-asterisk"></i> ${hotel.destination.province}<br>
                                    <i class="glyphicon glyphicon-road"></i> ${hotel.hotelInfo.hotelStreetAddress}<br>
                                    <i class="glyphicon glyphicon-globe"></i><a href="${hotel.hotelUrls.hotelInfositeUrl}"> Hotel Site</a><br>
                                    <i class="fa fa-usd" style="font-size:18px"></i> ${hotel.hotelPricingInfo.originalPricePerNight} ${hotel.hotelPricingInfo.currency} Per Night<br>
                                    <i class="glyphicon glyphicon-star"></i> ${hotel.hotelInfo.hotelStarRating}<br>
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="panel-footer text-center">
                    	<div class="row">
                    <div class="col-md-3">
                    </div>
                    <div class="col-md-2">
                        <div class="form-group row">
                            <label for="staticEmail" class="col-form-label">Start Date</label>
                            <div>
                                <label class="text-center">${hotel.offerDateRange.travelStartDate[0]} - ${ hotel.offerDateRange.travelStartDate[1]} - ${ hotel.offerDateRange.travelStartDate[2]}</label>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-2">
                        <div class="form-group row">
                            <label for="inputPassword" class="col-form-label">End Date</label>
                            <div>
                                <label class="text-center">${hotel.offerDateRange.travelEndDate[0]} - ${hotel.offerDateRange.travelEndDate[1]} - ${hotel.offerDateRange.travelEndDate[2]}</label>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-2">
                        <div class="form-group row">
                            <label for="inputPassword" class="col-form-label">length Of Stay</label>
                            <div>
                                <label class="text-center">${hotel.offerDateRange.lengthOfStay}</label>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3">
                    </div>
                </div>
                    </div>
                </div>
            </li>
            </c:forEach>
        </ul>
    </div>
<!-- jQuery -->
<script src="${js}/jquery.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="${js}/bootstrap.min.js"></script>
<!-- Self coded javascript -->
<script src="${js}/myapp.js"></script>
</body>

</html>