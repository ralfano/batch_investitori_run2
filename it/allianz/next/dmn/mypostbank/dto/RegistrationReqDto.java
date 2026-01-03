package it.allianz.next.dmn.mypostbank.dto;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * RegistrationReqDto
 */

public class RegistrationReqDto  implements Serializable {

  @JsonProperty("client_id")
  private String clientId = null;

  @JsonProperty("client_secret")
  private String clientSecret = null;

  @JsonProperty("grant_type")
  private String grantType = null;

  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public String getGrantType() {
    return grantType;
  }

  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }

  public MultiValueMap<String, String> toFormEncodedBody(){
    MultiValueMap<String, String> map= new LinkedMultiValueMap<>();
    map.add("client_id", this.clientId);
    map.add("client_secret", this.clientSecret);
    map.add("grant_type", this.grantType);
    return map;
  }

}

