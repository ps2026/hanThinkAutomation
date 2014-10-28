<%@ page contentType="text/html;charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]>	<html class="no-js lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]>	<html class="no-js lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]> <html class="no-js ie9" lang="en"> <!-->
<html lang="en">
<!--<![endif]-->
<head>
<!-- Set the viewport width to device width for mobile -->
<meta name="viewport" content="width=device-width" />
<title>Configuration</title>

<s:include value="/jsps/common/head.jsp" />

</head>
<body>
	<header id="brand">
		<div class="container">
			<div class="row">
				<div class="appname hide-on-phones"></div>
			</div>
		</div>
	</header>
	<s:include value="/jsps/common/brand.jsp" />
	<s:include value="/jsps/common/menu.jsp" />
	<section class="mainbg">
		<div class="container">
			<div class="row">
				<div class="six columns">
					<div class="app-wrapper ui-corner-top">
						<div class="blue module ui-corner-top clearfix">
							<h2>欧尚自动化任务配置</h2>
						</div>
						<div class="content">
							<div class="panel">
								<div class="row">
								<label>任务名称（可选）</label> <input type="text" class="addon-postfix" data-bind="value : name" />
							</div>
							<div class="row">
								<label>存储数据客户端IP</label> <input type="text" class="addon-postfix" data-bind="value : clientIp" />
							</div>
							<div class="row">
								<div class="five columns">
									<label>每天的开始抓取时间</label> <input type="text" class="addon-postfix" data-bind="value : start" />
								</div>
								<div class="five columns">
									<label>每天的抓取截止时间</label> <input type="text" class="addon-postfix" data-bind="value : stop" />
								</div>
								<div class="two columns">
									<label>间隔(Hour)</label> <input type="text" class="addon-postfix" data-bind="value : interval" />
								</div>
							</div>
							<div class="row">
								<div class="six columns">
									<label>上一次抓取的开始时间</label> <input type="text" disabled="disabled" data-bind="value : lastGrabStart" />
								</div>
								<div class="six columns">
									<label>上一次抓取的结束时间</label> <input type="text" disabled="disabled" data-bind="value : lastGrabEnd" />
								</div>
							</div>
							</div>
							<div class="row">
								<div class="twelve columns centered">
									<a class="small blue button" href="#" data-bind="click : save">保存</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="six columns">
					<div class="app-wrapper ui-corner-top">
						<div class="blue module ui-corner-top clearfix">
							<h2>欧尚手动抓取</h2>
						</div>
						<div class="content">
							<div class="row">
								<div class="six columns">
									<label>开始时间</label> <input type="text" class="addon-postfix" data-bind="datepicker : {showSecond : true, dateFormat : 'yy-mm-dd',stepHour : 1,stepMinute : 1,stepSecond : 1, onClose : startDateOnClose}, value : manuallyStart" />
								</div>
								<div class="six columns">
									<label>结束时间</label> <input type="text" class="addon-postfix" data-bind="datepicker : {showSecond : true, dateFormat : 'yy-mm-dd',stepHour : 1,stepMinute : 1,stepSecond : 1, onClose : endDateOnClose}, value : manuallyStop" />
								</div>
							</div>
							<br>
							<div class="row">
								<a class=" blue button" href="#" data-bind="click : startManually">开始抓取</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<s:include value="/jsps/common/footer.jsp" />
	<script src="/ls/js/User.js"></script>
	<script src="/ls/js/knockout-jqueryui.min.js"></script>
	<script>
		$(document).ready(function() {

			var ConfigurationModel = function() {
				var self = this;
				self.name = ko.observable('');
				self.clientIp = ko.observable('');
				self.start = ko.observable('');
				self.stop = ko.observable('');
				self.interval = ko.observable('');
				self.lastGrabStart = ko.observable('');
				self.lastGrabEnd = ko.observable('');
				self.manuallyStart = ko.observable('');
				self.manuallyStop = ko.observable('');
				self.save = function() {
					
				};
				
				self.startManually = function() {
					$.ajax({
						data : { manuallyStart: self.manuallyStart(), manuallyStop : self.manuallyStop()},
						url : '/ls/startManually.ls',
						success : function(data) {
							alert(data);
						},
						error : function() {
							
						}
					});
				};
				self.startDateOnClose = function() {
					
				};
				
				self.endDateOnClose = function() {
					
				};
			};

			var model = new ConfigurationModel();
			ko.applyBindings(model);
		});
	</script>
</body>
</html>
