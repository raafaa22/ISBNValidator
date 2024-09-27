
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
 *         &lt;element name="sAString" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "saString"
})
@XmlRootElement(name = "InvertCaseFirstAdjustStringToCurrent")
public class InvertCaseFirstAdjustStringToCurrent {

    @XmlElement(name = "sAString", required = true)
    protected String saString;

    /**
     * Obtiene el valor de la propiedad saString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAString() {
        return saString;
    }

    /**
     * Define el valor de la propiedad saString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAString(String value) {
        this.saString = value;
    }

}
