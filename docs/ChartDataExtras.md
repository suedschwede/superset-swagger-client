# ChartDataExtras

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**druidTimeOrigin** | **String** | Starting point for time grain counting on legacy Druid datasources. Used to change e.g. Monday/Sunday first-day-of-week. |  [optional]
**having** | **String** | HAVING clause to be added to aggregate queries using AND operator. |  [optional]
**havingDruid** | [**List&lt;ChartDataFilter&gt;**](ChartDataFilter.md) | HAVING filters to be added to legacy Druid datasource queries. |  [optional]
**relativeEnd** | [**RelativeEndEnum**](#RelativeEndEnum) | End time for relative time deltas. Default: &#x60;config[\&quot;DEFAULT_RELATIVE_START_TIME\&quot;]&#x60; |  [optional]
**relativeStart** | [**RelativeStartEnum**](#RelativeStartEnum) | Start time for relative time deltas. Default: &#x60;config[\&quot;DEFAULT_RELATIVE_START_TIME\&quot;]&#x60; |  [optional]
**timeGrainSqla** | [**TimeGrainSqlaEnum**](#TimeGrainSqlaEnum) | To what level of granularity should the temporal column be aggregated. Supports [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Durations) durations. |  [optional]
**timeRangeEndpoints** | [**List&lt;TimeRangeEndpointsEnum&gt;**](#List&lt;TimeRangeEndpointsEnum&gt;) |  |  [optional]
**where** | **String** | WHERE clause to be added to queries using AND operator. |  [optional]

<a name="RelativeEndEnum"></a>
## Enum: RelativeEndEnum
Name | Value
---- | -----
TODAY | &quot;today&quot;
NOW | &quot;now&quot;

<a name="RelativeStartEnum"></a>
## Enum: RelativeStartEnum
Name | Value
---- | -----
TODAY | &quot;today&quot;
NOW | &quot;now&quot;

<a name="TimeGrainSqlaEnum"></a>
## Enum: TimeGrainSqlaEnum
Name | Value
---- | -----
PT1S | &quot;PT1S&quot;
PT1M | &quot;PT1M&quot;
PT5M | &quot;PT5M&quot;
PT10M | &quot;PT10M&quot;
PT15M | &quot;PT15M&quot;
PT0_5H | &quot;PT0.5H&quot;
PT1H | &quot;PT1H&quot;
P1D | &quot;P1D&quot;
P1W | &quot;P1W&quot;
P1M | &quot;P1M&quot;
P0_25Y | &quot;P0.25Y&quot;
P1Y | &quot;P1Y&quot;
_1969_12_28T00_00_00Z_P1W | &quot;1969-12-28T00:00:00Z/P1W&quot;
_1969_12_29T00_00_00Z_P1W | &quot;1969-12-29T00:00:00Z/P1W&quot;
P1W_1970_01_03T00_00_00Z | &quot;P1W/1970-01-03T00:00:00Z&quot;
P1W_1970_01_04T00_00_00Z | &quot;P1W/1970-01-04T00:00:00Z&quot;

<a name="List<TimeRangeEndpointsEnum>"></a>
## Enum: List&lt;TimeRangeEndpointsEnum&gt;
Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
INCLUSIVE | &quot;inclusive&quot;
EXCLUSIVE | &quot;exclusive&quot;
