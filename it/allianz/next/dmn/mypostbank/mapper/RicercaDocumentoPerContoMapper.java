package it.allianz.next.dmn.mypostbank.mapper;

import it.allianz.next.cdm.apigee.mypostbank.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RicercaDocumentoPerContoMapper {

    RicercaDocumentoPerContoMapper INSTANCE = Mappers.getMapper(RicercaDocumentoPerContoMapper.class);


    @Mapping(target = "elencoRapporti",  expression = "java(getElencoRapportiList(rdd.getRapporto()))")
    @Mapping(target = "flagDossierTitoli",  constant = "N")//fixme
    @Mapping(target = "istituto.codice",  constant = "00080")
    @Mapping(target = "istitutoDoc.codice", constant = "00080" )
    @Mapping(target = "codiceDocumento.codice", source = "rdd.codiceDocumento.codice")
    @Mapping(target = "codiceDocumento.descrizione", source = "rdd.codiceDocumento.descrizione")
    @Mapping(target = "codiceModello.codice", source = "rdd.codiceModelloEPost.codice")
    @Mapping(target = "codiceModello.descrizione", source = "rdd.codiceModelloEPost.descrizione")
    @Mapping(target = "dataDa", source = "rdd.data")
    @Mapping(target = "dataA", source = "rdd.data")
    RicercaDocumentiPerContoHXSPRequestRicercaDocumentiPerContoHXSPRequest mapRiepilogoToRequest(
            RiepilogoDocumentiDisponibiliHXSPResponseRiepilogoDocumentiDisponibiliHXSPResponseRiepilogoDocumento rdd,
                                                                                             MyPostBankDocumentSearchRequest sr);


    @Mapping(target = "datiCad", source = "r.datiCad")
    @Mapping(target = "secNew", source = "r.secNew")
    @Mapping(target = "secOldIntestato", source = "r.secOldIntestato")
    @Mapping(target = "numeroCartaPrepagata.codice", source = "r.numeroCartaPrepagata.codice")
    RicercaDocumentiPerContoHXSPRequestRicercaDocumentiPerContoHXSPRequestElencoRapporti mapRiepilogoToRequest(RiepilogoDocumentiDisponibiliHXSPResponseRiepilogoDocumentiDisponibiliHXSPResponseRapporto r);


    default List<RicercaDocumentiPerContoHXSPRequestRicercaDocumentiPerContoHXSPRequestElencoRapporti> getElencoRapportiList(RiepilogoDocumentiDisponibiliHXSPResponseRiepilogoDocumentiDisponibiliHXSPResponseRapporto response){
        ArrayList<RicercaDocumentiPerContoHXSPRequestRicercaDocumentiPerContoHXSPRequestElencoRapporti> requestList = new ArrayList<>();
        requestList.add(mapRiepilogoToRequest(response));
        return requestList;
    }




}

