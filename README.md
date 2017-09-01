# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.PricesApi;

import java.io.File;
import java.util.*;

public class PricesApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api-sandbox.netshoes.com.br/api/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PricesApi* | [**getPriceProductBySku**](docs/PricesApi.md#getPriceProductBySku) | **GET** /products/{sku}/prices | Get price of the product
*PricesApi* | [**savePriceProductBySku**](docs/PricesApi.md#savePriceProductBySku) | **POST** /products/{sku}/prices | Save a newly created price of the product
*PricesApi* | [**updatePriceProductBySku**](docs/PricesApi.md#updatePriceProductBySku) | **PUT** /products/{sku}/prices | Update price of the product
*ProductsApi* | [**getProductBySku**](docs/ProductsApi.md#getProductBySku) | **GET** /products/{sku} | Get product by sku
*ProductsApi* | [**getProducts**](docs/ProductsApi.md#getProducts) | **GET** /products | Get list of products
*ProductsApi* | [**getStatusProductBySku**](docs/ProductsApi.md#getStatusProductBySku) | **GET** /products/{sku}/status | Get product status
*ProductsApi* | [**saveProduct**](docs/ProductsApi.md#saveProduct) | **POST** /products | Create a new product.
*ProductsApi* | [**updateProduct**](docs/ProductsApi.md#updateProduct) | **PUT** /products/{sku} | Update a product.
*ProductsApi* | [**updateProductStatusBySku**](docs/ProductsApi.md#updateProductStatusBySku) | **PUT** /products/{sku}/status | Update product status. Only sandbox
*StocksApi* | [**getStockProductBySku**](docs/StocksApi.md#getStockProductBySku) | **GET** /products/{sku}/stocks | Get stock of the product
*StocksApi* | [**saveStockProductBySku**](docs/StocksApi.md#saveStockProductBySku) | **POST** /products/{sku}/stocks | Save a newly created stock quantity of the product
*StocksApi* | [**updateStockProductBySku**](docs/StocksApi.md#updateStockProductBySku) | **PUT** /products/{sku}/stocks | Update stock of the product


## Documentation for Models

 - [AttributeRequest](docs/AttributeRequest.md)
 - [AttributeResponse](docs/AttributeResponse.md)
 - [Body](docs/Body.md)
 - [Body1](docs/Body1.md)
 - [Body2](docs/Body2.md)
 - [Body3](docs/Body3.md)
 - [Body4](docs/Body4.md)
 - [Body5](docs/Body5.md)
 - [Body6](docs/Body6.md)
 - [ImageRequest](docs/ImageRequest.md)
 - [ImageResponse](docs/ImageResponse.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2001Reviews](docs/InlineResponse2001Reviews.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse200Items](docs/InlineResponse200Items.md)
 - [InlineResponse200ItemsAttributes](docs/InlineResponse200ItemsAttributes.md)
 - [InlineResponse200ItemsImages](docs/InlineResponse200ItemsImages.md)
 - [InlineResponse200ItemsLinks](docs/InlineResponse200ItemsLinks.md)
 - [Link](docs/Link.md)
 - [ListProductResponse](docs/ListProductResponse.md)
 - [PriceRequest](docs/PriceRequest.md)
 - [PriceResponse](docs/PriceResponse.md)
 - [ProductRequest](docs/ProductRequest.md)
 - [ProductResponse](docs/ProductResponse.md)
 - [ProductStatusRequest](docs/ProductStatusRequest.md)
 - [ProductStatusResponse](docs/ProductStatusResponse.md)
 - [ProductsAttributes](docs/ProductsAttributes.md)
 - [ProductsImages](docs/ProductsImages.md)
 - [Review](docs/Review.md)
 - [StockRequest](docs/StockRequest.md)
 - [StockResponse](docs/StockResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### access_token

- **Type**: API key
- **API key parameter name**: access_token
- **Location**: HTTP header

### client_id

- **Type**: API key
- **API key parameter name**: client_id
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



