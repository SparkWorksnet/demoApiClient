package net.sparkworks;

import net.sparkworks.core.client.SparkworksClient;
import net.sparkworks.core.dto.ResourceListDTO;
import org.springframework.stereotype.Service;

/**
 * Created by kanakisn on 17/10/2016.
 */
@Service
public class SparkworksApiService {
    
    private final SparkworksClient sparkworksClient;
    
    public SparkworksApiService(final SparkworksClient sparkworksClient) {
        this.sparkworksClient = sparkworksClient;
    }
    
    public ResourceListDTO listAllResources() {
        return sparkworksClient.listResources();
    }
    
}
