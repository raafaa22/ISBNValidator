
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
 *         &lt;element name="TitleCaseWordsWithTokenResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "titleCaseWordsWithTokenResult"
})
@XmlRootElement(name = "TitleCaseWordsWithTokenResponse")
public class TitleCaseWordsWithTokenResponse {

    @XmlElement(name = "TitleCaseWordsWithTokenResult", required = true)
    protected String titleCaseWordsWithTokenResult;

    /**
     * Obtiene el valor de la propiedad titleCaseWordsWithTokenResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleCaseWordsWithTokenResult() {
        return titleCaseWordsWithTokenResult;
    }

    /**
     * Define el valor de la propiedad titleCaseWordsWithTokenResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleCaseWordsWithTokenResult(String value) {
        this.titleCaseWordsWithTokenResult = value;
    }

}
