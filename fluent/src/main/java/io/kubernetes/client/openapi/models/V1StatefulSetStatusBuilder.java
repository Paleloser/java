package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1StatefulSetStatusBuilder extends io.kubernetes.client.openapi.models.V1StatefulSetStatusFluentImpl<io.kubernetes.client.openapi.models.V1StatefulSetStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1StatefulSetStatus,io.kubernetes.client.openapi.models.V1StatefulSetStatusBuilder> {

    io.kubernetes.client.openapi.models.V1StatefulSetStatusFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1StatefulSetStatusBuilder() {
        this(true);
    }

    public V1StatefulSetStatusBuilder(java.lang.Boolean validationEnabled) {
        this(new V1StatefulSetStatus(), validationEnabled);
    }

    public V1StatefulSetStatusBuilder(io.kubernetes.client.openapi.models.V1StatefulSetStatusFluent<?> fluent) {
        this(fluent, true);
    }

    public V1StatefulSetStatusBuilder(io.kubernetes.client.openapi.models.V1StatefulSetStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1StatefulSetStatus(), validationEnabled);
    }

    public V1StatefulSetStatusBuilder(io.kubernetes.client.openapi.models.V1StatefulSetStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1StatefulSetStatus instance) {
        this(fluent, instance, true);
    }

    public V1StatefulSetStatusBuilder(io.kubernetes.client.openapi.models.V1StatefulSetStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1StatefulSetStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withCollisionCount(instance.getCollisionCount());
        
        fluent.withConditions(instance.getConditions());
        
        fluent.withCurrentReplicas(instance.getCurrentReplicas());
        
        fluent.withCurrentRevision(instance.getCurrentRevision());
        
        fluent.withObservedGeneration(instance.getObservedGeneration());
        
        fluent.withReadyReplicas(instance.getReadyReplicas());
        
        fluent.withReplicas(instance.getReplicas());
        
        fluent.withUpdateRevision(instance.getUpdateRevision());
        
        fluent.withUpdatedReplicas(instance.getUpdatedReplicas());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1StatefulSetStatusBuilder(io.kubernetes.client.openapi.models.V1StatefulSetStatus instance) {
        this(instance,true);
    }

    public V1StatefulSetStatusBuilder(io.kubernetes.client.openapi.models.V1StatefulSetStatus instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withCollisionCount(instance.getCollisionCount());
        
        this.withConditions(instance.getConditions());
        
        this.withCurrentReplicas(instance.getCurrentReplicas());
        
        this.withCurrentRevision(instance.getCurrentRevision());
        
        this.withObservedGeneration(instance.getObservedGeneration());
        
        this.withReadyReplicas(instance.getReadyReplicas());
        
        this.withReplicas(instance.getReplicas());
        
        this.withUpdateRevision(instance.getUpdateRevision());
        
        this.withUpdatedReplicas(instance.getUpdatedReplicas());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1StatefulSetStatus build() {
        V1StatefulSetStatus buildable = new V1StatefulSetStatus();
        buildable.setCollisionCount(fluent.getCollisionCount());
        buildable.setConditions(fluent.getConditions());
        buildable.setCurrentReplicas(fluent.getCurrentReplicas());
        buildable.setCurrentRevision(fluent.getCurrentRevision());
        buildable.setObservedGeneration(fluent.getObservedGeneration());
        buildable.setReadyReplicas(fluent.getReadyReplicas());
        buildable.setReplicas(fluent.getReplicas());
        buildable.setUpdateRevision(fluent.getUpdateRevision());
        buildable.setUpdatedReplicas(fluent.getUpdatedReplicas());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1StatefulSetStatusBuilder that = (V1StatefulSetStatusBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
