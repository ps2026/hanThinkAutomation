<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <daorudanju xmlns="http://HanThink.com/">
      <dengluming>${htUsername}</dengluming>
      <denglumima>${htPassword}</denglumima>
      <zhangtaoming>${htDbName}</zhangtaoming>
      <danjuxml>
      <![CDATA[
<?xml version="1.0" standalone="yes"?>
<NewDataSet>
	<#list orders as order>
	<#assign titleMap = order.orderTitleMap/>
	<xsdingdanzhubiao>
		<danjuleixing>退补单</danjuleixing>
		<id>${titleMap['uuid']}</id>
		<kehudanhao>${titleMap['paperNumber']}</kehudanhao>
		<#if titleMap['orderDate']??>
		<riqi>${titleMap['orderDate']}</riqi>
		<#else>
		<riqi></riqi>
		</#if>
		<changbian>${titleMap['supplierNumber']}</changbian>
		<dizhi>${titleMap['storeNumber']}</dizhi>
		<bianhao></bianhao>
	</xsdingdanzhubiao>
	<#if order.ordersItemList??>
	<#assign productList = order.ordersItemList/>
	<#list productList as product>
	<xsdingdanzibiao>
		<zhubiaoid>${product['uuid']}</zhubiaoid>
		<huohao>${product['productNumber']}</huohao>
		<tiaoxingma>${product['barCode']}</tiaoxingma>
		<shangpinmiaoshu>${product['description']}</shangpinmiaoshu>
		<shuliang>${product['count']}</shuliang>
		<tiaoqianjinjia>${product['beforePrice']}</tiaoqianjinjia>
		<tiaoqianjine>${product['beforeMonyAmountWithTax']}</tiaoqianjine>
		<tiaoqianshuijin>${product['beforeTax']}</tiaoqianshuijin>
		<tiaohoujinjia>${product['afterPrice']}</tiaohoujinjia>
		<tiaohoujine>${product['afterMonyAmountWithTax']}</tiaohoujine>
		<tiaohoushuijin>${product['afterTax']}</tiaohoushuijin>
		<buhanshuijine>${product['moneyAmountWithoutTax']}</buhanshuijine>
		<hanshuijine>${product['moneyAmount']}</hanshuijine>
		<shuilv>${product['taxRate']}</shuilv>
	</xsdingdanzibiao>
	</#list>
	</#if>
	</#list>
</NewDataSet>      		
		]]>
       </danjuxml>
    </daorudanju>
  </soap:Body>
</soap:Envelope>