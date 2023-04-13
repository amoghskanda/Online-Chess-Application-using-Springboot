package com.model;

    public class ChessPiece {
        private String type;
        private String color;
        private int x;
        private int y;
    
        public ChessPiece(String type, String color, int x, int y) {
            this.type = type;
            this.color = color;
            this.x = x;
            this.y = y;
        }
    
        public String getType() {
            return type;
        }
    
        public void setType(String type) {
            this.type = type;
        }
    
        public String getColor() {
            return color;
        }
    
        public void setColor(String color) {
            this.color = color;
        }
    
        public int getX() {
            return x;
        }
    
        public void setX(int x) {
            this.x = x;
        }
    
        public int getY() {
            return y;
        }
    
        public void setY(int y) {
            this.y = y;
        }
    }
    
    

