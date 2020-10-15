package com.lavgorush.germes.app.model.search.criteria.range;

/**
 * Pagination parameters for data retrieval operations
 *
 * @author Lavgorush
 */
public class RangeCriteria {
    /**
     * Page index (0-based)
     */
    private final int page;
    /**
     * Number of elements per page.
     * Zero means that we should return all the elements
     */
    private final int rowCount;

    public RangeCriteria(final int page, final int row) {
        this.page = page;
        this.rowCount = row;
    }

    public int getPage() {
        return page;
    }

    public int getRowCount() {
        return rowCount;
    }
}
