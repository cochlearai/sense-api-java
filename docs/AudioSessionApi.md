# AudioSessionApi

All URIs are relative to *https://api.cochl.ai/sense/api/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSession**](AudioSessionApi.md#createSession) | **POST** /audio_sessions/ | Create Session
[**deleteSession**](AudioSessionApi.md#deleteSession) | **DELETE** /audio_sessions/{session_id} | Delete Session
[**readStatus**](AudioSessionApi.md#readStatus) | **GET** /audio_sessions/{session_id}/status | Read Status
[**updateSession**](AudioSessionApi.md#updateSession) | **PATCH** /audio_sessions/{session_id} | Update Session
[**uploadChunk**](AudioSessionApi.md#uploadChunk) | **PUT** /audio_sessions/{session_id}/chunks/{chunk_sequence} | Upload Chunk


<a name="createSession"></a>
# **createSession**
> SessionRefs createSession(createSession)

Create Session

Create a new session. An API key is required. Session parameters are immutable and can be set at creation only. 

### Example
```java
// Import classes:
import ai.cochl.client.ApiClient;
import ai.cochl.client.ApiException;
import ai.cochl.client.Configuration;
import ai.cochl.client.auth.*;
import ai.cochl.client.models.*;
import ai.cochl.sense.api.AudioSessionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cochl.ai/sense/api/v0");
    
    // Configure API key authorization: API_Key
    ApiKeyAuth API_Key = (ApiKeyAuth) defaultClient.getAuthentication("API_Key");
    API_Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_Key.setApiKeyPrefix("Token");

    AudioSessionApi apiInstance = new AudioSessionApi(defaultClient);
    CreateSession createSession = new CreateSession(); // CreateSession | 
    try {
      SessionRefs result = apiInstance.createSession(createSession);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioSessionApi#createSession");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSession** | [**CreateSession**](CreateSession.md)|  |

### Return type

[**SessionRefs**](SessionRefs.md)

### Authorization

[API_Key](../README.md#API_Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The session was created successfully  |  -  |
**400** | The parameter is missing or not formatted properly  |  -  |
**401** | Authentication failed. For instance, API key is missing or invalid  |  -  |
**500** | Unexpected server error. If the error persists, you can contact support@cochl.ai to fix the problem.  |  -  |

<a name="deleteSession"></a>
# **deleteSession**
> deleteSession(sessionId)

Delete Session

Change the state of the session to *deleted*. All future call on the session will return 404 

### Example
```java
// Import classes:
import ai.cochl.client.ApiClient;
import ai.cochl.client.ApiException;
import ai.cochl.client.Configuration;
import ai.cochl.client.models.*;
import ai.cochl.sense.api.AudioSessionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cochl.ai/sense/api/v0");

    AudioSessionApi apiInstance = new AudioSessionApi(defaultClient);
    String sessionId = "sessionId_example"; // String | Session id represents a unique identifier for an audio session 
    try {
      apiInstance.deleteSession(sessionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioSessionApi#deleteSession");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| Session id represents a unique identifier for an audio session  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The session successfully deleted  |  -  |
**404** | Resources don&#39;t exist or have been deleted  |  -  |
**500** | Unexpected server error. If the error persists, you can contact support@cochl.ai to fix the problem.  |  -  |

<a name="readStatus"></a>
# **readStatus**
> SessionStatus readStatus(sessionId, offset, count, nextToken)

Read Status

Get session status  *Note that if all chunks didn&#39;t finish to be inferenced, the server will wait for at least one result to be  available in the required page range before returning result. Such waiting can lead to HTTP requests timeout. Therefore we recommend implementing a client retry logic.* 

### Example
```java
// Import classes:
import ai.cochl.client.ApiClient;
import ai.cochl.client.ApiException;
import ai.cochl.client.Configuration;
import ai.cochl.client.models.*;
import ai.cochl.sense.api.AudioSessionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cochl.ai/sense/api/v0");

    AudioSessionApi apiInstance = new AudioSessionApi(defaultClient);
    String sessionId = "sessionId_example"; // String | Session id represents a unique identifier for an audio session 
    Integer offset = 0; // Integer | How many existing elements to skip before returning the first result control how many results to receive 
    Integer count = 1024; // Integer | Limit the length of the returned results array to limit the size of the returned payload 
    String nextToken = "nextToken_example"; // String | The next token can be used from a previous page result. It allows to iterating through all the next elements of a collection. If next_token is set, offset and limit will be ignored 
    try {
      SessionStatus result = apiInstance.readStatus(sessionId, offset, count, nextToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioSessionApi#readStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| Session id represents a unique identifier for an audio session  |
 **offset** | **Integer**| How many existing elements to skip before returning the first result control how many results to receive  | [optional] [default to 0]
 **count** | **Integer**| Limit the length of the returned results array to limit the size of the returned payload  | [optional] [default to 1024]
 **nextToken** | **String**| The next token can be used from a previous page result. It allows to iterating through all the next elements of a collection. If next_token is set, offset and limit will be ignored  | [optional]

### Return type

[**SessionStatus**](SessionStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation  |  -  |
**400** | Parameter is missing or not formatted properly  |  -  |
**404** | Resources don’t exist or have been deleted  |  -  |
**500** | Unexpected server error. If the error persists, you can contact support@cochl.ai to fix the problem.  |  -  |

<a name="updateSession"></a>
# **updateSession**
> updateSession(sessionId, updateSession)

Update Session

Update a session 

### Example
```java
// Import classes:
import ai.cochl.client.ApiClient;
import ai.cochl.client.ApiException;
import ai.cochl.client.Configuration;
import ai.cochl.client.models.*;
import ai.cochl.sense.api.AudioSessionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cochl.ai/sense/api/v0");

    AudioSessionApi apiInstance = new AudioSessionApi(defaultClient);
    String sessionId = "sessionId_example"; // String | Session id represents a unique identifier for an audio session 
    UpdateSession updateSession = new UpdateSession(); // UpdateSession | 
    try {
      apiInstance.updateSession(sessionId, updateSession);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioSessionApi#updateSession");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| Session id represents a unique identifier for an audio session  |
 **updateSession** | [**UpdateSession**](UpdateSession.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The session has been updated successfully  |  -  |
**400** | The parameter is missing or not formatted properly  |  -  |
**404** | Resources don’t exist or have been deleted  |  -  |
**500** | Unexpected server error. If the error persists, you can contact support@cochl.ai to fix the problem.  |  -  |

<a name="uploadChunk"></a>
# **uploadChunk**
> SessionRefs uploadChunk(sessionId, chunkSequence, audioChunk)

Upload Chunk

Upload new audio chunk 

### Example
```java
// Import classes:
import ai.cochl.client.ApiClient;
import ai.cochl.client.ApiException;
import ai.cochl.client.Configuration;
import ai.cochl.client.models.*;
import ai.cochl.sense.api.AudioSessionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.cochl.ai/sense/api/v0");

    AudioSessionApi apiInstance = new AudioSessionApi(defaultClient);
    String sessionId = "sessionId_example"; // String | Session id represents a unique identifier for an audio session 
    Integer chunkSequence = 56; // Integer | Chunk represents the chunk number. This is needed to be a counter starting from 0 and growing by one on each request 
    AudioChunk audioChunk = new AudioChunk(); // AudioChunk | raw binary chunk 
    try {
      SessionRefs result = apiInstance.uploadChunk(sessionId, chunkSequence, audioChunk);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioSessionApi#uploadChunk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sessionId** | **String**| Session id represents a unique identifier for an audio session  |
 **chunkSequence** | **Integer**| Chunk represents the chunk number. This is needed to be a counter starting from 0 and growing by one on each request  |
 **audioChunk** | [**AudioChunk**](AudioChunk.md)| raw binary chunk  |

### Return type

[**SessionRefs**](SessionRefs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The chunk successfully uploaded  |  -  |
**400** | The parameter is missing or not formatted properly  |  -  |
**403** | The session is not writable anymore  |  -  |
**404** | Resources don’t exist or have been deleted  |  -  |
**409** | The chunk sequence is invalid  |  -  |
**413** | Audio chunk size must be smaller than 1MiB  |  -  |
**500** | Unexpected server error. If the error persists, you can contact support@cochl.ai to fix the problem.  |  -  |

