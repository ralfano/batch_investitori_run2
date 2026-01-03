package it.allianz.next.dmn.mypostbank.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.allianz.next.cdm.exception.ErrorType;
import it.allianz.next.common.constants.CommonConstants;
import it.allianz.next.entity.common.FinPromotore;
import it.allianz.next.exception.NextException;
import it.allianz.next.repository.common.FinAccordoLinkRepository;
import it.allianz.next.repository.common.FinContrattoRepopsitory;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

import it.allianz.next.repository.common.DecodeUtilsRepository;
import it.allianz.next.repository.common.FinPromotoreRepository;
import it.allianz.next.entity.common.FinSoggetto;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.httpclient.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import it.allianz.next.apigee.integration.ApigeeInfrastracture;
import it.allianz.next.cdm.apigee.mypostbank.ApigeeCategoria;
import it.allianz.next.cdm.apigee.mypostbank.ApigeeCodiceDocumento;
import it.allianz.next.cdm.apigee.mypostbank.ApigeeDatiContratto;
import it.allianz.next.cdm.apigee.mypostbank.ApigeeDatiRapportoCad;
import it.allianz.next.cdm.apigee.mypostbank.ApigeeDatiRapportoSecOld;
import it.allianz.next.cdm.apigee.mypostbank.ApigeeException;
import it.allianz.next.cdm.apigee.mypostbank.ApigeeTipologia;
import it.allianz.next.cdm.apigee.mypostbank.ConsultaDocumentoDisponibilePromotoriHXSPRequest;
import it.allianz.next.cdm.apigee.mypostbank.ConsultaDocumentoDisponibilePromotoriHXSPResponse;
import it.allianz.next.cdm.apigee.mypostbank.ConsultaDocumentoDisponibilePromotoriHXSPResponseConsultaDocumentoDisponibilePromotoriHXSPResponse;
import it.allianz.next.cdm.apigee.mypostbank.FiltroRapportiNDGResponse;
import it.allianz.next.cdm.apigee.mypostbank.MyPostBankDocumentSearchRequest;
import it.allianz.next.cdm.apigee.mypostbank.MyPostBankDocumentSearchResponse;
import it.allianz.next.cdm.apigee.mypostbank.MyPostBankScaricoDocRequest;
import it.allianz.next.cdm.apigee.mypostbank.MyPostBankScaricoDocResponse;
import it.allianz.next.cdm.apigee.mypostbank.RapportoApigee;
import it.allianz.next.cdm.apigee.mypostbank.RicercaDocumentiHXEPostSPRequest;
import it.allianz.next.cdm.apigee.mypostbank.RicercaDocumentiHXEPostSPRequestRicercaDocumentiHXEPostSPRequest;
import it.allianz.next.cdm.apigee.mypostbank.RicercaDocumentiHXEPostSPRequestRicercaDocumentiHXEPostSPRequestIstituto;
import it.allianz.next.cdm.apigee.mypostbank.RicercaDocumentiHXEPostSPRequestRicercaDocumentiHXEPostSPRequestNdg;
import it.allianz.next.cdm.apigee.mypostbank.RicercaDocumentiHXEPostSPRequestRicercaDocumentiHXEPostSPRequestSecOldEsterno;
import it.allianz.next.cdm.apigee.mypostbank.RicercaDocumentiHXEPostSPResponse;
import it.allianz.next.cdm.apigee.mypostbank.RicercaDocumentiHXEPostSPResponseException;
import it.allianz.next.cdm.apigee.mypostbank.RicercaDocumentiHXEPostSPResponseRicercaDocumentiHXEPostSPResponseElencoDocumentiEPost;
import it.allianz.next.cdm.apigee.mypostbank.RicercaDocumentiHXEPostSPResponseRicercaDocumentiHXEPostSPResponseRapporto;
import it.allianz.next.cdm.apigee.mypostbank.RicercaDocumentiPerContoHXSPRequest;
import it.allianz.next.cdm.apigee.mypostbank.RicercaDocumentiPerContoHXSPRequestRicercaDocumentiPerContoHXSPRequest;
import it.allianz.next.cdm.apigee.mypostbank.RicercaDocumentiPerContoHXSPResponse;
import it.allianz.next.cdm.apigee.mypostbank.RicercaDocumentiPerContoHXSPResponseRicercaDocumentiPerContoHXSPResponseElencoDocumenti;
import it.allianz.next.cdm.apigee.mypostbank.RicercaDocumentiPerNdgHXSPRequest;
import it.allianz.next.cdm.apigee.mypostbank.RicercaDocumentiPerNdgHXSPResponse;
import it.allianz.next.cdm.apigee.mypostbank.RicercaDocumentiPerNdgHXSPResponseRicercaDocumentiPerNdgHXSPResponseElencoDocumenti;
import it.allianz.next.cdm.apigee.mypostbank.RiepilogoDocumentiDisponibiliHXSPRequest;
import it.allianz.next.cdm.apigee.mypostbank.RiepilogoDocumentiDisponibiliHXSPRequestRiepilogoDocumentiDisponibiliHXSPRequestSecOld;
import it.allianz.next.cdm.apigee.mypostbank.RiepilogoDocumentiDisponibiliHXSPResponse;
import it.allianz.next.cdm.apigee.mypostbank.RiepilogoDocumentiDisponibiliHXSPResponseRiepilogoDocumentiDisponibiliHXSPResponseRiepilogoDocumento;
import it.allianz.next.dmn.mypostbank.mapper.ConsultaDocumentoDisponibilePromotoriMapper;
import it.allianz.next.dmn.mypostbank.mapper.RicercaDocumentoPerContoMapper;
import it.allianz.next.dmn.mypostbank.mapper.RicercaDocumentoPerNdgMapper;
import it.allianz.next.dmn.mypostbank.mapper.RiepilogoDocumentiMapper;
import it.allianz.next.repository.common.FinSoggettoRepository;
import it.allianz.next.sec.entity.Cliente;
import it.allianz.next.sec.entity.Promotore;
import it.allianz.next.sec.integration.SecServizi;
import it.allianz.next.sec.utility.SecServicesUtilities;
import it.allianz.next.utils.SubjectServiceUtils;

