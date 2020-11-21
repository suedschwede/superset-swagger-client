# LogRestApiApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logGet**](LogRestApiApi.md#logGet) | **GET** /log/ | 
[**logPkGet**](LogRestApiApi.md#logPkGet) | **GET** /log/{pk} | 
[**logPost**](LogRestApiApi.md#logPost) | **POST** /log/ | 

<a name="logGet"></a>
# **logGet**
> InlineResponse20016 logGet(q)



Get a list of models

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.LogRestApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LogRestApiApi apiInstance = new LogRestApiApi();
GetListSchema q = new GetListSchema(); // GetListSchema | 
try {
    InlineResponse20016 result = apiInstance.logGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogRestApiApi#logGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetListSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="logPkGet"></a>
# **logPkGet**
> InlineResponse20017 logPkGet(pk, q)



Get an item model

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.LogRestApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LogRestApiApi apiInstance = new LogRestApiApi();
Integer pk = 56; // Integer | 
GetItemSchema q = new GetItemSchema(); // GetItemSchema | 
try {
    InlineResponse20017 result = apiInstance.logPkGet(pk, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogRestApiApi#logPkGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **q** | [**GetItemSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="logPost"></a>
# **logPost**
> InlineResponse2013 logPost(body)



### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.LogRestApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LogRestApiApi apiInstance = new LogRestApiApi();
LogRestApiPost body = new LogRestApiPost(); // LogRestApiPost | Model schema
try {
    InlineResponse2013 result = apiInstance.logPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogRestApiApi#logPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LogRestApiPost**](LogRestApiPost.md)| Model schema |

### Return type

[**InlineResponse2013**](InlineResponse2013.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

