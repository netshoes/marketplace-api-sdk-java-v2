# PricesApi

All URIs are relative to *https://api-sandbox.netshoes.com.br/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPriceProductBySku**](PricesApi.md#getPriceProductBySku) | **GET** /products/{sku}/prices | Get price of the product
[**savePriceProductBySku**](PricesApi.md#savePriceProductBySku) | **POST** /products/{sku}/prices | Save a newly created price of the product
[**updatePriceProductBySku**](PricesApi.md#updatePriceProductBySku) | **PUT** /products/{sku}/prices | Update price of the product


<a name="getPriceProductBySku"></a>
# **getPriceProductBySku**
> InlineResponse2002 getPriceProductBySku(clientId, accessToken, sku)

Get price of the product

Returns the current list and sale prices of the searched product.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PricesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: access_token
ApiKeyAuth access_token = (ApiKeyAuth) defaultClient.getAuthentication("access_token");
access_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//access_token.setApiKeyPrefix("Token");

// Configure API key authorization: client_id
ApiKeyAuth client_id = (ApiKeyAuth) defaultClient.getAuthentication("client_id");
client_id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//client_id.setApiKeyPrefix("Token");

PricesApi apiInstance = new PricesApi();
String clientId = "clientId_example"; // String | The APP Token used to authenticate.
String accessToken = "accessToken_example"; // String | The Access Token used to authenticate.
String sku = "sku_example"; // String | Product's Sku
try {
    InlineResponse2002 result = apiInstance.getPriceProductBySku(clientId, accessToken, sku);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PricesApi#getPriceProductBySku");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The APP Token used to authenticate. |
 **accessToken** | **String**| The Access Token used to authenticate. |
 **sku** | **String**| Product&#39;s Sku |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[access_token](../README.md#access_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="savePriceProductBySku"></a>
# **savePriceProductBySku**
> savePriceProductBySku(clientId, accessToken, sku, body)

Save a newly created price of the product

Saves a new list and/or sale price of a product with no previous price set.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PricesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: access_token
ApiKeyAuth access_token = (ApiKeyAuth) defaultClient.getAuthentication("access_token");
access_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//access_token.setApiKeyPrefix("Token");

// Configure API key authorization: client_id
ApiKeyAuth client_id = (ApiKeyAuth) defaultClient.getAuthentication("client_id");
client_id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//client_id.setApiKeyPrefix("Token");

PricesApi apiInstance = new PricesApi();
String clientId = "clientId_example"; // String | The APP Token used to authenticate.
String accessToken = "accessToken_example"; // String | The Access Token used to authenticate.
String sku = "sku_example"; // String | Product's Sku
Body4 body = new Body4(); // Body4 | Json to send a price value.
try {
    apiInstance.savePriceProductBySku(clientId, accessToken, sku, body);
} catch (ApiException e) {
    System.err.println("Exception when calling PricesApi#savePriceProductBySku");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The APP Token used to authenticate. |
 **accessToken** | **String**| The Access Token used to authenticate. |
 **sku** | **String**| Product&#39;s Sku |
 **body** | [**Body4**](Body4.md)| Json to send a price value. |

### Return type

null (empty response body)

### Authorization

[access_token](../README.md#access_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePriceProductBySku"></a>
# **updatePriceProductBySku**
> updatePriceProductBySku(clientId, accessToken, sku, body)

Update price of the product

Updates the list and/or sale price of the product.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PricesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: access_token
ApiKeyAuth access_token = (ApiKeyAuth) defaultClient.getAuthentication("access_token");
access_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//access_token.setApiKeyPrefix("Token");

// Configure API key authorization: client_id
ApiKeyAuth client_id = (ApiKeyAuth) defaultClient.getAuthentication("client_id");
client_id.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//client_id.setApiKeyPrefix("Token");

PricesApi apiInstance = new PricesApi();
String clientId = "clientId_example"; // String | The APP Token used to authenticate.
String accessToken = "accessToken_example"; // String | The Access Token used to authenticate.
String sku = "sku_example"; // String | Product's Sku
Body3 body = new Body3(); // Body3 | Json to send a price value.
try {
    apiInstance.updatePriceProductBySku(clientId, accessToken, sku, body);
} catch (ApiException e) {
    System.err.println("Exception when calling PricesApi#updatePriceProductBySku");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The APP Token used to authenticate. |
 **accessToken** | **String**| The Access Token used to authenticate. |
 **sku** | **String**| Product&#39;s Sku |
 **body** | [**Body3**](Body3.md)| Json to send a price value. |

### Return type

null (empty response body)

### Authorization

[access_token](../README.md#access_token), [client_id](../README.md#client_id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

