package com.github.uwa9k073.praktika_6.prototype;


import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message implements Copyable {
  private UUID id;
  private UUID chatId;
  private UUID ownerId;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private String payload;

  @Override
  public Copyable copy() {
    return new Message(id, chatId, ownerId, createdAt, updatedAt, payload);
  }
}
