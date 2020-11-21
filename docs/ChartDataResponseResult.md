# ChartDataResponseResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cacheKey** | **String** | Unique cache key for query object | 
**cacheTimeout** | **Integer** | Cache timeout in following order: custom timeout, datasource timeout, default config timeout. | 
**cachedDttm** | **String** | Cache timestamp | 
**data** | **List&lt;Object&gt;** | A list with results |  [optional]
**error** | **String** | Error |  [optional]
**isCached** | **Boolean** | Is the result cached | 
**query** | **String** | The executed query statement | 
**rowcount** | **Integer** | Amount of rows in result set |  [optional]
**stacktrace** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the query |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
STOPPED | &quot;stopped&quot;
FAILED | &quot;failed&quot;
PENDING | &quot;pending&quot;
RUNNING | &quot;running&quot;
SCHEDULED | &quot;scheduled&quot;
SUCCESS | &quot;success&quot;
TIMED_OUT | &quot;timed_out&quot;
