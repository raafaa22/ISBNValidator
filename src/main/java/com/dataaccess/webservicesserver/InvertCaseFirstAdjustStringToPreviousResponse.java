
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
 *         &lt;element name="InvertCaseFirstAdjustStringToPreviousResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "invertCaseFirstAdjustStringToPreviousResult"
})
@XmlRootElement(name = "InvertCaseFirstAdjustStringToPreviousResponse")
public class InvertCaseFirstAdjustStringToPreviousResponse {

    @XmlElement(name = "InvertCaseFirstAdjustStringToPreviousResult", required = true)
    protected String invertCaseFirstAdjustStringToPreviousResult;

    /**
     * Obtiene el valor de la propiedad invertCaseFirstAdjustStringToPreviousResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvertCaseFirstAdjustStringToPreviousResult() {
        return invertCaseFirstAdjustStringToPreviousResult;
    }

    /**
     * Define el valor de la propiedad invertCaseFirstAdjustStringToPreviousResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvertCaseFirstAdjustStringToPreviousResult(String value) {
        this.invertCaseFirstAdjustStringToPreviousResult = value;
    }

}
