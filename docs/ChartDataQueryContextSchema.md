# ChartDataQueryContextSchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datasource** | [**ChartDataDatasource**](ChartDataDatasource.md) |  |  [optional]
**force** | **Boolean** | Should the queries be forced to load from the source. Default: &#x60;false&#x60; |  [optional]
**queries** | [**List&lt;ChartDataQueryObject&gt;**](ChartDataQueryObject.md) |  |  [optional]
**resultFormat** | [**ResultFormatEnum**](#ResultFormatEnum) | Format of result payload |  [optional]
**resultType** | [**ResultTypeEnum**](#ResultTypeEnum) | Type of results to return |  [optional]

<a name="ResultFormatEnum"></a>
## Enum: ResultFormatEnum
Name | Value
---- | -----
JSON | &quot;json&quot;
CSV | &quot;csv&quot;

<a name="ResultTypeEnum"></a>
## Enum: ResultTypeEnum
Name | Value
---- | -----
FULL | &quot;full&quot;
QUERY | &quot;query&quot;
RESULTS | &quot;results&quot;
SAMPLES | &quot;samples&quot;
