# QueriesApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryGet**](QueriesApi.md#queryGet) | **GET** /query/ | 
[**queryPkGet**](QueriesApi.md#queryPkGet) | **GET** /query/{pk} | 

<a name="queryGet"></a>
# **queryGet**
> InlineResponse20019 queryGet(q)



Get a list of queries, use Rison or JSON query parameters for filtering, sorting, pagination and  for selecting specific columns and metadata.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.QueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


QueriesApi apiInstance = new QueriesApi();
GetListSchema q = new GetListSchema(); // GetListSchema | 
try {
    InlineResponse20019 result = apiInstance.queryGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueriesApi#queryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetListSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryPkGet"></a>
# **queryPkGet**
> InlineResponse20020 queryPkGet(pk, q)



Get query detail information.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.QueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


QueriesApi apiInstance = new QueriesApi();
Integer pk = 56; // Integer | 
GetItemSchema q = new GetItemSchema(); // GetItemSchema | 
try {
    InlineResponse20020 result = apiInstance.queryPkGet(pk, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueriesApi#queryPkGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **q** | [**GetItemSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

