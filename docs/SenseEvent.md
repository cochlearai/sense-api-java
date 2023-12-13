

# SenseEvent

Contains data returned by the model 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | [**List&lt;SenseEventTag&gt;**](SenseEventTag.md) | Contains results of what has been inferenced at the same time  | 
**startTime** | **Double** | Represent the start of the window, in the second, where inference was done. *Note that start_time will increase by window_hop on every step*  | 
**endTime** | **Double** | Represent the end of the window, in the second where inference was done. *Note that end_time is window_length after start_time*  | 



