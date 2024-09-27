
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
 *         &lt;element name="LowercaseWordsWithTokenResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "lowercaseWordsWithTokenResult"
})
@XmlRootElement(name = "LowercaseWordsWithTokenResponse")
public class LowercaseWordsWithTokenResponse {

    @XmlElement(name = "LowercaseWordsWithTokenResult", required = true)
    protected String lowercaseWordsWithTokenResult;

    /**
     * Obtiene el valor de la propiedad lowercaseWordsWithTokenResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowercaseWordsWithTokenResult() {
        return lowercaseWordsWithTokenResult;
    }

    /**
     * Define el valor de la propiedad lowercaseWordsWithTokenResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowercaseWordsWithTokenResult(String value) {
        this.lowercaseWordsWithTokenResult = value;
    }

}
