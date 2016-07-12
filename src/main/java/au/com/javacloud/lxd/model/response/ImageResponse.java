package au.com.javacloud.lxd.model.response;

import au.com.javacloud.lxd.model.Image;

/**
 * Created by david.vittor on 12/07/16.
 */
public class ImageResponse extends AbstractResponse {
	private Image metadata;

	@Override
	public Image getMetadata() {
		return metadata;
	}

	public void setMetadata(Image metadata) {
		this.metadata = metadata;
	}

}
