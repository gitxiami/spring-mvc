package com.demo.rabbitmq;import lombok.extern.slf4j.Slf4j;import org.springframework.amqp.core.Message;import org.springframework.amqp.core.MessageListener;/** * Created by on 16/3/11. */@Slf4jpublic class MessageConsumeService implements MessageListener {	// message的业务的消费    public void onMessage(Message message) {        log.info(new String(message.getBody()));    }}