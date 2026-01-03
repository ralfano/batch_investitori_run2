package it.allianz.next.dmn.mypostbank.mapper;

import it.allianz.next.cdm.apigee.mypostbank.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RicercaDocumentoPerNdgMapper {

    RicercaDocumentoPerNdgMapper INSTANCE = Mappers.getMapper(RicercaDocumentoPerNdgMapper.class);

    @Mapping(target = "istituto.codice",  source = "doc.istituto.codice")
    @Mapping(target = "istitutoDoc.codice", constant = "00080" )
    @Mapping(target = "codiceDocumento.codice", source = "doc.codiceDocumento.codice")
    @Mapping(target = "codiceDocumento.descrizione", source = "doc.codiceDocumento.descrizione")
    @Mapping(target = "codiceModello.codice", source = "doc.codiceModelloEPost.codice")
    @Mapping(target = "codiceModello.descrizione", source = "doc.codiceModelloEPost.descrizione")
    @Mapping(target = "ndg.valore", source = "ndg")
    @Mapping(target = "dataDa", source = "doc.data")
    @Mapping(target = "dataA", source = "doc.data")
    RicercaDocumentiPerNdgHXSPRequestRicercaDocumentiPerNdgHXSPRequest mapRiepilogoToRequest(@MappingTarget RicercaDocumentiPerNdgHXSPRequestRicercaDocumentiPerNdgHXSPRequest request,
                                                                                             RiepilogoDocumentiDisponibiliHXSPResponseRiepilogoDocumentiDisponibiliHXSPResponseRiepilogoDocumento doc,
                                                                                             Integer ndg,
                                                                                             MyPostBankDocumentSearchRequest sr
                                                                                             );


    default RicercaDocumentiPerNdgHXSPRequest getRequest(RiepilogoDocumentiDisponibiliHXSPResponseRiepilogoDocumentiDisponibiliHXSPResponseRiepilogoDocumento doc,MyPostBankDocumentSearchRequest searchRequest, Integer ndg){

            RicercaDocumentiPerNdgHXSPRequest request = new RicercaDocumentiPerNdgHXSPRequest();
            request.setRicercaDocumentiPerNdgHXSPRequest(
                    mapRiepilogoToRequest(
                            new RicercaDocumentiPerNdgHXSPRequestRicercaDocumentiPerNdgHXSPRequest(),
                            doc,
                            ndg,
                            searchRequest
                            ));

        return request;
    }




}

