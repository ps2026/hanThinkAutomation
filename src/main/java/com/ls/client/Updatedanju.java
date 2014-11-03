
package com.ls.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wangka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dengluming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denglumima" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zhangtaoming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jisuanjiming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xiugaidss" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="czzhubiao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zhubiaoid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="czlx" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="qdshijian" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="czzibiao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="czzijibiao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cup",
    "wangka",
    "dengluming",
    "denglumima",
    "zhangtaoming",
    "jisuanjiming",
    "mk",
    "xiugaidss",
    "czzhubiao",
    "zhubiaoid",
    "czlx",
    "qdshijian",
    "czzibiao",
    "czzijibiao"
})
@XmlRootElement(name = "updatedanju")
public class Updatedanju {

    protected String cup;
    protected String wangka;
    protected String dengluming;
    protected String denglumima;
    protected String zhangtaoming;
    protected String jisuanjiming;
    protected String mk;
    protected byte[] xiugaidss;
    protected String czzhubiao;
    protected int zhubiaoid;
    protected int czlx;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar qdshijian;
    protected String czzibiao;
    protected String czzijibiao;

    /**
     * Gets the value of the cup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCup() {
        return cup;
    }

    /**
     * Sets the value of the cup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCup(String value) {
        this.cup = value;
    }

    /**
     * Gets the value of the wangka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWangka() {
        return wangka;
    }

    /**
     * Sets the value of the wangka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWangka(String value) {
        this.wangka = value;
    }

    /**
     * Gets the value of the dengluming property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDengluming() {
        return dengluming;
    }

    /**
     * Sets the value of the dengluming property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDengluming(String value) {
        this.dengluming = value;
    }

    /**
     * Gets the value of the denglumima property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenglumima() {
        return denglumima;
    }

    /**
     * Sets the value of the denglumima property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenglumima(String value) {
        this.denglumima = value;
    }

    /**
     * Gets the value of the zhangtaoming property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZhangtaoming() {
        return zhangtaoming;
    }

    /**
     * Sets the value of the zhangtaoming property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZhangtaoming(String value) {
        this.zhangtaoming = value;
    }

    /**
     * Gets the value of the jisuanjiming property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJisuanjiming() {
        return jisuanjiming;
    }

    /**
     * Sets the value of the jisuanjiming property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJisuanjiming(String value) {
        this.jisuanjiming = value;
    }

    /**
     * Gets the value of the mk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMk() {
        return mk;
    }

    /**
     * Sets the value of the mk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMk(String value) {
        this.mk = value;
    }

    /**
     * Gets the value of the xiugaidss property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getXiugaidss() {
        return xiugaidss;
    }

    /**
     * Sets the value of the xiugaidss property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setXiugaidss(byte[] value) {
        this.xiugaidss = value;
    }

    /**
     * Gets the value of the czzhubiao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCzzhubiao() {
        return czzhubiao;
    }

    /**
     * Sets the value of the czzhubiao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCzzhubiao(String value) {
        this.czzhubiao = value;
    }

    /**
     * Gets the value of the zhubiaoid property.
     * 
     */
    public int getZhubiaoid() {
        return zhubiaoid;
    }

    /**
     * Sets the value of the zhubiaoid property.
     * 
     */
    public void setZhubiaoid(int value) {
        this.zhubiaoid = value;
    }

    /**
     * Gets the value of the czlx property.
     * 
     */
    public int getCzlx() {
        return czlx;
    }

    /**
     * Sets the value of the czlx property.
     * 
     */
    public void setCzlx(int value) {
        this.czlx = value;
    }

    /**
     * Gets the value of the qdshijian property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQdshijian() {
        return qdshijian;
    }

    /**
     * Sets the value of the qdshijian property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQdshijian(XMLGregorianCalendar value) {
        this.qdshijian = value;
    }

    /**
     * Gets the value of the czzibiao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCzzibiao() {
        return czzibiao;
    }

    /**
     * Sets the value of the czzibiao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCzzibiao(String value) {
        this.czzibiao = value;
    }

    /**
     * Gets the value of the czzijibiao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCzzijibiao() {
        return czzijibiao;
    }

    /**
     * Sets the value of the czzijibiao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCzzijibiao(String value) {
        this.czzijibiao = value;
    }

}
