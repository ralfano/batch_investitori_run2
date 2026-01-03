package it.allianz.next.dmn.mypostbank.api;


import com.fasterxml.jackson.core.JsonProcessingException;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import it.allianz.next.cdm.exception.ErrorType;
import it.allianz.next.cdm.apigee.mypostbank.*;
import it.allianz.next.common.constants.CommonConstants;
import it.allianz.next.dmn.mypostbank.service.MyPostBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import it.allianz.next.exception.NextException;

import java.util.List;


@RestController("MypostbankDMNController")
public class MypostbankApiController implements MypostbankApi {

	@Autowired
	private MyPostBankService myPostBankService;

	@Override
	public ResponseEntity<List<MyPostBankDocumentSearchResponse>> listaDocumentiDisponibili(
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

		List<MyPostBankDocumentSearchResponse> resp = myPostBankService
				.listaDocumentiDisponibili(xAzbFacode, xAzbClientname, xAzbTimestamp, xAzbUser, xAzbDevice, ndgClient, filiale,
						agenzia, deposito, sottodeposito, gesiSecUser, request);

		if (resp != null) {
			return new ResponseEntity<List<MyPostBankDocumentSearchResponse>>(resp, HttpStatus.OK);
		} else {
			throw new NextException("No values found for the given code: " + xAzbFacode, null, ErrorType.ERROR, null,
					HttpStatus.NOT_FOUND);

		}
	}

	@Override
	public ResponseEntity<FiltroRapportiNDGResponse> listaCategorieDisponibili(String xAzbFacode, String xAzbToken,
			String xAzbClientname, String xAzbTimestamp, String xAzbUser, String xAzbDevice, String xAzbFacodeUser,
			String ndg, List<String> warnings) throws NextException {
		return myPostBankService.listaCategorieDisponibili(xAzbFacode, xAzbClientname,
				xAzbTimestamp, xAzbUser, xAzbDevice, ndg);
	}
	
	@Override
	public ResponseEntity<MyPostBankScaricoDocResponse> scaricoDocumenti(
			@Parameter(description = "", required = true) @RequestHeader(value = "x-azb-facode", required = true) String xAzbFacode,
			@Parameter(description = "", required = true) @RequestHeader(value = "token", required = true) String xAzbToken,
			@Parameter(description = "", required = true) @RequestHeader(value = "x-azb-clientname", required = true) String xAzbClientname,
			@Parameter(description = "", required = true) @RequestHeader(value = "x-azb-timestamp", required = true) String xAzbTimestamp,
			@Parameter(description = "", required = true) @RequestHeader(value = "${header.user:name}", required = true) String xAzbUser,
			@Parameter(description = "", required = true) @RequestHeader(value = "x-azb-device", required = true) String xAzbDevice,
			@Parameter(description = "xAzbFacodeUser", required = false) @RequestParam(value = "xAzbFacodeUser", required = false) String xAzbFacodeUser,
			@Parameter(description = "", required = false) @RequestParam(value = "warnings", required = false) List<String> warnings,
			@RequestBody MyPostBankScaricoDocRequest request) throws NextException {
		MyPostBankScaricoDocResponse resp = myPostBankService.scaricoDocumentiApigeeWithDownload(xAzbFacode, xAzbClientname, xAzbTimestamp, xAzbUser, xAzbDevice, request);

		if (resp != null) {
			return new ResponseEntity<MyPostBankScaricoDocResponse>(resp, HttpStatus.OK);
		} else {
			throw new NextException("No values found for the given code: " + xAzbFacode, null, ErrorType.ERROR, null,
					HttpStatus.NOT_FOUND);
		}
	}

}
