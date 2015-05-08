package com.griddynamics.cd.internal.model.api;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * DTO Class encapsulates response data sent from replication nexus servers back
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@SuppressWarnings( "all" )
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = RestResponse.NAME)
@XStreamAlias(value = RestResponse.NAME)
public class RestResponse implements Serializable {
    public static final String NAME = "rest-status";

    @NonNull
    private boolean isSuccess;
    @NonNull
    private String message;
}