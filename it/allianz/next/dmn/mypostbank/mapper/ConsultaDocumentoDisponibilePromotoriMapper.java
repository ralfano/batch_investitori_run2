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
public interface ConsultaDocumentoDisponibilePromotoriMapper {

	ConsultaDocumentoDisponibilePromotoriMapper INSTANCE = Mappers
			.getMapper(ConsultaDocumentoDisponibilePromotoriMapper.class);

	@Mapping(target = "istituto.codice", constant = "00080")
	@Mapping(target = "istitutoDoc.codice", constant = "00080")
	@Mapping(target = "codiceDocumento.codice", source = "rdd.codiceDocumento.codice")
	@Mapping(target = "codiceDocumento.descrizione", source = "rdd.codiceDocumento.descrizione")
	@Mapping(target = "codiceModello.codice", source = "rdd.codiceModelloEPost.codice")
	@Mapping(target = "codiceModello.descrizione", source = "rdd.codiceModelloEPost.descrizione")
	@Mapping(target = "documento.data", source = "rdd.data")
	@Mapping(target = "documento.PID", source = "rdd.PID")
	ConsultaDocumentoDisponibilePromotoriHXSPRequestConsultaDocumentoDisponibilePromotoriHXSPRequest mapRicercaDocumentiNdgRespToConsultaDocumentoDisponibilePromotoriReq(
			@MappingTarget ConsultaDocumentoDisponibilePromotoriHXSPRequestConsultaDocumentoDisponibilePromotoriHXSPRequest request,
			MyPostBankScaricoDocRequest rdd);

	@Mapping(target = "istituto.codice", constant = "00080")
	@Mapping(target = "istitutoDoc.codice", constant = "00080")
	@Mapping(target = "codiceDocumento.codice", source = "codiceDocumento.codice")
	@Mapping(target = "codiceDocumento.descrizione", source = "codiceDocumento.descrizione")
	@Mapping(target = "codiceModello.codice", source = "codiceModello.codice")
	@Mapping(target = "codiceModello.descrizione", source = "codiceModello.descrizione")
	@Mapping(target = "documento.data", source = "rdd.data")
	@Mapping(target = "documento.PID", source = "rdd.PID")
	ConsultaDocumentoDisponibilePromotoriHXSPRequestConsultaDocumentoDisponibilePromotoriHXSPRequest mapRicercaDocumentiContoRespToConsultaDocumentoDisponibilePromotoriReq(
			@MappingTarget ConsultaDocumentoDisponibilePromotoriHXSPRequestConsultaDocumentoDisponibilePromotoriHXSPRequest request,
			RicercaDocumentiPerContoHXSPResponseRicercaDocumentiPerContoHXSPResponseElencoDocumenti rdd,
			RicercaDocumentiPerContoHXSPRequestRicercaDocumentiPerContoHXSPRequestCodiceModello codiceModello,
			RicercaDocumentiPerContoHXSPRequestRicercaDocumentiPerContoHXSPRequestCodiceModello codiceDocumento,
			MyPostBankDocumentSearchRequest sr);

	default ConsultaDocumentoDisponibilePromotoriHXSPRequest getRequest(MyPostBankScaricoDocRequest docScarico) {
		ConsultaDocumentoDisponibilePromotoriHXSPRequest request = new ConsultaDocumentoDisponibilePromotoriHXSPRequest();
		request.setConsultaDocumentoDisponibilePromotoriHXSPRequest(
				mapRicercaDocumentiNdgRespToConsultaDocumentoDisponibilePromotoriReq(
						new ConsultaDocumentoDisponibilePromotoriHXSPRequestConsultaDocumentoDisponibilePromotoriHXSPRequest(), docScarico));
		return request;
	}	
}
