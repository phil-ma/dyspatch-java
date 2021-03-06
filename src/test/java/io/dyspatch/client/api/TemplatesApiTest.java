/*
 * Dyspatch API
 * # Introduction  The Dyspatch API is based on the REST paradigm, and features resource based URLs with standard HTTP response codes to indicate errors. We use standard HTTP authentication and request verbs, and all responses are JSON formatted. See our [Implementation Guide](https://docs.dyspatch.io/development/implementing_dyspatch/) for more details on how to implement Dyspatch. 
 *
 * OpenAPI spec version: 2018.08
 * Contact: support@dyspatch.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.dyspatch.client.api;

import io.dyspatch.client.ApiException;
import io.dyspatch.client.model.APIError;
import io.dyspatch.client.model.TemplateRead;
import io.dyspatch.client.model.TemplatesRead;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplatesApi
 */
@Ignore
public class TemplatesApiTest {

    private final TemplatesApi api = new TemplatesApi();

    
    /**
     * List Templates
     *
     * Gets a list of Template Metadata objects for all templates. Up to 25 results returned before results are paginated.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templatesGetTest() throws ApiException {
        String accept = null;
        String cursor = null;
        TemplatesRead response = api.templatesGet(accept, cursor);

        // TODO: test validations
    }
    
    /**
     * Get Template by ID
     *
     * Gets a template object with the matching ID. If the template has published content the \&quot;compiled\&quot; field will contain the template .
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templatesTemplateIdGetTest() throws ApiException {
        String templateId = null;
        String accept = null;
        TemplateRead response = api.templatesTemplateIdGet(templateId, accept);

        // TODO: test validations
    }
    
}
