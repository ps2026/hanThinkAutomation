
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
 *         &lt;element name="zhubm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zibm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zhubid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="zibid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="qdshijian" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "zhubm",
    "zibm",
    "zhubid",
    "zibid",
    "qdshijian"
})
@XmlRootElement(name = "danju")
public class Danju {

    protected String cup;
    protected String wangka;
    protected String dengluming;
    protected String denglumima;
    protected String zhangtaoming;
    protected String jisuanjiming;
    protected String mk;
    protected String zhubm;
    protected String zibm;
    protected int zhubid;
    protected int zibid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar qdshijian;

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
     * Gets the value of the zhubm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZhubm() {
        return zhubm;
    }

    /**
     * Sets the value of the zhubm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZhubm(String value) {
        this.zhubm = value;
    }

    /**
     * Gets the value of the zibm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZibm() {
        return zibm;
    }

    /**
     * Sets the value of the zibm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZibm(String value) {
        this.zibm = value;
    }

    /**
     * Gets the value of the zhubid property.
     * 
     */
    public int getZhubid() {
        return zhubid;
    }

    /**
     * Sets the value of the zhubid property.
     * 
     */
    public void setZhubid(int value) {
        this.zhubid = value;
    }

    /**
     * Gets the value of the zibid property.
     * 
     */
    public int getZibid() {
        return zibid;
    }

    /**
     * Sets the value of the zibid property.
     * 
     */
    public void setZibid(int value) {
        this.zibid = value;
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

}
