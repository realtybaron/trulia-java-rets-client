package org.realtors.rets.client;

import java.io.InputStream;
import java.util.Map;

/**
 * Interface for retrieving useful header fields from a RETS HTTP response
 */

public interface RetsHttpResponse {
    int getResponseCode() throws RetsException;

    Map getHeaders() throws RetsException;

    String getHeader(String hdr) throws RetsException;

    String getCookie(String cookie) throws RetsException;

    String getCharset() throws RetsException;

    InputStream getInputStream() throws RetsException;

    Map getCookies() throws RetsException;

}