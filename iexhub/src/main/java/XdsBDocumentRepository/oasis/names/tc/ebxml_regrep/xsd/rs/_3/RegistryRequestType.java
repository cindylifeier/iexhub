/*******************************************************************************
 * Copyright (c) 2016 Substance Abuse and Mental Health Services Administration (SAMHSA)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Eversolve, LLC - initial IExHub implementation
 *******************************************************************************/

package XdsBDocumentRepository.oasis.names.tc.ebxml_regrep.xsd.rs._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import XdsBDocumentRepository.oasis.names.tc.ebxml_regrep.xsd.lcm._3.AcceptObjectsRequest;
import XdsBDocumentRepository.oasis.names.tc.ebxml_regrep.xsd.lcm._3.ApproveObjectsRequest;
import XdsBDocumentRepository.oasis.names.tc.ebxml_regrep.xsd.lcm._3.DeprecateObjectsRequest;
import XdsBDocumentRepository.oasis.names.tc.ebxml_regrep.xsd.lcm._3.RelocateObjectsRequest;
import XdsBDocumentRepository.oasis.names.tc.ebxml_regrep.xsd.lcm._3.RemoveObjectsRequest;
import XdsBDocumentRepository.oasis.names.tc.ebxml_regrep.xsd.lcm._3.SubmitObjectsRequest;
import XdsBDocumentRepository.oasis.names.tc.ebxml_regrep.xsd.lcm._3.UndeprecateObjectsRequest;
import XdsBDocumentRepository.oasis.names.tc.ebxml_regrep.xsd.lcm._3.UpdateObjectsRequest;
import XdsBDocumentRepository.oasis.names.tc.ebxml_regrep.xsd.query._3.AdhocQueryRequest;
import XdsBDocumentRepository.oasis.names.tc.ebxml_regrep.xsd.rim._3.SlotListType;


/**
 * Base type for all ebXML Registry requests
 * 
 * <p>Java class for RegistryRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistryRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestSlotList" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}SlotListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="comment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryRequestType", propOrder = {
    "requestSlotList"
})
@XmlSeeAlso({
    AdhocQueryRequest.class,
    ApproveObjectsRequest.class,
    UpdateObjectsRequest.class,
    RelocateObjectsRequest.class,
    DeprecateObjectsRequest.class,
    SubmitObjectsRequest.class,
    RemoveObjectsRequest.class,
    AcceptObjectsRequest.class,
    UndeprecateObjectsRequest.class
})
public class RegistryRequestType {

    @XmlElement(name = "RequestSlotList")
    protected SlotListType requestSlotList;
    @XmlAttribute
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlAttribute
    protected String comment;

    /**
     * Gets the value of the requestSlotList property.
     * 
     * @return
     *     possible object is
     *     {@link SlotListType }
     *     
     */
    public SlotListType getRequestSlotList() {
        return requestSlotList;
    }

    /**
     * Sets the value of the requestSlotList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlotListType }
     *     
     */
    public void setRequestSlotList(SlotListType value) {
        this.requestSlotList = value;
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
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
