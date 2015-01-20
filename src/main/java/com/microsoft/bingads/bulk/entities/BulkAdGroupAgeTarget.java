/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.bulk.entities;

public class BulkAdGroupAgeTarget extends BulkAgeTarget<BulkAdGroupAgeTargetBid> {
       
    public BulkAdGroupAgeTarget() {
        super(BulkAdGroupAgeTargetBid.class);
    }

    public Long getAdGroupId() {
        return getEntityId();
    }
    
    public void setAdGroupId(Long adGroupId) {
        setEntityId(adGroupId);
    }
    
    public String getAdGroupName() {
        return getEntityName();
    }
    
    public void setAdGroupName(String adGroupName) {
        setEntityName(adGroupName);
    }
    
    public String getCampaignName() {
        return getParentEntityName();
    }
    
    public void setCampaignName(String campaignName) {
        setParentEntityName(campaignName);
    }
    
    @Override
    BulkAdGroupAgeTargetBid createBid() {
        return new BulkAdGroupAgeTargetBid();
    }    
}