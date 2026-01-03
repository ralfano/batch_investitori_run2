package it.allianz.next.dmn.mypostbank.mapper;

import it.allianz.next.cdm.apigee.mypostbank.*;


import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface RiepilogoDocumentiMapper {

    RiepilogoDocumentiMapper INSTANCE = Mappers.getMapper(RiepilogoDocumentiMapper.class);

    @Mapping(target = "codiceLingua", constant = "1")
    @Mapping(target = "ndg.valore", source = "ndg")
    @Mapping(target = "datiContratto", source = "sr.datiContratto")
    @Mapping(target = "secOld", source = "sr.secOld")
    @Mapping(target = "dataDa", source = "sr.startDate")
    @Mapping(target = "dataA", source = "sr.endDate")
    @Mapping(target = "codiceDocumento.codice", source = "cd.codice")
    @Mapping(target = "codiceDocumento.descrizione", source = "cd.descrizione")
    @Mapping(target = "flagElencoUltimi", constant = "N")
    @Mapping(target = "istituto.codice", constant = "00080")
    @Mapping(target = "elementiDaVisualizzare", constant = "1")
    @Mapping(target = "numeroElementi", constant = "1")
    RiepilogoDocumentiDisponibiliHXSPRequestRiepilogoDocumentiDisponibiliHXSPRequest mapRapportoToRequestInterna(@MappingTarget RiepilogoDocumentiDisponibiliHXSPRequestRiepilogoDocumentiDisponibiliHXSPRequest request,
                                                                                                                 String ndg,
                                                                                                                 ApigeeCodiceDocumento cd,
                                                                                                                 MyPostBankDocumentSearchRequest sr);


    default List<RiepilogoDocumentiDisponibiliHXSPRequest> getRequest(MyPostBankDocumentSearchRequest searchRequest, String ndg){
        ArrayList<RiepilogoDocumentiDisponibiliHXSPRequest> requestList = new ArrayList<>();
        for(ApigeeTipologia tipologia : searchRequest.getCategoria().getTipologie()) {
            RiepilogoDocumentiDisponibiliHXSPRequest request = new RiepilogoDocumentiDisponibiliHXSPRequest();
            request.setRiepilogoDocumentiDisponibiliHXSPRequest(
                    mapRapportoToRequestInterna(
                            new RiepilogoDocumentiDisponibiliHXSPRequestRiepilogoDocumentiDisponibiliHXSPRequest(),
                            ndg,
                            tipologia.getCodiceDocumento(),
                            searchRequest));
            requestList.add(request);
        }
        return requestList;
    }






}

