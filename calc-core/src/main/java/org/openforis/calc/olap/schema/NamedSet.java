//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.01 at 03:55:36 PM CET 
//


package org.openforis.calc.olap.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Defines a named set which can be used in queries in the same way as a set
 *                 defined using a WITH SET clause. A named set can be defined against a particular cube,
 *                 or can be global to a schema. If it is defined against a cube, it is only available to queries which use that cube.
 *                 A named set defined against a cube is not inherited by a virtual cubes defined against that cube.
 *                 (But you can define a named set against a virtual cube). A named set defined against a schema
 *                 is available in all cubes and virtual cubes in that schema.
 *                 However, it is only valid if the cube contains dimensions with the names required to make the formula valid.
 *             
 * 
 * <p>Java class for NamedSet complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamedSet", propOrder = {
    "annotations"
})
public class NamedSet {

    @XmlElement(name = "Annotations")
    protected Annotations annotations;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute
    protected String caption;
    @XmlAttribute
    protected String description;
    @XmlAttribute
    protected String formula;

    /**
     * Gets the value of the annotations property.
     * 
     * @return
     *     possible object is
     *     {@link Annotations }
     *     
     */
    public Annotations getAnnotations() {
        return annotations;
    }

    /**
     * Sets the value of the annotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotations }
     *     
     */
    public void setAnnotations(Annotations value) {
        this.annotations = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormula(String value) {
        this.formula = value;
    }

}