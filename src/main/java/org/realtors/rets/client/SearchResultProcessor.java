package org.realtors.rets.client;

import java.io.InputStream;
import java.io.Reader;

/**
 * Interface for parsing results from a RETS query/search
 */
public interface SearchResultProcessor {
    SearchResultSet parse(InputStream in) throws RetsException;

    SearchResultSet parse(Reader in) throws RetsException;
}
