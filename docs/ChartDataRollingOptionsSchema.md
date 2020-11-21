# ChartDataRollingOptionsSchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**center** | **Boolean** | Should the label be at the center of the window. Default: &#x60;false&#x60; |  [optional]
**minPeriods** | **Integer** | The minimum amount of periods required for a row to be included in the result set. |  [optional]
**rollingType** | [**RollingTypeEnum**](#RollingTypeEnum) | Type of rolling window. Any numpy function will work. | 
**rollingTypeOptions** | **Object** |  |  [optional]
**winType** | [**WinTypeEnum**](#WinTypeEnum) | Type of window function. See [SciPy window functions](https://docs.scipy.org/doc/scipy/reference/signal.windows.html#module-scipy.signal.windows) for more details. Some window functions require passing additional parameters to &#x60;rolling_type_options&#x60;. For instance, to use &#x60;gaussian&#x60;, the parameter &#x60;std&#x60; needs to be provided. |  [optional]
**window** | **Integer** | Size of the rolling window in days. | 

<a name="RollingTypeEnum"></a>
## Enum: RollingTypeEnum
Name | Value
---- | -----
AVERAGE | &quot;average&quot;
ARGMIN | &quot;argmin&quot;
ARGMAX | &quot;argmax&quot;
CUMSUM | &quot;cumsum&quot;
CUMPROD | &quot;cumprod&quot;
MAX | &quot;max&quot;
MEAN | &quot;mean&quot;
MEDIAN | &quot;median&quot;
NANSUM | &quot;nansum&quot;
NANMIN | &quot;nanmin&quot;
NANMAX | &quot;nanmax&quot;
NANMEAN | &quot;nanmean&quot;
NANMEDIAN | &quot;nanmedian&quot;
MIN | &quot;min&quot;
PERCENTILE | &quot;percentile&quot;
PROD | &quot;prod&quot;
PRODUCT | &quot;product&quot;
STD | &quot;std&quot;
SUM | &quot;sum&quot;
VAR | &quot;var&quot;

<a name="WinTypeEnum"></a>
## Enum: WinTypeEnum
Name | Value
---- | -----
BOXCAR | &quot;boxcar&quot;
TRIANG | &quot;triang&quot;
BLACKMAN | &quot;blackman&quot;
HAMMING | &quot;hamming&quot;
BARTLETT | &quot;bartlett&quot;
PARZEN | &quot;parzen&quot;
BOHMAN | &quot;bohman&quot;
BLACKMANHARRIS | &quot;blackmanharris&quot;
NUTTALL | &quot;nuttall&quot;
BARTHANN | &quot;barthann&quot;
KAISER | &quot;kaiser&quot;
GAUSSIAN | &quot;gaussian&quot;
GENERAL_GAUSSIAN | &quot;general_gaussian&quot;
SLEPIAN | &quot;slepian&quot;
EXPONENTIAL | &quot;exponential&quot;
