package com.alex.lox;

import java.util.List;

public class Parser {
  private final List<Token> tokens;
  private int current = 0;

  Parser(List<Token> tokens) {
    this.tokens = tokens;
  }
  private Expr expression() {
    return equality();
  }
}
