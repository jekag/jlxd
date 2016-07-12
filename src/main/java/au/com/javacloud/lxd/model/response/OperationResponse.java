package au.com.javacloud.lxd.model.response;

import au.com.javacloud.lxd.model.Operation;

/**
 * Created by david.vittor on 12/07/16.
 */
public class OperationResponse extends AbstractResponse {
    private Operation metadata;

    @Override
    public Operation getMetadata() {
        return metadata;
    }

    public void setMetadata(Operation metadata) {
        this.metadata = metadata;
    }

}
