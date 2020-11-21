# OpenApiApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**openapiVersionOpenapiGet**](OpenApiApi.md#openapiVersionOpenapiGet) | **GET** /openapi/{version}/_openapi | 

<a name="openapiVersionOpenapiGet"></a>
# **openapiVersionOpenapiGet**
> Object openapiVersionOpenapiGet(version)



Get the OpenAPI spec for a specific API version

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.OpenApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


OpenApiApi apiInstance = new OpenApiApi();
String version = "version_example"; // String | 
try {
    Object result = apiInstance.openapiVersionOpenapiGet(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenApiApi#openapiVersionOpenapiGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**|  |

### Return type

**Object**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

