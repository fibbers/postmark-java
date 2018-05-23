package com.wildbit.java.postmark.client.data.model.webhooks;

import com.wildbit.java.postmark.client.data.model.messages.OutboundMessageOpen;

import java.util.HashMap;
import java.util.List;

/**
 * Open webhook object.
 */
public class OpenWebhook extends OutboundMessageOpen {

    private Boolean firstOpen;
    private List<HashMap<String, String>> metadata;

    // GETTERS AND SETTERS

    public List<HashMap<String, String>> getMetadata() { return metadata; }

    public void setMetadata(List<HashMap<String, String>> metadata) { this.metadata = metadata; }

    public Boolean getFirstOpen() {
        return firstOpen;
    }

    public void setFirstOpen(Boolean firstOpen) {
        this.firstOpen = firstOpen;
    }
}
