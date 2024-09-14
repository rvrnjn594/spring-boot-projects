package com.vendor.rest_api.service.impl;

import com.vendor.rest_api.exception.CloudVendorNotFoundException;
import com.vendor.rest_api.model.CloudVendor;
import com.vendor.rest_api.repository.CloudVendorRepository;
import com.vendor.rest_api.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "CloudVendor created. Congratulations! Success!!!";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "CloudVendor is updated successfully. Congratulations!!!";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        cloudVendorRepository.deleteById(vendorId);
        return "CloudVendor deleted successfully. Congratulations!!!";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {
        if (cloudVendorRepository.findById((vendorId)).isEmpty())
            throw new CloudVendorNotFoundException("Requested Cloud Vendor Does Not Exist!");
        return cloudVendorRepository.findById(vendorId).get();

    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
