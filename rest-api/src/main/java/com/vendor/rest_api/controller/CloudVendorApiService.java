package com.vendor.rest_api.controller;

import com.vendor.rest_api.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorApiService {

    private CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getAllCloudVendor(String vendorId) {
        return this.cloudVendor;
    }

    @PostMapping("create")
    public CloudVendor createCloudVendor(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return this.cloudVendor;
    }

    @PutMapping("update")
    public CloudVendor updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return cloudVendor;
    }

    @DeleteMapping("delete")
    public String deleteCloudVendor() {
        this.cloudVendor = null;
        return "Cloud Vendor is Set to null.";
    }

}
