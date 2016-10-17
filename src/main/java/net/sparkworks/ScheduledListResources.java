package net.sparkworks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by kanakisn on 17/10/2016.
 */
@Component
public class ScheduledListResources {
    
    private static final Logger log = LoggerFactory.getLogger(ScheduledListResources.class);
    
    private final SparkworksApiService sparkworksApiService;
    
    public ScheduledListResources(SparkworksApiService sparkworksApiService) {
        this.sparkworksApiService = sparkworksApiService;
    }
    
    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {
        log.info("Sparkworks resources are:", sparkworksApiService.listAllResources());
    }
    
}
