//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.19 at 11:27:03 AM MST 
//


package org.openinfobutton.schemas.kb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Context complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Context">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contextDefinition">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}patientGender" minOccurs="0"/>
 *                   &lt;element ref="{}patientAgeGroup" minOccurs="0"/>
 *                   &lt;element ref="{}task"/>
 *                   &lt;element ref="{}serviceDeliveryLocation" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{}encounterType" minOccurs="0"/>
 *                   &lt;element ref="{}performerLanguage" minOccurs="0"/>
 *                   &lt;element ref="{}performerDiscipline" minOccurs="0"/>
 *                   &lt;element ref="{}performerKnowledgeUserType" minOccurs="0"/>
 *                   &lt;element ref="{}informationRecipientLanguage" minOccurs="0"/>
 *                   &lt;element ref="{}informationRecipientDiscipline" minOccurs="0"/>
 *                   &lt;element ref="{}informationRecipientUserType" minOccurs="0"/>
 *                   &lt;element ref="{}conceptOfInterest"/>
 *                   &lt;element ref="{}subTopics"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="knowledgeRequestService">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="knowledgeRequestServiceLocation">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute ref="{}url use="required""/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="attributes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="attribute" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Context", propOrder = {
    "contextDescription",
    "contextDefinition",
    "knowledgeRequestService"
})
public class Context {

    protected String contextDescription;
    @XmlElement(required = true)
    protected Context.ContextDefinition contextDefinition;
    @XmlElement(required = true)
    protected Context.KnowledgeRequestService knowledgeRequestService;
    @XmlAttribute(required = true)
    protected String id;
    @XmlAttribute(required = true)
    protected String name;

    /**
     * Gets the value of the contextDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextDescription() {
        return contextDescription;
    }

    /**
     * Sets the value of the contextDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextDescription(String value) {
        this.contextDescription = value;
    }

    /**
     * Gets the value of the contextDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link Context.ContextDefinition }
     *     
     */
    public Context.ContextDefinition getContextDefinition() {
        return contextDefinition;
    }

    /**
     * Sets the value of the contextDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context.ContextDefinition }
     *     
     */
    public void setContextDefinition(Context.ContextDefinition value) {
        this.contextDefinition = value;
    }

    /**
     * Gets the value of the knowledgeRequestService property.
     * 
     * @return
     *     possible object is
     *     {@link Context.KnowledgeRequestService }
     *     
     */
    public Context.KnowledgeRequestService getKnowledgeRequestService() {
        return knowledgeRequestService;
    }

