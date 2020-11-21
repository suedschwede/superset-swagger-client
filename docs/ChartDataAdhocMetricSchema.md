# ChartDataAdhocMetricSchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregate** | [**AggregateEnum**](#AggregateEnum) | Aggregation operator. Only required for simple expression types. |  [optional]
**column** | [**ChartDataColumn**](ChartDataColumn.md) |  |  [optional]
**expressionType** | [**ExpressionTypeEnum**](#ExpressionTypeEnum) | Simple or SQL metric | 
**hasCustomLabel** | **Boolean** | When false, the label will be automatically generated based on the aggregate expression. When true, a custom label has to be specified. |  [optional]
**label** | **String** | Label for the metric. Is automatically generated unless hasCustomLabel is true, in which case label must be defined. |  [optional]
**optionName** | **String** | Unique identifier. Can be any string value, as long as all metrics have a unique identifier. If undefined, a random name will be generated. |  [optional]
**sqlExpression** | **String** | The metric as defined by a SQL aggregate expression. Only required for SQL expression type. |  [optional]

<a name="AggregateEnum"></a>
## Enum: AggregateEnum
Name | Value
---- | -----
AVG | &quot;AVG&quot;
COUNT | &quot;COUNT&quot;
COUNT_DISTINCT | &quot;COUNT_DISTINCT&quot;
MAX | &quot;MAX&quot;
MIN | &quot;MIN&quot;
SUM | &quot;SUM&quot;

<a name="ExpressionTypeEnum"></a>
## Enum: ExpressionTypeEnum
Name | Value
---- | -----
SIMPLE | &quot;SIMPLE&quot;
SQL | &quot;SQL&quot;
