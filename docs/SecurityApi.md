# SecurityApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**securityLoginPost**](SecurityApi.md#securityLoginPost) | **POST** /security/login | 
[**securityRefreshPost**](SecurityApi.md#securityRefreshPost) | **POST** /security/refresh | 

<a name="securityLoginPost"></a>
# **securityLoginPost**
> InlineResponse20021 securityLoginPost(body)



Authenticate and get a JWT access and refresh token

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.client.SecurityApi;


SecurityApi apiInstance = new SecurityApi();
Body body = new Body(); // Body | 
try {
    InlineResponse20021 result = apiInstance.securityLoginPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#securityLoginPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body**](Body.md)|  |

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="securityRefreshPost"></a>
# **securityRefreshPost**
> InlineResponse20022 securityRefreshPost()



Use the refresh token to get a new JWT access token

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SecurityApi apiInstance = new SecurityApi();
try {
    InlineResponse20022 result = apiInstance.securityRefreshPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#securityRefreshPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[jwt_refresh](../README.md#jwt_refresh)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

