package com.goyello.esa.storage;

import java.util.Collection;

import com.goyello.esa.model.Message;

public interface MessageStorage {

	Message findMessage(long id);

	Collection<Message> findAllMessages();

	void addMessage(Message message);

	void setDelegate(MessageStorage storageDelegate);
}