@Service("myPostBankService")
public class MyPostBankService {

	@Autowired
	@Qualifier("myPostBankRestTemplate")
	RestTemplate restTemplate;

	@Autowired
	@Qualifier("secServizi")
	private SecServizi secServizi;

	@Autowired
	@Qualifier("apigeeInfrastracture")
	private ApigeeInfrastracture apigeeInfrastracture;

	@Autowired
	ObjectMapper objectMapper;

	@Autowired
	private FinSoggettoRepository finSoggettoRepository;

	@Autowired
	private FinAccordoLinkRepository falRepository;

	@Autowired
	private FinPromotoreRepository faRepository;

	@Autowired
	private FinPromotoreRepository finPromotoreRepository;

	@Autowired
	private FinContrattoRepopsitory contractRepository;

	@Autowired
	private SubjectServiceUtils subjectServiceUtils = null;

	@Autowired
	private SecServicesUtilities secServicesUtilities;

	@Autowired
	private DecodeUtilsRepository decodeUtilsRepository;

	@Autowired
	private RiepilogoDocumentiMapper riepilogoDocumentiMapper;

	@Autowired
	private RicercaDocumentoPerNdgMapper ricercaDocumentoPerNdgMapper;

	@Autowired
	private ConsultaDocumentoDisponibilePromotoriMapper consultaDocumentoDisponibilePromotoriMapper;

	@Autowired
	private RicercaDocumentoPerContoMapper ricercaDocumentoPerContoMapper;

	private static final Map<String, Integer> ORDINE;

	private static final Log LOGGER = LogFactory.getLog(MyPostBankService.class);

	private static String norm(String s) {
	    if (s == null) return null;
	    s = s.trim();
	    return s.isEmpty() ? null : s;
	}

	static {
	    Map<String,Integer> m = new HashMap<>();
	    m.put(null, 1);
	    m.put("011", 2);
	    m.put("018", 3);
	    m.put("010", 4);
	    m.put("032", 5);
	    m.put("006", 6);
	    m.put("012", 7);
	    m.put("016", 8);
	    m.put("047", 9);
	    m.put("077", 10);
	    m.put("013", 11);
	    m.put("096", 12);
	    ORDINE = Collections.unmodifiableMap(m);
	}

	private String getFormattedDatetime() {
		String formattedDatetime = null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm:ss:000000");
		ZoneId italyZone = ZoneId.of("Europe/Rome");
		formattedDatetime = LocalDateTime.now(italyZone).format(formatter);
		LOGGER.debug("FORMATTED DATE TIME OF REQUEST: " + formattedDatetime);
		return formattedDatetime;

	}
	