    /**
     * Sets the value of the knowledgeRequestService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context.KnowledgeRequestService }
     *     
     */
    public void setKnowledgeRequestService(Context.KnowledgeRequestService value) {
        this.knowledgeRequestService = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{}patientGender" minOccurs="0"/>
     *         &lt;element ref="{}patientAgeGroup" minOccurs="0"/>
     *         &lt;element ref="{}task"/>
     *         &lt;element ref="{}serviceDeliveryLocation" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{}encounterType" minOccurs="0"/>
     *         &lt;element ref="{}performerLanguage" minOccurs="0"/>
     *         &lt;element ref="{}performerDiscipline" minOccurs="0"/>
     *         &lt;element ref="{}performerKnowledgeUserType" minOccurs="0"/>
     *         &lt;element ref="{}informationRecipientLanguage" minOccurs="0"/>
     *         &lt;element ref="{}informationRecipientDiscipline" minOccurs="0"/>
     *         &lt;element ref="{}informationRecipientUserType" minOccurs="0"/>
     *         &lt;element ref="{}conceptOfInterest"/>
     *         &lt;element ref="{}subTopics"/>
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
        "patientGender",
        "patientAgeGroup",
        "task",
        "serviceDeliveryLocation",
        "encounterType",
        "performerLanguage",
        "performerDiscipline",
        "performerKnowledgeUserType",
        "informationRecipientLanguage",
        "informationRecipientDiscipline",
        "informationRecipientUserType",
        "conceptOfInterest",
        "subTopics"
    })
    public static class ContextDefinition {

        protected CodedContextElement patientGender;
        protected CodedContextElement patientAgeGroup;
        @XmlElement(required = true)
        protected CodedContextElement task;
        protected List<Id> serviceDeliveryLocation;
        protected CodedContextElement encounterType;
        protected CodedContextElement performerLanguage;
        protected CodedContextElement performerDiscipline;
        protected CodedContextElement performerKnowledgeUserType;
        protected CodedContextElement informationRecipientLanguage;
        protected CodedContextElement informationRecipientDiscipline;
        protected CodedContextElement informationRecipientUserType;
        @XmlElement(required = true)
        protected CodedContextElement conceptOfInterest;
        @XmlElement(required = true)
        protected SubTopics subTopics;

        /**
         * Gets the value of the patientGender property.
         * 
         * @return
         *     possible object is
         *     {@link CodedContextElement }
         *     
         */
        public CodedContextElement getPatientGender() {
            return patientGender;
        }

        /**
         * Sets the value of the patientGender property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedContextElement }
         *     
         */
        public void setPatientGender(CodedContextElement value) {
            this.patientGender = value;
        }

        /**
         * Gets the value of the patientAgeGroup property.
         * 
         * @return
         *     possible object is
         *     {@link CodedContextElement }
         *     
         */
        public CodedContextElement getPatientAgeGroup() {
            return patientAgeGroup;
        }

        /**
         * Sets the value of the patientAgeGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedContextElement }
         *     
         */
        public void setPatientAgeGroup(CodedContextElement value) {
            this.patientAgeGroup = value;
        }

        /**
         * Gets the value of the task property.
         * 
         * @return
         *     possible object is
         *     {@link CodedContextElement }
         *     
         */
        public CodedContextElement getTask() {
            return task;
        }

        /**
         * Sets the value of the task property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedContextElement }
         *     
         */
        public void setTask(CodedContextElement value) {
            this.task = value;
        }

        /**
         * Gets the value of the serviceDeliveryLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceDeliveryLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceDeliveryLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Id }
         * 
         * 
         */
        public List<Id> getServiceDeliveryLocation() {
            if (serviceDeliveryLocation == null) {
                serviceDeliveryLocation = new ArrayList<Id>();
            }
            return this.serviceDeliveryLocation;
        }

        /**
         * Gets the value of the encounterType property.
         * 
         * @return
         *     possible object is
         *     {@link CodedContextElement }
         *     
         */
        public CodedContextElement getEncounterType() {
            return encounterType;
        }

        /**
         * Sets the value of the encounterType property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedContextElement }
         *     
         */
        public void setEncounterType(CodedContextElement value) {
            this.encounterType = value;
        }

        /**
         * Gets the value of the performerLanguage property.
         * 
         * @return
         *     possible object is
         *     {@link CodedContextElement }
         *     
         */
        public CodedContextElement getPerformerLanguage() {
            return performerLanguage;
        }

        /**
         * Sets the value of the performerLanguage property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedContextElement }
         *     
         */
        public void setPerformerLanguage(CodedContextElement value) {
            this.performerLanguage = value;
        }

        /**
         * Gets the value of the performerDiscipline property.
         * 
         * @return
         *     possible object is
         *     {@link CodedContextElement }
         *     
         */
        public CodedContextElement getPerformerDiscipline() {
            return performerDiscipline;
        }

        /**
         * Sets the value of the performerDiscipline property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedContextElement }
         *     
         */
        public void setPerformerDiscipline(CodedContextElement value) {
            this.performerDiscipline = value;
        }

        /**
         * Gets the value of the performerKnowledgeUserType property.
         * 
         * @return
         *     possible object is
         *     {@link CodedContextElement }
         *     
         */
        public CodedContextElement getPerformerKnowledgeUserType() {
            return performerKnowledgeUserType;
        }

        /**
         * Sets the value of the performerKnowledgeUserType property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedContextElement }
         *     
         */
        public void setPerformerKnowledgeUserType(CodedContextElement value) {
            this.performerKnowledgeUserType = value;
        }

        /**
         * Gets the value of the informationRecipientLanguage property.
         * 
         * @return
         *     possible object is
         *     {@link CodedContextElement }
         *     
         */
        public CodedContextElement getInformationRecipientLanguage() {
            return informationRecipientLanguage;
        }

        /**
         * Sets the value of the informationRecipientLanguage property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedContextElement }
         *     
         */
        public void setInformationRecipientLanguage(CodedContextElement value) {
            this.informationRecipientLanguage = value;
        }

        /**
         * Gets the value of the informationRecipientDiscipline property.
         * 
         * @return
         *     possible object is
         *     {@link CodedContextElement }
         *     
         */
        public CodedContextElement getInformationRecipientDiscipline() {
            return informationRecipientDiscipline;
        }

        /**
         * Sets the value of the informationRecipientDiscipline property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedContextElement }
         *     
         */
        public void setInformationRecipientDiscipline(CodedContextElement value) {
            this.informationRecipientDiscipline = value;
        }

        /**
         * Gets the value of the informationRecipientUserType property.
         * 
         * @return
         *     possible object is
         *     {@link CodedContextElement }
         *     
         */
        public CodedContextElement getInformationRecipientUserType() {
            return informationRecipientUserType;
        }

        /**
         * Sets the value of the informationRecipientUserType property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedContextElement }
         *     
         */
        public void setInformationRecipientUserType(CodedContextElement value) {
            this.informationRecipientUserType = value;
        }

        /**
         * Gets the value of the conceptOfInterest property.
         * 
         * @return
         *     possible object is
         *     {@link CodedContextElement }
         *     
         */
        public CodedContextElement getConceptOfInterest() {
            return conceptOfInterest;
        }

        /**
         * Sets the value of the conceptOfInterest property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedContextElement }
         *     
         */
        public void setConceptOfInterest(CodedContextElement value) {
            this.conceptOfInterest = value;
        }

        /**
         * Gets the value of the subTopics property.
         * 
         * @return
         *     possible object is
         *     {@link SubTopics }
         *     
         */
        public SubTopics getSubTopics() {
            return subTopics;
        }

        /**
         * Sets the value of the subTopics property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubTopics }
         *     
         */
        public void setSubTopics(SubTopics value) {
            this.subTopics = value;
        }

    }


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
     *         &lt;element name="knowledgeRequestServiceLocation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute ref="{}url use="required""/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="attributes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="attribute" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "knowledgeRequestServiceLocation",
        "attributes"
    })
    public static class KnowledgeRequestService {

        @XmlElement(required = true)
        protected Context.KnowledgeRequestService.KnowledgeRequestServiceLocation knowledgeRequestServiceLocation;
        protected Context.KnowledgeRequestService.Attributes attributes;

        /**
         * Gets the value of the knowledgeRequestServiceLocation property.
         * 
         * @return
         *     possible object is
         *     {@link Context.KnowledgeRequestService.KnowledgeRequestServiceLocation }
         *     
         */
        public Context.KnowledgeRequestService.KnowledgeRequestServiceLocation getKnowledgeRequestServiceLocation() {
            return knowledgeRequestServiceLocation;
        }

        /**
         * Sets the value of the knowledgeRequestServiceLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Context.KnowledgeRequestService.KnowledgeRequestServiceLocation }
         *     
         */
        public void setKnowledgeRequestServiceLocation(Context.KnowledgeRequestService.KnowledgeRequestServiceLocation value) {
            this.knowledgeRequestServiceLocation = value;
        }

        /**
         * Gets the value of the attributes property.
         * 
         * @return
         *     possible object is
         *     {@link Context.KnowledgeRequestService.Attributes }
         *     
         */
        public Context.KnowledgeRequestService.Attributes getAttributes() {
            return attributes;
        }

        /**
         * Sets the value of the attributes property.
         * 
         * @param value
         *     allowed object is
         *     {@link Context.KnowledgeRequestService.Attributes }
         *     
         */
        public void setAttributes(Context.KnowledgeRequestService.Attributes value) {
            this.attributes = value;
        }


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
         *         &lt;element name="attribute" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "attribute"
        })
        public static class Attributes {

            @XmlElement(required = true)
            protected List<Context.KnowledgeRequestService.Attributes.Attribute> attribute;

            /**
             * Gets the value of the attribute property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the attribute property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAttribute().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Context.KnowledgeRequestService.Attributes.Attribute }
             * 
             * 
             */
            public List<Context.KnowledgeRequestService.Attributes.Attribute> getAttribute() {
                if (attribute == null) {
                    attribute = new ArrayList<Context.KnowledgeRequestService.Attributes.Attribute>();
                }
                return this.attribute;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Attribute {

                @XmlAttribute(required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String name;
                @XmlAttribute(required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String value;

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
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute ref="{}url use="required""/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class KnowledgeRequestServiceLocation {

            @XmlAttribute(required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String url;

            /**
             * Gets the value of the url property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUrl() {
                return url;
            }

            /**
             * Sets the value of the url property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUrl(String value) {
                this.url = value;
            }

        }

    }

}
