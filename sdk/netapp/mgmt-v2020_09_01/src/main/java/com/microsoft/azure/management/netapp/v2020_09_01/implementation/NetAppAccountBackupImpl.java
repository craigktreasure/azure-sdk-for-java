/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_09_01.implementation;

import com.microsoft.azure.management.netapp.v2020_09_01.NetAppAccountBackup;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;

class NetAppAccountBackupImpl extends IndexableRefreshableWrapperImpl<NetAppAccountBackup, BackupInner> implements NetAppAccountBackup {
    private final NetAppManager manager;
    private String resourceGroupName;
    private String accountName;
    private String backupName;

    NetAppAccountBackupImpl(BackupInner inner,  NetAppManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "netAppAccounts");
        this.backupName = IdParsingUtils.getValueFromIdByName(inner.id(), "accountBackups");
    }

    @Override
    public NetAppManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<BackupInner> getInnerAsync() {
        AccountBackupsInner client = this.manager().inner().accountBackups();
        return client.getAsync(this.resourceGroupName, this.accountName, this.backupName);
    }



    @Override
    public String backupId() {
        return this.inner().backupId();
    }

    @Override
    public String backupType() {
        return this.inner().backupType();
    }

    @Override
    public DateTime creationDate() {
        return this.inner().creationDate();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String label() {
        return this.inner().label();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Long size() {
        return this.inner().size();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
