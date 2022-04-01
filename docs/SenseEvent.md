

# SenseEvent

Contains data returned by the model 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**probability** | **Double** | Probability that the event occurred. 0. means not possible at all and 1. means that it is certain  | 
**startTime** | **Double** | Represent the start of the window, in the second, where inference was done. *Note that start_time will increase by window_hop on every step*  | 
**endTime** | **Double** | Represent the end of the window, in the second where inference was done. *Note that end_time is window_length after start_time*  | 
**tag** | **String** | Name of what was recognized during inference.  | 



