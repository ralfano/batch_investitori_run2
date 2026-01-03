package it.allianz.next.dmn.mypostbank.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import it.allianz.next.cdm.apigee.mypostbank.*;
import it.allianz.next.cdm.pricingUnit.RecordsAndDepositsResponse;
//import it.allianz.next.dmn.mypostbank.dto.RegistrationReqDto;
//import it.allianz.next.dmn.mypostbank.dto.RegistrationRespDto;
import it.allianz.next.common.constants.CommonConstants;
import it.allianz.next.exception.NextException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "OperationalSupport", description = "the OperationalSupport API")
public interface MypostbankApi {

	@Operation(summary = "Lista documenti disonibili", description = "Lista documenti disonibili", responses = {
			@ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json")),
			@ApiResponse(responseCode = "201", description = "Created", content = @Content(schema = @Schema(hidden = true))),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(hidden = true))),
			@ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(hidden = true))),
			@ApiResponse(responseCode = "404", description = "Resource not found or of empty list", content = @Content(schema = @Schema(hidden = true))) })
	@RequestMapping(value = "/OperationalSupport/MyPostBank/listaDocumentiDisponibili", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	default ResponseEntity<List<MyPostBankDocumentSearchResponse>> listaDocumentiDisponibili(
			@Parameter(description = "", required = true) @RequestHeader(value = "x-azb-facode", required = true) String xAzbFacode,
			@Parameter(description = "", required = true) @RequestHeader(value = "token", required = true) String xAzbToken,
			@Parameter(description = "", required = true) @RequestHeader(value = "x-azb-clientname", required = true) String xAzbClientname,
			@Parameter(description = "", required = true) @RequestHeader(value = "x-azb-timestamp", required = true) String xAzbTimestamp,
			@Parameter(description = "", required = true) @RequestHeader(value = "${header.user:name}", required = true) String xAzbUser,
			@Parameter(description = "", required = true) @RequestHeader(value = "x-azb-device", required = true) String xAzbDevice,
			@Parameter(description = "xAzbFacodeUser", required = false) @RequestParam(value = "xAzbFacodeUser", required = false) String xAzbFacodeUser,
			@Parameter(description = "gesiSecUser", required = true) @RequestAttribute(value = CommonConstants.GESI_SEC_USER, required = false) String gesiSecUser,
			@Parameter(description = "", required = false) @RequestHeader(value = "ndgClient", required = false) String ndgClient,
			@Parameter(description = "", required = false) @RequestHeader(value = "filiale", required = false) String filiale,
			@Parameter(description = "", required = false) @RequestHeader(value = "agenzia", required = false) String agenzia,
			@Parameter(description = "", required = false) @RequestHeader(value = "deposito", required = false) String deposito,
			@Parameter(description = "", required = false) @RequestHeader(value = "sottodeposito", required = false) String sottodeposito,
			@RequestBody MyPostBankDocumentSearchRequest request) throws NextException, JsonProcessingException {
		return new ResponseEntity<List<MyPostBankDocumentSearchResponse>>(HttpStatus.OK);
	}

	// servizio custom
	@Operation(summary = "lista categorie disponibili", description = "lista categorie disponibili", responses = {
			@ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = FiltroRapportiNDGResponse.class))),
			@ApiResponse(responseCode = "201", description = "Created", content = @Content(schema = @Schema(hidden = true))),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(hidden = true))),
			@ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(hidden = true))),
			@ApiResponse(responseCode = "404", description = "Resource not found or of empty list", content = @Content(schema = @Schema(hidden = true))) })
	@RequestMapping(value = "/OperationalSupport/MyPostBank/listaCategorie", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.GET)
	default ResponseEntity<FiltroRapportiNDGResponse> listaCategorieDisponibili(
			@Parameter(description = "", required = true) @RequestHeader(value = "x-azb-facode", required = true) String xAzbFacode,
			@Parameter(description = "", required = true) @RequestHeader(value = "token", required = true) String xAzbToken,
			@Parameter(description = "", required = true) @RequestHeader(value = "x-azb-clientname", required = true) String xAzbClientname,
			@Parameter(description = "", required = true) @RequestHeader(value = "x-azb-timestamp", required = true) String xAzbTimestamp,
			@Parameter(description = "", required = true) @RequestHeader(value = "${header.user:name}", required = true) String xAzbUser,
			@Parameter(description = "", required = true) @RequestHeader(value = "x-azb-device", required = true) String xAzbDevice,
			@Parameter(description = "xAzbFacodeUser", required = false) @RequestParam(value = "xAzbFacodeUser", required = false) String xAzbFacodeUser,
			@Parameter(description = "", required = false) @RequestParam(value = "ndg", required = false) String ndg,
			@Parameter(description = "", required = false) @RequestParam(value = "warnings", required = false) List<String> warnings)
			throws NextException {
		return new ResponseEntity<FiltroRapportiNDGResponse>(HttpStatus.OK);
	}

	@Operation(summary = "Riepilogo documenti disponibili", description = "riepiloga documenti disponibili", responses = {
			@ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RiepilogoDocumentiDisponibiliHXSPResponse.class))),
			@ApiResponse(responseCode = "201", description = "Created", content = @Content(schema = @Schema(hidden = true))),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(hidden = true))),
			@ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(schema = @Schema(hidden = true))),
			@ApiResponse(responseCode = "404", description = "Resource not found or of empty list", content = @Content(schema = @Schema(hidden = true))) })
	@RequestMapping(value = "OperationalSupport/MyPostBank/RiepilogoDocumentiDisponibili", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	default ResponseEntity<RiepilogoDocumentiDisponibiliHXSPResponse> RiepilogoDocumentiDisponibili(
			@Parameter(description = "", required = true) @RequestHeader(value = "x-azb-facode", required = true) String xAzbFacode,
			@Parameter(description = "", required = true) @RequestHeader(value = "token", required = true) String xAzbToken,
			@Parameter(description = "", required = true) @RequestHeader(value = "x-azb-clientname", required = true) String xAzbClientname,
			@Parameter(description = "", required = true) @RequestHeader(value = "x-azb-timestamp", required = true) String xAzbTimestamp,
			@Parameter(description = "", required = true) @RequestHeader(value = "${header.user:name}", required = true) String xAzbUser,
			@Parameter(description = "", required = true) @RequestHeader(value = "x-azb-device", required = true) String xAzbDevice,
			@Parameter(description = "xAzbFacodeUser", required = false) @RequestParam(value = "xAzbFacodeUser", required = false) String xAzbFacodeUser,
			@Parameter(description = "", required = false) @RequestParam(value = "warnings", required = false) List<String> warnings,
			@RequestBody RiepilogoDocumentiDisponibiliHXSPRequest request) throws NextException {
		return new ResponseEntity<RiepilogoDocumentiDisponibiliHXSPResponse>(HttpStatus.OK);
	}
	
	@Operation(summary = "Scarico Documenti", description = "Scarico Documenti", responses = {
			@ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation=MyPostBankScaricoDocResponse.class))),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(implementation=MyPostBankScaricoDocResponse.class))) })
	@RequestMapping(value = "OperationalSupport/MyPostBank/ScaricoDocumenti", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	ResponseEntity<MyPostBankScaricoDocResponse> scaricoDocumenti(
			@Parameter(description = "", required = true) @RequestHeader(value = "x-azb-facode", required = true) String xAzbFacode,
			@Parameter(description = "", required = true) @RequestHeader(value = "token", required = true) String xAzbToken,
			@Parameter(description = "", required = true) @RequestHeader(value = "x-azb-clientname", required = true) String xAzbClientname,
			@Parameter(description = "", required = true) @RequestHeader(value = "x-azb-timestamp", required = true) String xAzbTimestamp,
			@Parameter(description = "", required = true) @RequestHeader(value = "${header.user:name}", required = true) String xAzbUser,
			@Parameter(description = "", required = true) @RequestHeader(value = "x-azb-device", required = true) String xAzbDevice,
			@Parameter(description = "xAzbFacodeUser", required = false) @RequestParam(value = "xAzbFacodeUser", required = false) String xAzbFacodeUser,
			@Parameter(description = "", required = false) @RequestParam(value = "warnings", required = false) List<String> warnings,
			@RequestBody MyPostBankScaricoDocRequest request) throws NextException;

}
