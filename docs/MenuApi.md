# MenuApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**menuGet**](MenuApi.md#menuGet) | **GET** /menu/ | 

<a name="menuGet"></a>
# **menuGet**
> InlineResponse20018 menuGet()



Get the menu data structure. Returns a forest like structure with the menu the user has access to

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.MenuApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MenuApi apiInstance = new MenuApi();
try {
    InlineResponse20018 result = apiInstance.menuGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuApi#menuGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

