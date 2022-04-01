

# CreateSession

Options to create a new session.  Make sure that specified type and content_type are compatible. [more info](https://docs.cochl.ai/todo) 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contentType** | **String** | Type of audio to send. | 
**type** | **AudioType** |  | 
**service** | **String** | Type of audio service. Check [service documentation](https://docs.cochl.ai/todo) for an exaustive list of available services  |  [optional]
**metadatas** | **Map&lt;String, String&gt;** | Type of audio session&#39;s metadatas. Check [metadatas documentation](https://docs.cochl.ai/todo) for an exaustive list of available metadatas  |  [optional]
**totalSize** | **Integer** | If set, it allows to automatically change the state of the session to &#x60;readonly&#x60; when at least &#x60;total_size&#x60; bytes of audio chunk has been uploaded.  For stream, this can be used to limit the maximum duration of the session.  For a file, this allows to automatically start inferencing when the whole file has been sent. We recommend to set the size for files as it allows to do one less API call to start the inferencing  |  [optional]



