package com.wordnik.swagger.models.parameters;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface Parameter {
  String getIn();
  void setIn(String in);

  @JsonIgnore
  String getAccess();
  @JsonIgnore
  void setAccess(String access);

  String getName();
  void setName(String name);

  String getDescription();
  void setDescription(String description);

  boolean getRequired();
  void setRequired(boolean required);
}