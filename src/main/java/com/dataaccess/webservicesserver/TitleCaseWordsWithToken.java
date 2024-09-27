
package com.dataaccess.webservicesserver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "sText",
    "sToken"
})
@XmlRootElement(name = "TitleCaseWordsWithToken")
public class TitleCaseWordsWithToken {

    @XmlElement(required = true)
    protected String sText;
    @XmlElement(required = true)
    protected String sToken;

    /**
     * Obtiene el valor de la propiedad sText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSText() {
        return sText;
    }

    /**
     * Define el valor de la propiedad sText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSText(String value) {
        this.sText = value;
    }

    /**
     * Obtiene el valor de la propiedad sToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSToken() {
        return sToken;
    }

    /**
     * Define el valor de la propiedad sToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSToken(String value) {
        this.sToken = value;
    }

}