	public ResponseEntity<RicercaDocumentiHXEPostSPResponse> RicercaDocumentiDisponibili(String xAzbFacode,
			String xAzbClientname, String xAzbTimestamp, String xAzbUser, String xAzbDevice,
			RicercaDocumentiHXEPostSPRequest request) throws NextException {

		RicercaDocumentiHXEPostSPResponse resp;
		try {
			resp = apigeeInfrastracture.sendRicercaDocumenti(xAzbFacode, xAzbClientname,
					xAzbTimestamp, xAzbUser, xAzbDevice, request);
		} catch (UnsupportedEncodingException e) {
			throw new NextException("Token generation error", e, ErrorType.ERROR, null,
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if (resp != null) {
			return new ResponseEntity<RicercaDocumentiHXEPostSPResponse>(resp, HttpStatus.OK);
		} else {
			throw new NextException("No values found for the given code: " + xAzbFacode, null, ErrorType.ERROR, null,
					HttpStatus.NOT_FOUND);
		}
	}

	private MyPostBankDocumentSearchResponse populateDocumentSearchResponse_datiComuni(
			RiepilogoDocumentiDisponibiliHXSPResponseRiepilogoDocumentiDisponibiliHXSPResponseRiepilogoDocumento doc) {
		MyPostBankDocumentSearchResponse elem = new MyPostBankDocumentSearchResponse();

		elem.setData(doc.getData());
		elem.setProgressivo(doc.getProgressivo());
		elem.setCodiceDocumento(doc.getCodiceDocumento());
		elem.setCodiceModelloEPost(doc.getCodiceModelloEPost());
		elem.setNdg(doc.getNdg());
		if (doc.getRapporto() != null && doc.getRapporto().getSecOldIntestato() != null
				&& doc.getRapporto().getSecOldIntestato().getIntestazione() != null) {
			elem.setIntestazione(doc.getRapporto().getSecOldIntestato().getIntestazione());
		}
		if (doc.getStatiDocumento() != null) {
			if (doc.getStatiDocumento().getFlagPreferito() != null) {
				elem.setFlgPreferito(doc.getStatiDocumento().getFlagPreferito());
			}
			if (doc.getStatiDocumento().getFlagVisualizzato() != null) {
				elem.setFlgVisualizzato(doc.getStatiDocumento().getFlagVisualizzato());
			}
		}
		if (doc.getCodiceDocumento() != null && doc.getCodiceDocumento().getCodice() != null) {
			String stringDecode = decodeUtilsRepository.decodeFieldWithoutFilter(CommonConstants.Apigee.APIGEE,
					CommonConstants.Apigee.TIPODOC, CommonConstants.Apigee.DESCRTIPODOC,
					doc.getCodiceDocumento().getCodice());
			if (stringDecode != null) {
				elem.setNomeFile(stringDecode);
			}
		}

		return elem;
	}

	public List<MyPostBankDocumentSearchResponse> listaDocumentiDisponibili(String xAzbFacode, String xAzbClientname,
			String xAzbTimestamp, String xAzbUser, String xAzbDevice, String ndgClient, String filiale, String agenzia,
			String deposito, String sottodeposito, String gesiSecUser, MyPostBankDocumentSearchRequest request)
			throws NextException, JsonProcessingException {
		List<MyPostBankDocumentSearchResponse> retVal = new ArrayList<MyPostBankDocumentSearchResponse>();
		String messageid = UUID.randomUUID().toString() + "_US_" + xAzbUser;
		String intestazione = "mypostbankService listaDocumentiDisponibili: " + messageid + " ";

		try {
			// Se date vuote il range deve essere gli ultimi 5 anni
			{
				LOGGER.info(intestazione + " body of request  " + objectMapper.writeValueAsString(request));
				LocalDateTime now = LocalDateTime.now();

				// Formatter con formato anno mese giorno
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

				if (isNullOrEmpty(request.getStartDate())) {
					LocalDateTime five_years_ago = now.minusYears(5);
					request.setStartDate(five_years_ago.format(formatter));
				}
				if (isNullOrEmpty(request.getEndDate())) {
					request.setEndDate(now.format(formatter));
				}
				if (!isNullOrEmpty(request.getStartDate()) && isNullOrEmpty(request.getEndDate())
						&& LocalDate.parse(request.getStartDate(), formatter).atStartOfDay().minusYears(5)
								.isBefore(now.minusYears(5)))
					throw new NextException("Start date should not be before five years from now");
			}

			FinPromotore promo = faRepository.findByCodPromotore(xAzbFacode);
			if (promo == null) {
				throw new NextException("No advisory found", null, ErrorType.ERROR, null, HttpStatus.NOT_FOUND);
			}

			FinSoggetto sogg = this.subjectServiceUtils.getOnlySubjectOrProspect(ndgClient, xAzbFacode);
			if (sogg == null) {
				throw new NextException("No customer found", null, ErrorType.ERROR, null, HttpStatus.NOT_FOUND);
			}
			Promotore pf = new Promotore(gesiSecUser);
			pf.setPromo(promo);
			pf.setRete(promo.getCodRete());
			pf.setCodice(promo.getCodPromotore());

			Cliente cli = new Cliente();
			cli.setCodUserMc(sogg.getCodUserMc());

			// Faccio l'init Promotore una sola volta
			SecServizi.initPromotore(pf);

			// Faccio la chiamata a APIGEE
			it.allianz.next.sec.servizi.pf.Contratto contratto = this.secServicesUtilities.getContrattoApigee(pf, cli,
					filiale, deposito, Integer.parseInt(sottodeposito), request);

			ApigeeDatiContratto datiCtrl = new ApigeeDatiContratto();

			if (contratto != null && contratto.getCategoria() != null) {
				datiCtrl.setCategoria(contratto.getCategoria());
			} else {
				datiCtrl.setCategoria("RET");
			}
			if (contratto != null && contratto.getNumero() != null) {
				datiCtrl.setNumero(contratto.getNumero());
			} else {
				datiCtrl.setNumero("8081000508400000");
			}
			if (contratto != null && contratto.getProgressivo() != null) {
				datiCtrl.setProgressivo(contratto.getProgressivo());
			} else {
				datiCtrl.setProgressivo("1");
			}
			if (contratto != null && contratto.getTipo() != null) {
				datiCtrl.setTipo(contratto.getTipo());
			} else {
				datiCtrl.setTipo("PR");
			}

			request.setDatiContratto(datiCtrl);

			String ndg = getNdgString(request.getNdg());
            List<RiepilogoDocumentiDisponibiliHXSPRequest> documentList = riepilogoDocumentiMapper.getRequest(request, ndg);
			for (RiepilogoDocumentiDisponibiliHXSPRequest rdr : documentList) {
				RiepilogoDocumentiDisponibiliHXSPResponse rdd = apigeeInfrastracture.sendRiepilogoDocDisponibili(
						xAzbFacode, xAzbClientname, xAzbTimestamp, xAzbUser, xAzbDevice, ndgClient, filiale, agenzia,
						deposito, sottodeposito, gesiSecUser, rdr);
				
				if (rdd != null && rdd.getRiepilogoDocumentiDisponibiliHXSPResponse() != null
								&& rdd.getRiepilogoDocumentiDisponibiliHXSPResponse().getRiepilogoDocumento() != null) {
                    List<RiepilogoDocumentiDisponibiliHXSPResponseRiepilogoDocumentiDisponibiliHXSPResponseRiepilogoDocumento> test =rdd.getRiepilogoDocumentiDisponibiliHXSPResponse().getRiepilogoDocumento();
					for (RiepilogoDocumentiDisponibiliHXSPResponseRiepilogoDocumentiDisponibiliHXSPResponseRiepilogoDocumento doc : test) {
						// Verifico che tipo di documenti stiamo analizzando
						if (this.checkCaseNdg(request)) {
							// NDG
							RicercaDocumentiPerNdgHXSPRequest requestNdg = ricercaDocumentoPerNdgMapper
									.getRequest(doc,request, getNdg(request.getNdg()));


                            RicercaDocumentiPerNdgHXSPResponse rndg = apigeeInfrastracture.sendRicercaDocumentiPerNdg(
                                    xAzbFacode, xAzbClientname, xAzbTimestamp, xAzbUser, xAzbDevice, requestNdg);
                            if (rndg != null
                                    && rndg.getRicercaDocumentiPerNdgHXSPResponse() != null
                                    && rndg.getRicercaDocumentiPerNdgHXSPResponse().getElencoDocumenti() != null) {
                                for (RicercaDocumentiPerNdgHXSPResponseRicercaDocumentiPerNdgHXSPResponseElencoDocumenti docNdg : rndg
                                        .getRicercaDocumentiPerNdgHXSPResponse().getElencoDocumenti()) {
                                    MyPostBankDocumentSearchResponse elem = populateDocumentSearchResponse_datiComuni(
                                            doc);
                                    //per documenti personali metto come intestazione nome e cognome
                                    if (request.getCategoria().getDescrizione()
                                            .equals("Documenti Personali Cliente"))
                                        elem.setIntestazione(sogg.getName() + " " +sogg.getSurname());
                                    elem.setData(docNdg.getData());
                                    elem.setDataArchiviazione(docNdg.getDataArchiviazione());
                                    elem.setPID(docNdg.getPID());

                                    retVal.add(elem);
                                }
                            }

						} else {
							// CONTO CORRENTE / DT
							RicercaDocumentiPerContoHXSPRequestRicercaDocumentiPerContoHXSPRequest req = ricercaDocumentoPerContoMapper
									.mapRiepilogoToRequest(doc, request);

							if (doc.getRapporto() != null && doc.getRapporto().getDatiCad() != null
									&& doc.getRapporto().getDatiCad().getSottodeposito() != null
									&& doc.getRapporto().getDatiCad().getSottodeposito() != 0) {
								req.setFlagDossierTitoli("S");
							} else {
								req.setFlagDossierTitoli("N");
							}

							RicercaDocumentiPerContoHXSPRequest gr = new RicercaDocumentiPerContoHXSPRequest();
							gr.setRicercaDocumentiPerContoHXSPRequest(req);
							RicercaDocumentiPerContoHXSPResponse rdpcresp = RicercaDocumentiPerConto(xAzbFacode,
									xAzbClientname, xAzbTimestamp, xAzbUser, xAzbDevice, gr);

							if (rdpcresp != null && rdpcresp.getRicercaDocumentiPerContoHXSPResponse() != null
									&& rdpcresp.getRicercaDocumentiPerContoHXSPResponse()
											.getElencoDocumenti() != null) {
								for (RicercaDocumentiPerContoHXSPResponseRicercaDocumentiPerContoHXSPResponseElencoDocumenti docNdg : rdpcresp
										.getRicercaDocumentiPerContoHXSPResponse().getElencoDocumenti()) {
									MyPostBankDocumentSearchResponse elem = populateDocumentSearchResponse_datiComuni(
											doc);

									elem.setData(docNdg.getData());
									elem.setDataArchiviazione(docNdg.getDataArchiviazione());
									elem.setPID(docNdg.getPID());

									String numContratto = null;
									if (request.getSecOld() != null && request.getSecOld().getServizio() != null
											&& request.getSecOld().getServizio().equals("077")) {
										/*numContratto = contractRepository.getNumContrattoDtMyPostBank(
												request.getSecOld().getNumero().toString());
										if (doc.getRapporto().getDatiCad().getSottodeposito() != null) {
											numContratto = numContratto + " "
													+ String.format("%1$" + 2 + "s",
															doc.getRapporto().getDatiCad().getSottodeposito())
															.replace(' ', '0');
										}*/
										if (doc.getRapporto() != null && doc.getRapporto().getDatiCad() != null && doc.getRapporto().getDatiCad().getDeposito() != null) {
											numContratto = doc.getRapporto().getDatiCad().getDeposito().toString();
										} 
									} else if (doc.getRapporto() != null
											&& doc.getRapporto().getSecOldIntestato().getNumero() != null
											&& !doc.getRapporto().getSecOldIntestato().getNumero()
													.equals(BigInteger.ZERO)) {
										numContratto = /*doc.getRapporto().getSecNew().getTipo() + */String
												.format("%1$" + 6 + "s",
														doc.getRapporto().getSecOldIntestato().getNumero())
												.replace(' ', '0');
									} else if (doc.getRapporto() != null && doc.getRapporto().getDatiCad() != null
											&& doc.getRapporto().getDatiCad().getDeposito() != null) {
										numContratto = /*doc.getRapporto().getSecNew().getTipo() + */String
												.format("%1$" + 8 + "s", request.getSecOld().getNumero())
												.replace(' ', '0');
									}
									elem.setNumeroContratto(numContratto);

									retVal.add(elem);
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			LOGGER.error(intestazione + " ERROR exception for user " + xAzbUser + "\n" + e.getMessage());
			RicercaDocumentiHXEPostSPResponseException exception = new RicercaDocumentiHXEPostSPResponseException();
			exception.setMessage(e.getMessage());
			exception.setCode(500);
			exception.setType(e.getClass().getSimpleName());
			exception.setSessionId(messageid);
			RicercaDocumentiHXEPostSPResponse response = new RicercaDocumentiHXEPostSPResponse();
			response.setException(exception);

			throw new NextException(exception.getMessage().toString(), null, ErrorType.ERROR, null,
					HttpStatus.BAD_REQUEST);
		}

		return retVal;
	}

	public MyPostBankScaricoDocResponse scaricoDocumentiApigee(String xAzbFacode, String xAzbClientname,
			String xAzbTimestamp, String xAzbUser, String xAzbDevice, MyPostBankScaricoDocRequest request)
			throws NextException{
		MyPostBankScaricoDocResponse retVal = new MyPostBankScaricoDocResponse();

		ConsultaDocumentoDisponibilePromotoriHXSPRequest consultaDocumentoReqList = consultaDocumentoDisponibilePromotoriMapper
				.getRequest(request);
		ConsultaDocumentoDisponibilePromotoriHXSPResponse resp;
			try {
			resp = apigeeInfrastracture.sendConsultaDocumentoDisponibilePromotori(
					xAzbFacode, xAzbClientname, xAzbTimestamp, xAzbUser, xAzbDevice, consultaDocumentoReqList, null);
		} catch (UnsupportedEncodingException e) {
			throw new NextException("Token generation error", e, ErrorType.ERROR, null,
					HttpStatus.INTERNAL_SERVER_ERROR);
			}

		if (resp != null && resp.getConsultaDocumentoDisponibilePromotoriHXSPResponse() != null) {
			ConsultaDocumentoDisponibilePromotoriHXSPResponseConsultaDocumentoDisponibilePromotoriHXSPResponse rx = resp
					.getConsultaDocumentoDisponibilePromotoriHXSPResponse();
			retVal.setLinkDownload(rx.getLinkDownload());
			retVal.setPathOut(rx.getPathOut());
			retVal.setTipoDocumento(rx.getTipoDocumento());
		}

		return retVal;
	}

	public MyPostBankScaricoDocResponse scaricoDocumentiApigeeWithDownload(String xAzbFacode, String xAzbClientname,
			String xAzbTimestamp, String xAzbUser, String xAzbDevice, MyPostBankScaricoDocRequest request)
			throws NextException{

		MyPostBankScaricoDocResponse retVal = new MyPostBankScaricoDocResponse();
		
		ConsultaDocumentoDisponibilePromotoriHXSPRequest consultaDocumentoReqList = consultaDocumentoDisponibilePromotoriMapper
				.getRequest(request);
		ConsultaDocumentoDisponibilePromotoriHXSPResponse resp;
		try {
			resp = apigeeInfrastracture.sendConsultaDocumentoDisponibilePromotori(
					xAzbFacode, xAzbClientname, xAzbTimestamp, xAzbUser, xAzbDevice, consultaDocumentoReqList, null);
		} catch (UnsupportedEncodingException e) {
			throw new NextException("Token generation error", e, ErrorType.ERROR, null,
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if (resp != null 
				&& resp.getConsultaDocumentoDisponibilePromotoriHXSPResponse() != null) {
			ConsultaDocumentoDisponibilePromotoriHXSPResponseConsultaDocumentoDisponibilePromotoriHXSPResponse rx = resp
					.getConsultaDocumentoDisponibilePromotoriHXSPResponse();

			LOGGER.info("Download del documento inizio..");
			ResponseEntity<String> response = restTemplate.getForEntity(rx.getLinkDownload(), String.class);
			LOGGER.info("Download del documento finito.."+response.getBody());

			retVal.setLinkDownload(rx.getLinkDownload());
			retVal.setPathOut(rx.getPathOut());
			retVal.setTipoDocumento(rx.getTipoDocumento());
			retVal.setFile(Base64.getEncoder().encodeToString(response.getBody().getBytes()));


		}

		return retVal;
	}

	private RicercaDocumentiHXEPostSPRequest creaRequestBody(String ndg) {
		RicercaDocumentiHXEPostSPRequest ret = new RicercaDocumentiHXEPostSPRequest();
		RicercaDocumentiHXEPostSPRequestRicercaDocumentiHXEPostSPRequest ricReq = new RicercaDocumentiHXEPostSPRequestRicercaDocumentiHXEPostSPRequest();

		ricReq.flagConsultazione("S");
		ricReq.setCodiceLingua("");
		{
			RicercaDocumentiHXEPostSPRequestRicercaDocumentiHXEPostSPRequestSecOldEsterno ricOld = new RicercaDocumentiHXEPostSPRequestRicercaDocumentiHXEPostSPRequestSecOldEsterno();

			ricOld.setNumero(BigInteger.valueOf(0));
			ricOld.setCategoria("");
			ricOld.setEnte("");
			ricOld.setServizio("");

			ricReq.setSecOldEsterno(null);
		}

		{
			RicercaDocumentiHXEPostSPRequestRicercaDocumentiHXEPostSPRequestIstituto ricIstituto = new RicercaDocumentiHXEPostSPRequestRicercaDocumentiHXEPostSPRequestIstituto();

			ricIstituto.setCodice(CommonConstants.Apigee.istituto);

			ricReq.setIstituto(ricIstituto);
		}

		{
			RicercaDocumentiHXEPostSPRequestRicercaDocumentiHXEPostSPRequestNdg ricNdg = new RicercaDocumentiHXEPostSPRequestRicercaDocumentiHXEPostSPRequestNdg();

			// Recupero ndg sec
			String ndgSec = finSoggettoRepository.getSecNdgByArcoNdg(ndg);
			if (ndgSec != null) {
				ricNdg.setValore(Integer.parseInt(ndgSec));
				ricReq.setNdg(ricNdg);
			} else {
				ricNdg.setValore(Integer.parseInt(ndg));
				ricReq.setNdg(ricNdg);
			}

		}

		ret.setRicercaDocumentiHXEPostSPRequest(ricReq);

		return ret;
	}

	public ResponseEntity<FiltroRapportiNDGResponse> listaCategorieDisponibili(String xAzbFacode, String xAzbClientname,
			String xAzbTimestamp, String xAzbUser, String xAzbDevice, String ndg) throws NextException {
		try {
			HashMap<String, Set<RicercaDocumentiHXEPostSPResponseRicercaDocumentiHXEPostSPResponseRapporto>> rapportoMap = new HashMap<>();
			HashMap<String, Set<RicercaDocumentiHXEPostSPResponseRicercaDocumentiHXEPostSPResponseElencoDocumentiEPost>> categoriaMap = new HashMap<>();

			String promotoriToExclude = falRepository.getPromotoriNotLinked(Long.valueOf(ndg));
			RicercaDocumentiHXEPostSPRequest request = creaRequestBody(ndg);

			RicercaDocumentiHXEPostSPResponse response = apigeeInfrastracture.sendRicercaDocumenti(xAzbFacode,
					xAzbClientname, xAzbTimestamp, xAzbUser, xAzbDevice, request);

			if (response != null && response.getException() == null) {
				response.getRicercaDocumentiHXEPostSPResponse().getElencoDocumentiEPost().stream().forEach(document -> {
					boolean saltaContratto = false;
					
					List<Long> promotore_contratto = new ArrayList<>();
					Long promotoreId = finPromotoreRepository.getAdvisorIdByAdvisoryCode(xAzbFacode);
					if (document.getRapporto() != null
							&& document.getRapporto().getDatiRapportoSecOld() != null
							&& document.getRapporto().getDatiRapportoSecOld().getNumero() != null
							&& document.getRapporto().getDatiRapportoSecOld().getCategoria() != null
							&& document.getRapporto().getDatiRapportoSecOld().getServizio() != null) {
						promotore_contratto = contractRepository.getPromotoreContrattoMyPostBank(
								document.getRapporto().getDatiRapportoSecOld().getNumero().toString(),
								document.getRapporto().getDatiRapportoSecOld().getCategoria().toString(),
								document.getRapporto().getDatiRapportoSecOld().getServizio().toString());
					}
					
					if (document.getRapporto().getDatiRapportoSecOld().getServizio() == null) {
						saltaContratto = false;
					} else if (promotore_contratto.size() == 0 || promotoreId == null || !promotore_contratto.contains(promotoreId)) {
						saltaContratto = true;
					}

					if (!saltaContratto) {
						String key = document.getRapporto().getDatiRapportoSecOld().toString().trim()
								+ document.getRapporto().getDatiRapportoCad().toString().trim();

								if (rapportoMap.keySet().contains(key)) {
									rapportoMap.get(key).add(document.getRapporto());
									categoriaMap.get(key).add(document);

								} else {
									Set<RicercaDocumentiHXEPostSPResponseRicercaDocumentiHXEPostSPResponseRapporto> rapportoSet = new HashSet<>();
									Set<RicercaDocumentiHXEPostSPResponseRicercaDocumentiHXEPostSPResponseElencoDocumentiEPost> documentSet = new HashSet<>();
									rapportoSet.add(document.getRapporto());
									documentSet.add(document);
									rapportoMap.put(key, rapportoSet);
									categoriaMap.put(key, documentSet);
								}
							}
						});

				FiltroRapportiNDGResponse filtroRapportiNDGResponse = new FiltroRapportiNDGResponse();
				for (String key : rapportoMap.keySet()) {
					rapportoMap.get(key).stream().forEach(rapporto -> {
						RapportoApigee rapportoApigee = new RapportoApigee();
						rapportoApigee.setIntestazione(rapporto.getIntestazione());
						boolean docPersonali = false;
						
						if (rapporto.getDatiRapportoSecOld() != null
								&& rapporto.getDatiRapportoSecOld().getServizio() != null) {

							String stringDecode = decodeUtilsRepository.decodeFieldWithoutFilter(
									CommonConstants.Apigee.MYPOSTBANK, CommonConstants.Apigee.TIPOSRV,
									CommonConstants.Apigee.DESCRSRV, rapporto.getDatiRapportoSecOld().getServizio());

							if (rapporto.getDatiRapportoSecOld().getServizio()
									.equals(CommonConstants.Apigee.DOSSIER_TITOLI)) {
								/* non serve????
								// recupero il numero contratto
								String numContratto = "";
								if (rapporto.getDatiRapportoSecOld().getNumero() != null) {
									numContratto = contractRepository.getNumContrattoDtMyPostBank(rapporto.getDatiRapportoSecOld().getNumero().toString());
								}
								*/
								rapportoApigee.setIntestazioneArco(
										stringDecode + " - " + rapporto.getDatiRapportoCad().getDeposito() + " - "
												+ rapporto.getIntestazione());
							} else {
								rapportoApigee.setIntestazioneArco(
										stringDecode + " - " + rapporto.getDatiRapportoSecOld().getNumero() + " - "
												+ rapporto.getIntestazione());
							}
						} else {
							docPersonali = true;
							rapportoApigee.setIntestazioneArco("Documenti Personali Cliente");
						}
						rapportoApigee.setDatiRapportoSecOld(
								new ApigeeDatiRapportoSecOld(rapporto.getDatiRapportoSecOld().getNumero().toString(),
										rapporto.getDatiRapportoSecOld().getEnte(),
										rapporto.getDatiRapportoSecOld().getCategoria(),
										rapporto.getDatiRapportoSecOld().getServizio()));
						rapportoApigee.setDatiRapportoCad(
								new ApigeeDatiRapportoCad(rapporto.getDatiRapportoCad().getFiliale().toString(),
										rapporto.getDatiRapportoCad().getAgenzia().toString(),
										rapporto.getDatiRapportoCad().getDeposito().toString(),
										rapporto.getDatiRapportoCad().getSottodeposito().toString()));
						ApigeeCategoria categoria = new ApigeeCategoria();

						// aggiungi tutte le tipologie
						List<ApigeeTipologia> topologiaList = new ArrayList<>();
						
						if((!(docPersonali && promotoriToExclude.equals("S")) || !docPersonali || !promotoriToExclude.equals("S"))) {
							// gestisco per prima l'opzione tutti
							ApigeeTipologia tipologia = new ApigeeTipologia(new ApigeeCodiceDocumento("Tutti", ""));
							categoria.setCodice("");
							categoria.setDescrizione("Tutti");
							topologiaList.add(tipologia);
							categoria.setTipologie(topologiaList);
						}
						
						Integer isDocumentoSintesiInserito = 0;
						for (RicercaDocumentiHXEPostSPResponseRicercaDocumentiHXEPostSPResponseElencoDocumentiEPost element : categoriaMap
								.get(key)) {
							// fixme mettere tutte le tipologie
							categoria.setCodice(element.getCodiceModello().getCodice());
							categoria.setDescrizione(element.getCodiceModello().getDescrizione());
							// Possono arrivare dei codici duplicati, li eliminiamo ...
							if (!docPresente(element.getCodiceDocumento().getCodice(), element.getCodiceDocumento().getDescrizione(), topologiaList)
									&& isTipologiaDaConfrontare(element, docPersonali, promotoriToExclude.equals("S"))) {
								ApigeeTipologia tipologia = new ApigeeTipologia(
										new ApigeeCodiceDocumento(element.getCodiceDocumento().getDescrizione(),
												element.getCodiceDocumento().getCodice()));
								topologiaList.add(tipologia);
							}
							categoria.setTipologie(topologiaList);
						}
						rapportoApigee.getCategorie().add(categoria);
						filtroRapportiNDGResponse.getListaRapporti().add(rapportoApigee);
					});
				}

				Comparator<RapportoApigee> cmp = Comparator
					    .comparingInt((RapportoApigee r) -> {
					    	ApigeeDatiRapportoSecOld d = r.getDatiRapportoSecOld();
					        String s = (d != null) ? norm(d.getServizio()) : null;
					        return ORDINE.getOrDefault(s, Integer.MAX_VALUE);
					    })
					    // tie-break opzionali
					    .thenComparing((RapportoApigee r) -> {
					        ApigeeDatiRapportoSecOld d = r.getDatiRapportoSecOld();
					        String cat = (d != null && d.getCategoria() != null) ? d.getCategoria() : "";
					        return cat;
					    }, String.CASE_INSENSITIVE_ORDER)
					    .thenComparing((RapportoApigee r) -> {
					        ApigeeDatiRapportoSecOld d = r.getDatiRapportoSecOld();
					        String num = (d != null && d.getNumero() != null) ? d.getNumero() : "";
					        return num;
					    }, String.CASE_INSENSITIVE_ORDER);

				// loggo post
				filtroRapportiNDGResponse.getListaRapporti().forEach(r -> {
					ApigeeDatiRapportoSecOld d = r.getDatiRapportoSecOld();
				    String srv = (d!=null) ? String.valueOf(d.getServizio()) : "null";
				    LOGGER.info("BEFORE sort: servizio='⟨"+srv+"⟩'");
				});


				List<RapportoApigee> ordinata = filtroRapportiNDGResponse.getListaRapporti()
					    .stream()
					    .sorted(cmp)
					    .collect(Collectors.toList());

				filtroRapportiNDGResponse.setListaRapporti(ordinata);

				// loggo post
				filtroRapportiNDGResponse.getListaRapporti().forEach(r -> {
					ApigeeDatiRapportoSecOld d = r.getDatiRapportoSecOld();
				    String srv = (d!=null) ? String.valueOf(d.getServizio()) : "null";
				    LOGGER.info("AFTER sort: servizio='⟨"+srv+"⟩'");
				});

				return ResponseEntity.of(Optional.of(filtroRapportiNDGResponse));
			} else {
				FiltroRapportiNDGResponse responseFiltro = new FiltroRapportiNDGResponse();
				ApigeeException exception = new ApigeeException();
				if (response != null && response != null) {
					exception.setCode(response.getException().getCode());
					exception.setMessage(response.getException().getMessage());
					exception.setType(response.getException().getType());
					exception.setType(response.getException().getSessionId());
				}
				responseFiltro.setException(exception);
				return ResponseEntity.internalServerError().body(responseFiltro);
			}
		} catch (Exception e) {
			LOGGER.error("ERROR exception \n" + e.getMessage());
			ApigeeException exception = new ApigeeException();
			exception.setMessage(e.getMessage());
			exception.setCode(500);
			exception.setType(e.getClass().getSimpleName());
			FiltroRapportiNDGResponse response = new FiltroRapportiNDGResponse();
			response.setException(exception);

			return ResponseEntity.internalServerError().body(response);
		}
	}

	private boolean docPresente(String codice, String descrizione, List<ApigeeTipologia> tipologiaList) {
		return tipologiaList.stream().filter(x -> x.getCodiceDocumento().getCodice().equalsIgnoreCase(codice)
				&& x.getCodiceDocumento().getDescrizione().equalsIgnoreCase(descrizione)).findAny().isPresent();
	}
	
	private boolean isTipologiaDaConfrontare(
			RicercaDocumentiHXEPostSPResponseRicercaDocumentiHXEPostSPResponseElencoDocumentiEPost elem,
			boolean docPersonali, boolean saltaContratto) {
		return elem != null && elem.getCodiceDocumento() != null && elem.getCodiceDocumento().getDescrizione() != null
				&& ((docPersonali && saltaContratto && elem.getCodiceDocumento().getDescrizione().toUpperCase().equals("PROSPETTO ISEE")
						|| (docPersonali && saltaContratto && elem.getCodiceDocumento().getDescrizione().toUpperCase().equals("CERTIFICAZIONE CAPITAL GAIN")))
						|| !docPersonali || !saltaContratto);
	}

	public RicercaDocumentiPerContoHXSPResponse RicercaDocumentiPerConto(String xAzbFacode, String xAzbClientname,
			String xAzbTimestamp, String xAzbUser, String xAzbDevice, RicercaDocumentiPerContoHXSPRequest request)
			throws NextException{
		return RicercaDocumentiPerConto(xAzbFacode, xAzbClientname, xAzbTimestamp, xAzbUser, xAzbDevice, request, null);
	}

	public RicercaDocumentiPerContoHXSPResponse RicercaDocumentiPerConto(String xAzbFacode, String xAzbClientname,
			String xAzbTimestamp, String xAzbUser, String xAzbDevice, RicercaDocumentiPerContoHXSPRequest request,
			List<Header> headers) throws NextException{
		RicercaDocumentiPerContoHXSPResponse resp;
		try {
			resp = apigeeInfrastracture.sendRicercaDocumentiPerConto(xAzbFacode,
					xAzbClientname, xAzbTimestamp, xAzbUser, xAzbDevice, request, null);
		} catch (UnsupportedEncodingException e) {
			throw new NextException("Token generation error", e, ErrorType.ERROR, null,
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if (resp != null) {
			return resp;
		} else {
			throw new NextException("No values found for the given code: " + xAzbFacode, null, ErrorType.ERROR, null,
					HttpStatus.NOT_FOUND);

		}
	}

	public RiepilogoDocumentiDisponibiliHXSPResponse RiepilogoDocumentiDisponibili(String xAzbFacode,
			String xAzbClientname, String xAzbTimestamp, String xAzbUser, String xAzbDevice,
			RiepilogoDocumentiDisponibiliHXSPRequest request) throws NextException {
		RiepilogoDocumentiDisponibiliHXSPResponse resp;
		try {
			resp = apigeeInfrastracture.sendRiepilogoDocDisponibili(xAzbFacode, xAzbClientname, xAzbTimestamp, xAzbUser, xAzbDevice, xAzbClientname, xAzbFacode, xAzbClientname, xAzbTimestamp, xAzbUser, xAzbDevice, request);
		} catch (UnsupportedEncodingException e) {
			throw new NextException("Token generation error", e, ErrorType.ERROR, null,
					HttpStatus.INTERNAL_SERVER_ERROR);
	}

		if (resp != null) {
			return resp;
		} else {
			throw new NextException("No values found for the given code: " + xAzbFacode, null, ErrorType.ERROR, null,
					HttpStatus.NOT_FOUND);
		}
	}

	private Boolean checkCaseNdg(MyPostBankDocumentSearchRequest req) throws NextException {
		// if secOld is empty the case is for ndg, otherwise conto
		if (req != null && req.getSecOld() != null) {
			RiepilogoDocumentiDisponibiliHXSPRequestRiepilogoDocumentiDisponibiliHXSPRequestSecOld secOld = req
					.getSecOld();
			Boolean result = secOld.getCategoria().isEmpty() && secOld.getNumero().equals(BigInteger.ZERO)
					&& secOld.getServizio().isEmpty() && secOld.getEnte().isEmpty();
			LOGGER.info("This reques is for ndg? " + result);
			return result;
		}
		throw new NextException("Request sprovvista di rapporto", null, ErrorType.ERROR, null, HttpStatus.BAD_REQUEST);
	}

	public static boolean isNullOrEmpty(String str) {
		return str == null || str.isEmpty();
	}

	public Integer getNdg(String ndg) {
		String ndgOutput = this.finSoggettoRepository.getSecNdgByArcoNdg(ndg);
		return ndgOutput == null ? Integer.parseInt(ndg) : Integer.parseInt(ndgOutput);
	}

	public String getNdgString(String ndg) {
		String ndgOutput = this.finSoggettoRepository.getSecNdgByArcoNdg(ndg);
		return ndgOutput == null ? ndg : ndgOutput;
	}

}
