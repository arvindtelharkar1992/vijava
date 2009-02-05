/*================================================================================
Copyright (c) 2009 VMware, Inc. All Rights Reserved.

Redistribution and use in source and binary forms, with or without modification, 
are permitted provided that the following conditions are met:

* Redistributions of source code must retain the above copyright notice, 
this list of conditions and the following disclaimer.

* Redistributions in binary form must reproduce the above copyright notice, 
this list of conditions and the following disclaimer in the documentation 
and/or other materials provided with the distribution.

* Neither the name of VMware, Inc. nor the names of its contributors may be used
to endorse or promote products derived from this software without specific prior 
written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL VMWARE, INC. OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, 
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.
================================================================================*/

package com.vmware.vim25;

/**
@author Steve Jin (sjin@vmware.com)
*/

public class TaskInfo extends DynamicData
{
  public String key;
  public ManagedObjectReference task;
  public String name;
  public String descriptionId;
  public ManagedObjectReference entity;
  public String entityName;
  public ManagedObjectReference[] locked;
  public TaskInfoState state;
  public boolean cancelled;
  public boolean cancelable;
  public LocalizedMethodFault error;
  public Object result;
  public Integer progress;
  public TaskReason reason;
  public java.util.Calendar queueTime;
  public java.util.Calendar startTime;
  public java.util.Calendar completeTime;
  public int eventChainId;

  public String getKey()
  {
    return this.key;
  }

  public ManagedObjectReference getTask()
  {
    return this.task;
  }

  public String getName()
  {
    return this.name;
  }

  public String getDescriptionId()
  {
    return this.descriptionId;
  }

  public ManagedObjectReference getEntity()
  {
    return this.entity;
  }

  public String getEntityName()
  {
    return this.entityName;
  }

  public ManagedObjectReference[] getLocked()
  {
    return this.locked;
  }

  public TaskInfoState getState()
  {
    return this.state;
  }

  public boolean isCancelled()
  {
    return this.cancelled;
  }

  public boolean isCancelable()
  {
    return this.cancelable;
  }

  public LocalizedMethodFault getError()
  {
    return this.error;
  }

  public Object getResult()
  {
    return this.result;
  }

  public Integer getProgress()
  {
    return this.progress;
  }

  public TaskReason getReason()
  {
    return this.reason;
  }

  public java.util.Calendar getQueueTime()
  {
    return this.queueTime;
  }

  public java.util.Calendar getStartTime()
  {
    return this.startTime;
  }

  public java.util.Calendar getCompleteTime()
  {
    return this.completeTime;
  }

  public int getEventChainId()
  {
    return this.eventChainId;
  }

  public void setKey(String key)
  {
    this.key=key;
  }

  public void setTask(ManagedObjectReference task)
  {
    this.task=task;
  }

  public void setName(String name)
  {
    this.name=name;
  }

  public void setDescriptionId(String descriptionId)
  {
    this.descriptionId=descriptionId;
  }

  public void setEntity(ManagedObjectReference entity)
  {
    this.entity=entity;
  }

  public void setEntityName(String entityName)
  {
    this.entityName=entityName;
  }

  public void setLocked(ManagedObjectReference[] locked)
  {
    this.locked=locked;
  }

  public void setState(TaskInfoState state)
  {
    this.state=state;
  }

  public void setCancelled(boolean cancelled)
  {
    this.cancelled=cancelled;
  }

  public void setCancelable(boolean cancelable)
  {
    this.cancelable=cancelable;
  }

  public void setError(LocalizedMethodFault error)
  {
    this.error=error;
  }

  public void setResult(Object result)
  {
    this.result=result;
  }

  public void setProgress(Integer progress)
  {
    this.progress=progress;
  }

  public void setReason(TaskReason reason)
  {
    this.reason=reason;
  }

  public void setQueueTime(java.util.Calendar queueTime)
  {
    this.queueTime=queueTime;
  }

  public void setStartTime(java.util.Calendar startTime)
  {
    this.startTime=startTime;
  }

  public void setCompleteTime(java.util.Calendar completeTime)
  {
    this.completeTime=completeTime;
  }

  public void setEventChainId(int eventChainId)
  {
    this.eventChainId=eventChainId;
  }
}