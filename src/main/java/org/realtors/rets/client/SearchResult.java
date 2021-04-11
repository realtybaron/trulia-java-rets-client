package org.realtors.rets.client;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Interface for retrieving additional information from of a result from a RETS query/search
 *
 */

public interface SearchResult extends SearchResultInfo {
    public String[] getRow(int idx) throws NoSuchElementException;

    public Iterator iterator();

    public String[] getColumns();

    public boolean isMaxRows();

    public int getCount();

    public boolean isComplete();
}
