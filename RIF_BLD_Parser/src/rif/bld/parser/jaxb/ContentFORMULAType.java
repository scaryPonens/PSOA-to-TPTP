//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.14 at 04:18:23 PM GMT-04:00 
//


package rif.bld.parser.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for content-FORMULA.type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="content-FORMULA.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2007/rif#}Atom"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "content-FORMULA.type", propOrder = {
    "atom"
})
public class ContentFORMULAType {

    @XmlElement(name = "Atom", required = true)
    protected Atom atom;

    /**
     * Gets the value of the atom property.
     * 
     * @return
     *     possible object is
     *     {@link Atom }
     *     
     */
    public Atom getAtom() {
        return atom;
    }

    /**
     * Sets the value of the atom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Atom }
     *     
     */
    public void setAtom(Atom value) {
        this.atom = value;
    }

}
