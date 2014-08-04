package edu.berkeley.veloxms.storage;

/**
 * Simple interface to abstract out the KV storage backend used to store
 * the models from the application logic to access them.
 */
public interface ModelStorage {

    /**
     * Get factor vector for provided item
     * @param itemId the item id to get
     */
    public double[] getItemFactors(long itemId);

    public double[] getUserFactors(long itemId);

}

